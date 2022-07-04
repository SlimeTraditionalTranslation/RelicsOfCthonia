package ne.fnfal113.relicsofcthonia.listeners;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import ne.fnfal113.relicsofcthonia.relics.abstracts.AbstractRelic;
import ne.fnfal113.relicsofcthonia.utils.Utils;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;
import java.util.Optional;

public class RelicPlaceBreakListener implements Listener {

    @EventHandler
    public void onRelicClick(PlayerInteractEvent event){
        if(event.isCancelled()){
            return;
        }

        if(event.getAction() != Action.RIGHT_CLICK_BLOCK || event.getHand() == EquipmentSlot.OFF_HAND){
            return;
        }

        if(event.getClickedBlock() == null){
            return;
        }

        Block clickedBlock = event.getClickedBlock();
        Player player = event.getPlayer();

        Optional<SlimefunItem> relic = Optional.ofNullable(BlockStorage.check(clickedBlock));

        relic.ifPresent(item -> {
            if(item instanceof AbstractRelic){
                event.setCancelled(true);

                AbstractRelic abstractRelic = (AbstractRelic) item;
                String value = BlockStorage.getLocationInfo(clickedBlock.getLocation(), "relic_condition");

                if(!Objects.equals(BlockStorage.getLocationInfo(clickedBlock.getLocation(), "owner"), player.getUniqueId().toString())){
                    player.sendMessage(Utils.colorTranslator("&6嘿, 你不是這個遺物的持有者!"));
                    return;
                }

                ItemStack itemStack = abstractRelic.setRelicCondition(false, Integer.parseInt(value));

                BlockStorage.clearBlockInfo(clickedBlock);
                clickedBlock.setType(Material.AIR);

                if(player.getInventory().firstEmpty() == -1){
                    clickedBlock.getWorld().dropItemNaturally(clickedBlock.getLocation(), itemStack.clone());
                    return;
                }

                player.getInventory().addItem(itemStack.clone());
            }
        });

    }

    @EventHandler
    public void onRelicPlace(BlockPlaceEvent event){
        if(event.isCancelled()){
            return;
        }

        Block blockPlaced = event.getBlockPlaced();
        ItemStack itemInHand = event.getItemInHand();

        Optional<SlimefunItem> relic = Optional.ofNullable(SlimefunItem.getByItem(itemInHand));

        relic.ifPresent(item -> {
            if(item instanceof AbstractRelic){
                AbstractRelic abstractRelic = (AbstractRelic) item;
                String value = String.valueOf(abstractRelic.getRelicCondition(itemInHand));

                BlockStorage.addBlockInfo(blockPlaced, "relic_condition", value);
                BlockStorage.addBlockInfo(blockPlaced, "owner", event.getPlayer().getUniqueId().toString());
            }
        });

    }

    @EventHandler
    public void onRelicBreak(BlockBreakEvent event){
        if(event.isCancelled()){
            return;
        }

        Block blockBroken = event.getBlock();
        Player player = event.getPlayer();

        Optional<SlimefunItem> relic = Optional.ofNullable(BlockStorage.check(blockBroken));

        relic.ifPresent(item -> {
            if(item instanceof AbstractRelic){
                event.setCancelled(true);
                BlockStorage.clearBlockInfo(blockBroken);
                blockBroken.setType(Material.AIR);

                player.sendMessage(Utils.colorTranslator("&6你破壞了遺物! 下次記得用右鍵將遺物撿起."));
            }
        });

    }

}