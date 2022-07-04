package ne.fnfal113.relicsofcthonia.listeners;

import lombok.Getter;
import ne.fnfal113.relicsofcthonia.RelicsOfCthonia;
import ne.fnfal113.relicsofcthonia.relics.abstracts.AbstractRelic;
import ne.fnfal113.relicsofcthonia.utils.Utils;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class MobKillListener implements Listener {

    @Getter
    private final Map<AbstractRelic, List<String>> whereToDropMobMap = RelicsOfCthonia.getInstance().getRelicsRegistry().getWhereToDropMobMap();

    @EventHandler
    public void onMobKill(EntityDeathEvent event) {
        LivingEntity livingEntity = event.getEntity();

        if(!livingEntity.getWorld().getName().equals("world_nether")){
            return;
        }

        if(livingEntity.getKiller() == null){
            return;
        }

        String entityType = livingEntity.getType().name().toLowerCase();

        ThreadLocalRandom currentRandomThread = ThreadLocalRandom.current();
        AtomicInteger i = new AtomicInteger(0);

        Utils.createAsyncTask(asyncTask -> {
            for (Map.Entry<AbstractRelic, List<String>> entry: getWhereToDropMobMap().entrySet()){
                if(entry.getValue().contains(entityType)){
                    double randomOrigin = currentRandomThread.nextDouble(0.0, 60);
                    double randomNum = currentRandomThread.nextDouble(randomOrigin, 100);

                    if(randomNum < entry.getKey().getDropChance()) {
                        ItemStack drop = entry.getKey().setRelicCondition(true, 0);
                        Utils.createSyncTask(syncTask -> livingEntity.getWorld().dropItemNaturally(livingEntity.getLocation(), drop));

                        i.getAndIncrement();
                    }

                    // limit to max 2 drops per block only
                    if(i.get() == 2){
                        return;
                    }
                }
            }
        });

    }

}