package ne.fnfal113.relicsofcthonia.miscellaneous.relicvoiders;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import ne.fnfal113.relicsofcthonia.miscellaneous.abstracts.AbstractRelicVoider;
import ne.fnfal113.relicsofcthonia.relics.implementation.Rarity;
import org.bukkit.inventory.ItemStack;

public class LegendaryRelicVoider extends AbstractRelicVoider {

    public LegendaryRelicVoider(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe, Rarity.LEGENDARY);
    }

}