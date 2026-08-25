package willi.js.buildingutilities.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import willi.js.buildingutilities.blocks.ModBlocks;

import java.util.List;

public class TuffFamilyRecipes extends AbstractBlockFamilyRecipes {
    public TuffFamilyRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    public void buildRecipes() {
        List<ItemLike> tuffFamily = List.of(Blocks.TUFF, Blocks.POLISHED_TUFF, Blocks.TUFF_BRICKS, Blocks.CHISELED_TUFF, Blocks.CHISELED_TUFF_BRICKS, ModBlocks.SMOOTH_POLISHED_TUFF);

        //tuff
        stonecutterFromBases(Blocks.POLISHED_TUFF, List.of(Blocks.TUFF_BRICKS, ModBlocks.SMOOTH_POLISHED_TUFF));
        stonecutterFromBases(Blocks.POLISHED_TUFF_SLAB, List.of(Blocks.TUFF_BRICKS, ModBlocks.SMOOTH_POLISHED_TUFF), 2);
        stonecutterFromBases(Blocks.POLISHED_TUFF_STAIRS, List.of(Blocks.TUFF_BRICKS, ModBlocks.SMOOTH_POLISHED_TUFF));
        stonecutterFromBases(Blocks.POLISHED_TUFF_WALL, List.of(Blocks.TUFF_BRICKS, ModBlocks.SMOOTH_POLISHED_TUFF));

        //smooth polished
        stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_TUFF, removeFromFamily(tuffFamily, ModBlocks.SMOOTH_POLISHED_TUFF));
    }
}
