package willi.js.buildingutilities.datagen.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;

import static willi.js.buildingutilities.SirWilliJsBuildingUtilities.id;

public class BeeNestRecipe extends AbstractBlockFamilyRecipes{
    public BeeNestRecipe(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    public void buildRecipes() {
        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.BEE_NEST)
                .requires(Items.WHEAT, 4)
                .requires(Items.HONEYCOMB, 4)
                .unlockedBy(getItemName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                .save(output, id("bee_nest_from_honeycomb").getPath());
    }
}
