package ne.fnfal113.relicsofcthonia.relics.items.legendary;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import ne.fnfal113.relicsofcthonia.relics.abstracts.AbstractRelic;
import ne.fnfal113.relicsofcthonia.relics.implementation.Rarity;
import ne.fnfal113.relicsofcthonia.utils.Utils;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

public class EyeOfSauron extends AbstractRelic {

    @ParametersAreNonnullByDefault
    public EyeOfSauron(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                        double dropChance, int piglinRewardAmount, int defaultDropSize) {
        super(itemGroup, item, recipeType, recipe, dropChance, piglinRewardAmount, defaultDropSize);
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public void onItemRightClick(PlayerInteractEvent event, Player player, ItemStack itemInOffhand) {
        List<Player> playerList = new ArrayList<>();

        for (Entity en : player.getNearbyEntities(100, 60, 100)) {
            if(en instanceof Player){
                int x = (int) player.getLocation().getX();
                int y = (int) player.getLocation().getY();
                int z = (int) player.getLocation().getZ();

                playerList.add((Player) en);
                Utils.sendRelicMessage("&e索倫之眼在附近發現了一名叫做 " + player.getName() + " 在 x: " + x + " y: " + y + " z: " + z, player);
            }
        }

        if(playerList.isEmpty()){
            Utils.sendRelicMessage("&e索倫之眼無法找到附近的玩家!", player);
        }

        consumeRelic(itemInOffhand);
    }
}