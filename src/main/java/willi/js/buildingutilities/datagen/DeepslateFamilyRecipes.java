package willi.js.buildingutilities.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import willi.js.buildingutilities.blocks.ModBlocks;

import java.util.List;

public class DeepslateFamilyRecipes extends AbstractBlockFamilyRecipes {
    public DeepslateFamilyRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    public void buildRecipes() {
        List<ItemLike> deepslateFamily = List.of(Blocks.DEEPSLATE, Blocks.POLISHED_DEEPSLATE, Blocks.DEEPSLATE_BRICKS, ModBlocks.SMOOTH_POLISHED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE);

        //deepslate
        stonecutterFromBases(Blocks.POLISHED_DEEPSLATE, List.of(ModBlocks.SMOOTH_POLISHED_DEEPSLATE));
        stonecutterFromBases(Blocks.POLISHED_DEEPSLATE_SLAB, List.of(ModBlocks.SMOOTH_POLISHED_DEEPSLATE));
        stonecutterFromBases(Blocks.POLISHED_DEEPSLATE_STAIRS, List.of(ModBlocks.SMOOTH_POLISHED_DEEPSLATE));
        stonecutterFromBases(Blocks.POLISHED_DEEPSLATE_WALL, List.of(ModBlocks.SMOOTH_POLISHED_DEEPSLATE));

        //smooth polished
        stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_DEEPSLATE, removeFromFamily(deepslateFamily, ModBlocks.SMOOTH_POLISHED_DEEPSLATE));
    }
}
