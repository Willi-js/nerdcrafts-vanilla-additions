package willi.js.buildingutilities.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import willi.js.buildingutilities.blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.ANDESITE_BRICKS);
        dropSelf(ModBlocks.DIORITE_BRICKS);
        dropSelf(ModBlocks.GRANITE_BRICKS);

        dropSelf(ModBlocks.ANDESITE_BRICK_STAIRS);
        dropSelf(ModBlocks.DIORITE_BRICK_STAIRS);
        dropSelf(ModBlocks.GRANITE_BRICK_STAIRS);

        dropSelf(ModBlocks.ANDESITE_BRICK_WALL);
        dropSelf(ModBlocks.DIORITE_BRICK_WALL);
        dropSelf(ModBlocks.GRANITE_BRICK_WALL);

        dropSelf(ModBlocks.POLISHED_ANDESITE_WALL);
        dropSelf(ModBlocks.POLISHED_DIORITE_WALL);
        dropSelf(ModBlocks.POLISHED_GRANITE_WALL);

        add(ModBlocks.ANDESITE_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.DIORITE_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.GRANITE_BRICK_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.SMOOTH_POLISHED_GRANITE);
        dropSelf(ModBlocks.SMOOTH_POLISHED_ANDESITE);
        dropSelf(ModBlocks.SMOOTH_POLISHED_DIORITE);
        dropSelf(ModBlocks.SMOOTH_POLISHED_TUFF);
        dropSelf(ModBlocks.SMOOTH_POLISHED_BLACKSTONE);
        dropSelf(ModBlocks.SMOOTH_POLISHED_DEEPSLATE);

    }
}
