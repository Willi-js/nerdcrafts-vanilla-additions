package willi.js.buildingutilities.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import willi.js.buildingutilities.blocks.ModBlocks;

import java.util.List;

public class BlackstoneFamilyRecipes extends AbstractBlockFamilyRecipes {
    public BlackstoneFamilyRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    public void buildRecipes() {
        List<ItemLike> blackStoneFamily = List.of(Blocks.BLACKSTONE, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.SMOOTH_POLISHED_BLACKSTONE);

        //blackstone
        stonecutterFromBases(Blocks.POLISHED_BLACKSTONE, List.of(ModBlocks.SMOOTH_POLISHED_BLACKSTONE));
        stonecutterFromBases(Blocks.POLISHED_BLACKSTONE_SLAB, List.of(ModBlocks.SMOOTH_POLISHED_BLACKSTONE));
        stonecutterFromBases(Blocks.POLISHED_BLACKSTONE_STAIRS, List.of(ModBlocks.SMOOTH_POLISHED_BLACKSTONE));
        stonecutterFromBases(Blocks.POLISHED_BLACKSTONE_WALL, List.of(ModBlocks.SMOOTH_POLISHED_BLACKSTONE));

        //smooth polished
        stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_BLACKSTONE, removeFromFamily(blackStoneFamily, ModBlocks.SMOOTH_POLISHED_BLACKSTONE));
    }
}
