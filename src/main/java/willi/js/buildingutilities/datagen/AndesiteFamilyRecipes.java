package willi.js.buildingutilities.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import willi.js.buildingutilities.blocks.ModBlocks;

import java.util.List;

public class AndesiteFamilyRecipes extends AbstractBlockFamilyRecipes {
    public AndesiteFamilyRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    public void buildRecipes() {
        List<ItemLike> andesiteFamily = List.of(Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, ModBlocks.ANDESITE_BRICKS, ModBlocks.SMOOTH_POLISHED_ANDESITE);

        //andesite bricks
        stonecutterFromBases(ModBlocks.ANDESITE_BRICKS, removeFromFamily(andesiteFamily, ModBlocks.ANDESITE_BRICKS));
        stonecutterFromBases(ModBlocks.ANDESITE_BRICK_STAIRS, andesiteFamily);
        stonecutterFromBases(ModBlocks.ANDESITE_BRICK_SLAB, andesiteFamily, 2);
        stonecutterFromBases(ModBlocks.ANDESITE_BRICK_WALL, andesiteFamily);

        //bricks back to polished
        stonecutterFromBases(Blocks.POLISHED_ANDESITE, List.of(ModBlocks.ANDESITE_BRICKS));
        stonecutterFromBases(Blocks.POLISHED_ANDESITE_SLAB, List.of(ModBlocks.ANDESITE_BRICKS), 2);
        stonecutterFromBases(Blocks.POLISHED_ANDESITE_STAIRS, List.of(ModBlocks.ANDESITE_BRICKS));

        //polished walls
        stonecutterFromBases(ModBlocks.POLISHED_ANDESITE_WALL, andesiteFamily);

        //smooth polished
        stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_ANDESITE, removeFromFamily(andesiteFamily, ModBlocks.SMOOTH_POLISHED_ANDESITE));
    }
}
