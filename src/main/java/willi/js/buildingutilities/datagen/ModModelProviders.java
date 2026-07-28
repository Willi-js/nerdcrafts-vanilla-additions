package willi.js.buildingutilities.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.world.level.block.Blocks;
import willi.js.buildingutilities.blocks.ModBlocks;

public class ModModelProviders extends FabricModelProvider {

    public ModModelProviders(FabricPackOutput fabricDataGenerator) {
        super(fabricDataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

        blockModelGenerators.family(ModBlocks.ANDESITE_BRICKS)
                .stairs(ModBlocks.ANDESITE_BRICK_STAIRS)
                .slab(ModBlocks.ANDESITE_BRICK_SLAB)
                .wall(ModBlocks.ANDESITE_BRICK_WALL);

        blockModelGenerators.family(ModBlocks.DIORITE_BRICKS)
                .stairs(ModBlocks.DIORITE_BRICK_STAIRS)
                .slab(ModBlocks.DIORITE_BRICK_SLAB)
                .wall(ModBlocks.DIORITE_BRICK_WALL);

        blockModelGenerators.family(ModBlocks.GRANITE_BRICKS)
                .stairs(ModBlocks.GRANITE_BRICK_STAIRS)
                .slab(ModBlocks.GRANITE_BRICK_SLAB)
                .wall(ModBlocks.GRANITE_BRICK_WALL);


        blockModelGenerators.family(Blocks.POLISHED_ANDESITE)
                .wall(ModBlocks.POLISHED_ANDESITE_WALL);

        blockModelGenerators.family(Blocks.POLISHED_DIORITE)
                .wall(ModBlocks.POLISHED_DIORITE_WALL);

        blockModelGenerators.family(Blocks.POLISHED_GRANITE)
                .wall(ModBlocks.POLISHED_GRANITE_WALL);

        blockModelGenerators.family(ModBlocks.SMOOTH_POLISHED_GRANITE);
        blockModelGenerators.family(ModBlocks.SMOOTH_POLISHED_ANDESITE);
        blockModelGenerators.family(ModBlocks.SMOOTH_POLISHED_DIORITE);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }
}
