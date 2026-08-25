package willi.js.buildingutilities.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import willi.js.buildingutilities.blocks.ModBlocks;

import java.util.List;

public class DioriteFamilyRecipes extends AbstractBlockFamilyRecipes {
    public DioriteFamilyRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    public void buildRecipes() {
        List<ItemLike> dioriteFamily = List.of(Blocks.DIORITE, Blocks.POLISHED_DIORITE, ModBlocks.DIORITE_BRICKS, ModBlocks.SMOOTH_POLISHED_DIORITE);

        //diorite bricks
        stonecutterFromBases(ModBlocks.DIORITE_BRICKS, removeFromFamily(dioriteFamily, ModBlocks.DIORITE_BRICKS));
        stonecutterFromBases(ModBlocks.DIORITE_BRICK_STAIRS, dioriteFamily);
        stonecutterFromBases(ModBlocks.DIORITE_BRICK_SLAB, dioriteFamily, 2);
        stonecutterFromBases(ModBlocks.DIORITE_BRICK_WALL, dioriteFamily);

        //bricks back to polished
        stonecutterFromBases(Blocks.POLISHED_DIORITE, List.of(ModBlocks.DIORITE_BRICKS));
        stonecutterFromBases(Blocks.POLISHED_DIORITE_SLAB, List.of(ModBlocks.DIORITE_BRICKS), 2);
        stonecutterFromBases(Blocks.POLISHED_DIORITE_STAIRS, List.of(ModBlocks.DIORITE_BRICKS));

        //polished walls
        stonecutterFromBases(ModBlocks.POLISHED_DIORITE_WALL, dioriteFamily);

        //smooth polished
        stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_DIORITE, removeFromFamily(dioriteFamily, ModBlocks.SMOOTH_POLISHED_DIORITE));
    }
}
