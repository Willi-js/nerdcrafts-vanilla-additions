package willi.js.buildingutilities.datagen.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;

import static willi.js.buildingutilities.SirWilliJsBuildingUtilities.id;

public class AmethystRecipes extends AbstractBlockFamilyRecipes{
    public AmethystRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    public void buildRecipes() {
        // Amethyst Buds
        shapeless(RecipeCategory.DECORATIONS, Items.SMALL_AMETHYST_BUD)
                .requires(Items.AMETHYST_SHARD, 1)
                .unlockedBy(getItemName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(output, id("small_amethyst_bud_from_shard").getPath());

        shapeless(RecipeCategory.DECORATIONS, Items.MEDIUM_AMETHYST_BUD)
                .requires(Items.AMETHYST_SHARD, 2)
                .unlockedBy(getItemName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(output, id("medium_amethyst_bud_from_shard").getPath());

        shapeless(RecipeCategory.DECORATIONS, Items.LARGE_AMETHYST_BUD)
                .requires(Items.AMETHYST_SHARD, 3)
                .unlockedBy(getItemName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(output, id("large_amethyst_bud_from_shard").getPath());

        shapeless(RecipeCategory.DECORATIONS, Items.AMETHYST_CLUSTER)
                .requires(Items.AMETHYST_SHARD, 4)
                .unlockedBy(getItemName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                .save(output, id("amethyst_cluster_from_shard").getPath());
    }
}
