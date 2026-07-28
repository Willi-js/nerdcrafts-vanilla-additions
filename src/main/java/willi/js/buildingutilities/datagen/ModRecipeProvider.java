package willi.js.buildingutilities.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import willi.js.buildingutilities.blocks.ModBlocks;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> andesiteBases = List.of(Blocks.ANDESITE, Blocks.POLISHED_ANDESITE);
                List<ItemLike> andesiteFamily = List.of(Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, ModBlocks.ANDESITE_BRICKS);
                List<ItemLike> dioriteBases = List.of(Blocks.DIORITE, Blocks.POLISHED_DIORITE);
                List<ItemLike> dioriteFamily = List.of(Blocks.DIORITE, Blocks.POLISHED_DIORITE, ModBlocks.DIORITE_BRICKS);
                List<ItemLike> graniteBases = List.of(Blocks.GRANITE, Blocks.POLISHED_GRANITE);
                List<ItemLike> graniteFamily = List.of(Blocks.GRANITE, Blocks.POLISHED_GRANITE, ModBlocks.GRANITE_BRICKS);
                List<ItemLike> polishedAndesiteFamily = List.of(Blocks.POLISHED_ANDESITE, ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);
                List<ItemLike> polishedDioriteFamily = List.of(Blocks.POLISHED_DIORITE, ModBlocks.DIORITE_BRICKS, Blocks.DIORITE);
                List<ItemLike> polishedGraniteFamily = List.of(Blocks.POLISHED_GRANITE, ModBlocks.GRANITE_BRICKS, Blocks.GRANITE);
                List<ItemLike> tuffBricks = List.of(Blocks.TUFF_BRICKS);

                //andesite bricks
                stonecutterFromBases(ModBlocks.ANDESITE_BRICKS, andesiteBases);
                stonecutterFromBases(ModBlocks.ANDESITE_BRICK_STAIRS, andesiteFamily);
                stonecutterFromBases(ModBlocks.ANDESITE_BRICK_SLAB, andesiteFamily, 2);
                stonecutterFromBases(ModBlocks.ANDESITE_BRICK_WALL, andesiteFamily);

                //diorite bricks
                stonecutterFromBases(ModBlocks.DIORITE_BRICKS, dioriteBases);
                stonecutterFromBases(ModBlocks.DIORITE_BRICK_STAIRS, dioriteFamily);
                stonecutterFromBases(ModBlocks.DIORITE_BRICK_SLAB, dioriteFamily, 2);
                stonecutterFromBases(ModBlocks.DIORITE_BRICK_WALL, dioriteFamily);

                //granite bricks
                stonecutterFromBases(ModBlocks.GRANITE_BRICKS, graniteBases);
                stonecutterFromBases(ModBlocks.GRANITE_BRICK_STAIRS, graniteFamily);
                stonecutterFromBases(ModBlocks.GRANITE_BRICK_SLAB, graniteFamily, 2);
                stonecutterFromBases(ModBlocks.GRANITE_BRICK_WALL, graniteFamily);

                //bricks back to polished
                stonecutterFromBases(Blocks.POLISHED_ANDESITE, List.of(ModBlocks.ANDESITE_BRICKS));
                stonecutterFromBases(Blocks.POLISHED_DIORITE, List.of(ModBlocks.DIORITE_BRICKS));
                stonecutterFromBases(Blocks.POLISHED_GRANITE, List.of(ModBlocks.GRANITE_BRICKS));
                stonecutterFromBases(Blocks.POLISHED_ANDESITE_SLAB, List.of(ModBlocks.ANDESITE_BRICKS), 2);
                stonecutterFromBases(Blocks.POLISHED_DIORITE_SLAB, List.of(ModBlocks.DIORITE_BRICKS), 2);
                stonecutterFromBases(Blocks.POLISHED_GRANITE_SLAB, List.of(ModBlocks.GRANITE_BRICKS), 2);
                stonecutterFromBases(Blocks.POLISHED_ANDESITE_STAIRS, List.of(ModBlocks.ANDESITE_BRICKS));
                stonecutterFromBases(Blocks.POLISHED_DIORITE_STAIRS, List.of(ModBlocks.DIORITE_BRICKS));
                stonecutterFromBases(Blocks.POLISHED_GRANITE_STAIRS, List.of(ModBlocks.GRANITE_BRICKS));

                //tuff
                stonecutterFromBases(Blocks.POLISHED_TUFF, tuffBricks);
                stonecutterFromBases(Blocks.POLISHED_TUFF_SLAB, tuffBricks, 2);
                stonecutterFromBases(Blocks.POLISHED_TUFF_STAIRS, tuffBricks);
                stonecutterFromBases(Blocks.POLISHED_TUFF_WALL, tuffBricks);

                //polished walls
                stonecutterFromBases(ModBlocks.POLISHED_ANDESITE_WALL, polishedAndesiteFamily);
                stonecutterFromBases(ModBlocks.POLISHED_DIORITE_WALL, polishedDioriteFamily);
                stonecutterFromBases(ModBlocks.POLISHED_GRANITE_WALL, polishedGraniteFamily);

                //smooth polished
                stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_GRANITE, polishedGraniteFamily);
                stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_DIORITE, polishedDioriteFamily);
                stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_ANDESITE, polishedAndesiteFamily);
            }

            private void stonecutterFromBases(ItemLike result, List<? extends ItemLike> bases) {
                stonecutterFromBases(result, bases, 1);
            }

            private void stonecutterFromBases(ItemLike result, List<? extends ItemLike> bases, int count) {
                for (ItemLike base : bases) {
                    stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, result, base, count);
                }
            }
        };
    }

    @Override
    public String getName() {
        return "Willi.js Building Utilities";
    }
}
