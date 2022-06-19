package ne.fnfal113.relicsofcthonia.relics.items.common;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import ne.fnfal113.relicsofcthonia.relics.abstracts.AbstractRelic;
import ne.fnfal113.relicsofcthonia.relics.implementation.Rarity;
import ne.fnfal113.relicsofcthonia.utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

public class PettyMarbleBlock extends AbstractRelic {

    @ParametersAreNonnullByDefault
    public PettyMarbleBlock(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                         double dropChance, int piglinRewardAmount, int defaultDropSize) {
        super(itemGroup, item, recipeType, recipe, dropChance, piglinRewardAmount, defaultDropSize);
    }

    @Override
    public Rarity getRarity() {
        return Rarity.COMMON;
    }

    @Override
    public void onItemRightClick(PlayerInteractEvent event, Player player, ItemStack itemInOffhand) {
        Utils.sendRelicMessage("&e這個小型大理石塊沒有任何作用! 你可以拿去交易來換取一些東西.", player);
    }

}
