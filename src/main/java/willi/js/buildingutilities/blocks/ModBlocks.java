package willi.js.buildingutilities.blocks;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import willi.js.buildingutilities.SirWilliJsBuildingUtilities;

import java.util.function.Function;

public class ModBlocks {

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks", prop ->
            new Block(prop.strength(1.5F)
                .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks", prop ->
            new Block(prop.strength(1.5F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks", prop ->
            new Block(prop.strength(1.5F)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));


    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs", prop ->
            new StairBlock(ModBlocks.ANDESITE_BRICKS.defaultBlockState(),
                    prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs", prop ->
            new StairBlock(ModBlocks.DIORITE_BRICKS.defaultBlockState(),
                    prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs", prop ->
            new StairBlock(ModBlocks.GRANITE_BRICKS.defaultBlockState(),
                    prop.strength(1.5F).requiresCorrectToolForDrops()));


    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab", prop ->
            new SlabBlock(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab", prop ->
            new SlabBlock(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab", prop ->
            new SlabBlock(prop.strength(1.5F).requiresCorrectToolForDrops()));


    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall", prop ->
            new WallBlock(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall", prop ->
            new WallBlock(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall", prop ->
            new WallBlock(prop.strength(1.5F).requiresCorrectToolForDrops()));

    //vanilla improvements

    public static final Block POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall", prop ->
            new WallBlock(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall", prop ->
            new WallBlock(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall", prop ->
            new WallBlock(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block SMOOTH_POLISHED_GRANITE = registerBlock("smooth_polished_granite", prop ->
            new Block(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block SMOOTH_POLISHED_ANDESITE = registerBlock("smooth_polished_andesite", prop ->
            new Block(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block SMOOTH_POLISHED_DIORITE = registerBlock("smooth_polished_diorite", prop ->
            new Block(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block SMOOTH_POLISHED_TUFF = registerBlock("smooth_polished_tuff", prop ->
            new Block(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block SMOOTH_POLISHED_BLACKSTONE = registerBlock("smooth_polished_blackstone", prop ->
            new Block(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block SMOOTH_POLISHED_DEEPSLATE = registerBlock("smooth_polished_deepslate", prop ->
            new Block(prop.strength(1.5F).requiresCorrectToolForDrops()));


    // calcite
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs", prop ->
            new StairBlock(Blocks.CALCITE.defaultBlockState() ,prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block CALCITE_SLAB = registerBlock("calcite_slab", prop ->
            new SlabBlock(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static final Block CALCITE_WALL = registerBlock("calcite_wall", prop ->
            new WallBlock(prop.strength(1.5F).requiresCorrectToolForDrops()));

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, SirWilliJsBuildingUtilities.id(name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, SirWilliJsBuildingUtilities.id(name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, SirWilliJsBuildingUtilities.id(name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, SirWilliJsBuildingUtilities.id(name)))));
    }

    public static void registerBlocks() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(output -> {

            output.accept(ANDESITE_BRICKS);
            output.accept(ANDESITE_BRICK_STAIRS);
            output.accept(ANDESITE_BRICK_SLAB);
            output.accept(ANDESITE_BRICK_WALL);

            output.accept(POLISHED_ANDESITE_WALL);

            output.accept(DIORITE_BRICKS);
            output.accept(DIORITE_BRICK_STAIRS);
            output.accept(DIORITE_BRICK_SLAB);
            output.accept(DIORITE_BRICK_WALL);

            output.accept(POLISHED_DIORITE_WALL);

            output.accept(GRANITE_BRICKS);
            output.accept(GRANITE_BRICK_STAIRS);
            output.accept(GRANITE_BRICK_SLAB);
            output.accept(GRANITE_BRICK_WALL);

            output.accept(POLISHED_GRANITE_WALL);

            output.accept(SMOOTH_POLISHED_GRANITE);
            output.accept(SMOOTH_POLISHED_ANDESITE);
            output.accept(SMOOTH_POLISHED_DIORITE);

            output.accept(SMOOTH_POLISHED_TUFF);
            output.accept(SMOOTH_POLISHED_BLACKSTONE);
            output.accept(SMOOTH_POLISHED_DEEPSLATE);

            output.accept(CALCITE_STAIRS);
            output.accept(CALCITE_SLAB);
            output.accept(CALCITE_WALL);

        });
    }
}
