package ne.fnfal113.relicsofcthonia.listeners;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.implementation.items.misc.StrangeNetherGoo;
import lombok.Getter;
import ne.fnfal113.relicsofcthonia.RelicsOfCthonia;
import ne.fnfal113.relicsofcthonia.relics.abstracts.AbstractRelic;
import ne.fnfal113.relicsofcthonia.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityDropItemEvent;
import org.bukkit.event.entity.PiglinBarterEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class PiglinMainListener implements Listener {

    @Getter
    private final Map<UUID, UUID> currentTradeMap = new HashMap<>();

    @EventHandler
    public void onPiglinRightClick(PlayerInteractEntityEvent event){
        if(event.isCancelled()){
            return;
        }

        if(!(event.getRightClicked() instanceof Piglin)){
            return;
        }

        Piglin piglin = (Piglin) event.getRightClicked();
        Player player = event.getPlayer();

        if (event.getHand() == EquipmentSlot.OFF_HAND) {
            return;
        }

        if(!piglin.isAdult()){
            return;
        }

        if (piglin.hasMetadata("NPC")) {
            return;
        }

        if(piglin.hasMetadata("relic_trader")){
            Utils.sendRelicMessage("&e豬布林正在交易中!", player);
            event.setCancelled(true);
            return;
        }

        ItemStack mainHandItem = player.getInventory().getItemInMainHand();
        Optional<SlimefunItem> sfItem = Optional.ofNullable(SlimefunItem.getByItem(mainHandItem));

        if(!sfItem.isPresent()){
            return;
        }

        if(sfItem.get() instanceof AbstractRelic){
            piglin.addBarterMaterial(mainHandItem.getType());
            piglin.setMetadata("relic_trader", new FixedMetadataValue(RelicsOfCthonia.getInstance(), "trading"));
            getCurrentTradeMap().put(piglin.getUniqueId(), player.getUniqueId());

            Utils.createDelayedTask(task ->{
                piglin.setAI(false);
                piglin.setInvulnerable(true);
                piglin.setGlowing(true);

                EntityEquipment entityEquipment = piglin.getEquipment();
                entityEquipment.setItemInOffHand(mainHandItem);
                mainHandItem.setAmount(mainHandItem.getAmount() - 1);

                Location loc = piglin.getLocation().clone();
                loc.setPitch(47.0F);
                piglin.teleport(loc);
            }, 2L);

            Utils.createDelayedTask(task -> {
                Location loc = piglin.getLocation().clone();
                loc.setDirection(player.getLocation().getDirection().multiply(-1));
                piglin.teleport(loc);
            }, 25L);

            Utils.createDelayedTask(task -> {
                Location loc = piglin.getLocation().clone();
                loc.setPitch(47.0F);
                piglin.teleport(loc);
            }, 45L);

            Utils.createDelayedTask(task -> {
                piglin.setAI(true);
                piglin.setInvulnerable(false);
                piglin.setGlowing(false);
            }, 90L);

            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onDrop(EntityDropItemEvent event){
        if(!(event.getEntity() instanceof Piglin)){
            return;
        }

        if(!event.getEntity().hasMetadata("relic_trader")){
            return;
        }

        removePiglinMetadata((Piglin) event.getEntity());
        ItemStack itemStack = event.getItemDrop().getItemStack();

        // we prevent slimefun from converting barter drops if the
        // piglin has the metadata during the barter
        if(SlimefunItem.getByItem(itemStack) instanceof StrangeNetherGoo){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onBarter(PiglinBarterEvent event){
        if(!event.getEntity().hasMetadata("relic_trader")){
            return;
        }

        Piglin piglin = event.getEntity();

        if(event.isCancelled()){
            // if canceled call necessary callbacks
            removeBarterMaterial(event);
            removePiglinMetadata(piglin);
            executeTradeMessage(event, "&c交易失敗! 目前位置不允許豬布林交易");

            return;
        }

        Optional<SlimefunItem> sfItem = Optional.ofNullable(SlimefunItem.getByItem(event.getInput()));

        if(!sfItem.isPresent()){
            // if not present call necessary callbacks
            removeBarterMaterial(event);
            executeTradeMessage(event, "&c交易失敗! 你給的以物換物物品並不是克托尼亞遺物");

            return;
        }

        if(sfItem.get() instanceof AbstractRelic){
            AbstractRelic relic = (AbstractRelic) sfItem.get();
            int relicCondition = relic.getRelicCondition(event.getInput());
            boolean haveCondition = relicCondition != 0;

            if(ThreadLocalRandom.current().nextInt(0, 100) > relicCondition && haveCondition){
                removeBarterMaterial(event);
                executeTradeMessage(event, "&c交易失敗! 豬布林對遺物狀態不滿意!");

                return;
            }

            if(!relic.getPiglinRewardList().isEmpty()){
                List<String> rewardList = relic.getPiglinRewardList();

                int randomRewardIndex = ThreadLocalRandom.current().nextInt(1, rewardList.size() + 1);
                int rewardAmount = relic.getPiglinRewardAmount();

                String item = rewardList.get(randomRewardIndex - 1);

                Optional<SlimefunItem> sfRewardItem = Optional.ofNullable(SlimefunItem.getById(item));
                Optional<Material> rewardItem = Optional.ofNullable(Material.matchMaterial(item));

                removeBarterMaterial(event);
                event.getOutcome().clear();

                rewardItem.ifPresent(material -> event.getOutcome().add(new ItemStack(material, rewardAmount)));
                sfRewardItem.ifPresent(slimefunItem -> {
                    ItemStack finalReward = new ItemStack(slimefunItem.getItem());
                    finalReward.setAmount(rewardAmount);
                    event.getOutcome().add(finalReward.clone());
                });

                executeTradeMessage(event, "&a交易成功! 豬布林很樂意隨時與你再度進行交易!");
                piglin.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, piglin.getLocation().add(0, 2.2, 0), 0);
                piglin.getWorld().playSound(piglin.getLocation(), Sound.ENTITY_PIGLIN_ADMIRING_ITEM, 1.0F, 1.0F);

                if(!haveCondition){
                    executeTradeMessage(event, "&a交易成功! 遺物是從黏液科技的給予指令所獲得的!");
                }

            } else {
                removeBarterMaterial(event);
            }
        } // is sf item a relic
    }

    public void removePiglinMetadata(Piglin piglin){
        piglin.removeMetadata("relic_trader", RelicsOfCthonia.getInstance());
    }

    public void removeBarterMaterial(PiglinBarterEvent event){
        event.getEntity().removeBarterMaterial(event.getInput().getType());
    }

    public void executeTradeMessage(PiglinBarterEvent event, String message){
        Optional<Player> player = Optional.ofNullable(Bukkit.getPlayer(getCurrentTradeMap().get(event.getEntity().getUniqueId())));

        getCurrentTradeMap().remove(event.getEntity().getUniqueId());
        player.ifPresent(p -> Utils.sendRelicMessage(message, p));
    }

    @EventHandler
    public void onEntityDeathEvent(EntityDeathEvent e) {
        LivingEntity livingEntity = e.getEntity();
        if (!(livingEntity instanceof Piglin)) {
           return;
        }

        Piglin piglin = (Piglin) livingEntity;

        if (piglin.hasMetadata("relic_trader")) {
            e.getDrops().clear();
            piglin.removeMetadata("relic_trader", RelicsOfCthonia.getInstance());
        }

    }

}