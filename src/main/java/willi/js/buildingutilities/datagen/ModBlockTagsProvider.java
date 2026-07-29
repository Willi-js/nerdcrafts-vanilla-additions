package willi.js.buildingutilities.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import willi.js.buildingutilities.blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {

    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registeryLookupFuture) {
        super(output, registeryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.DIORITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.GRANITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_POLISHED_ANDESITE))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_POLISHED_DIORITE))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_POLISHED_GRANITE))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_POLISHED_TUFF))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_POLISHED_BLACKSTONE))
                .add(ModBlocks.getRK(ModBlocks.SMOOTH_POLISHED_DEEPSLATE))
                .add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.DIORITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.GRANITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.DIORITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.GRANITE_BRICK_SLAB));




        tag(BlockTags.STAIRS)
                .add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.DIORITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.GRANITE_BRICK_STAIRS));

        tag(BlockTags.SLABS)
                .add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.DIORITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.GRANITE_BRICK_SLAB));

        tag(BlockTags.WALLS)
                .add(ModBlocks.getRK(ModBlocks.ANDESITE_BRICK_WALL))
                .add(ModBlocks.getRK(ModBlocks.DIORITE_BRICK_WALL))
                .add(ModBlocks.getRK(ModBlocks.GRANITE_BRICK_WALL))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_ANDESITE_WALL))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_DIORITE_WALL))
                .add(ModBlocks.getRK(ModBlocks.POLISHED_GRANITE_WALL));
    }
}
