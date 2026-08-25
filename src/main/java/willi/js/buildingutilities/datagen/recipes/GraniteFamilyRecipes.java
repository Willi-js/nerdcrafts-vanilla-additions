package willi.js.buildingutilities.datagen.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import willi.js.buildingutilities.blocks.ModBlocks;

import java.util.List;

public class GraniteFamilyRecipes extends AbstractBlockFamilyRecipes {
    public GraniteFamilyRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    public void buildRecipes() {
        List<ItemLike> graniteFamily = List.of(Blocks.GRANITE, Blocks.POLISHED_GRANITE, ModBlocks.GRANITE_BRICKS, ModBlocks.SMOOTH_POLISHED_GRANITE);

        //granite bricks
        stonecutterFromBases(ModBlocks.GRANITE_BRICKS, removeFromFamily(graniteFamily, ModBlocks.GRANITE_BRICKS));
        stonecutterFromBases(ModBlocks.GRANITE_BRICK_STAIRS, graniteFamily);
        stonecutterFromBases(ModBlocks.GRANITE_BRICK_SLAB, graniteFamily, 2);
        stonecutterFromBases(ModBlocks.GRANITE_BRICK_WALL, graniteFamily);

        //bricks back to polished
        stonecutterFromBases(Blocks.POLISHED_GRANITE, List.of(ModBlocks.GRANITE_BRICKS));
        stonecutterFromBases(Blocks.POLISHED_GRANITE_SLAB, List.of(ModBlocks.GRANITE_BRICKS), 2);
        stonecutterFromBases(Blocks.POLISHED_GRANITE_STAIRS, List.of(ModBlocks.GRANITE_BRICKS));

        //polished walls
        stonecutterFromBases(ModBlocks.POLISHED_GRANITE_WALL, graniteFamily);

        //smooth polished
        stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_GRANITE, removeFromFamily(graniteFamily, ModBlocks.SMOOTH_POLISHED_GRANITE));
    }
}
