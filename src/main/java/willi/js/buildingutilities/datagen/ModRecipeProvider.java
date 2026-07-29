package willi.js.buildingutilities.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
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
                List<ItemLike> andesiteFamily = List.of(Blocks.ANDESITE, Blocks.POLISHED_ANDESITE, ModBlocks.ANDESITE_BRICKS, ModBlocks.SMOOTH_POLISHED_ANDESITE);
                List<ItemLike> dioriteFamily = List.of(Blocks.DIORITE, Blocks.POLISHED_DIORITE, ModBlocks.DIORITE_BRICKS, ModBlocks.SMOOTH_POLISHED_DIORITE);
                List<ItemLike> graniteFamily = List.of(Blocks.GRANITE, Blocks.POLISHED_GRANITE, ModBlocks.GRANITE_BRICKS, ModBlocks.SMOOTH_POLISHED_GRANITE);
                List<ItemLike> tuffFamily = List.of(Blocks.TUFF, Blocks.POLISHED_TUFF, Blocks.TUFF_BRICKS, Blocks.CHISELED_TUFF, Blocks.CHISELED_TUFF_BRICKS, ModBlocks.SMOOTH_POLISHED_TUFF);
                List<ItemLike> blackStoneFamily = List.of(Blocks.BLACKSTONE, Blocks.POLISHED_BLACKSTONE, Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.SMOOTH_POLISHED_BLACKSTONE);
                List<ItemLike> deepslateFamily = List.of(Blocks.DEEPSLATE, Blocks.POLISHED_DEEPSLATE, Blocks.DEEPSLATE_BRICKS, ModBlocks.SMOOTH_POLISHED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE);

                //andesite bricks
                stonecutterFromBases(ModBlocks.ANDESITE_BRICKS, removeFromFamily(andesiteFamily, ModBlocks.ANDESITE_BRICKS));
                stonecutterFromBases(ModBlocks.ANDESITE_BRICK_STAIRS, andesiteFamily);
                stonecutterFromBases(ModBlocks.ANDESITE_BRICK_SLAB, andesiteFamily, 2);
                stonecutterFromBases(ModBlocks.ANDESITE_BRICK_WALL, andesiteFamily);

                //diorite bricks
                stonecutterFromBases(ModBlocks.DIORITE_BRICKS, removeFromFamily(dioriteFamily, ModBlocks.DIORITE_BRICKS));
                stonecutterFromBases(ModBlocks.DIORITE_BRICK_STAIRS, dioriteFamily);
                stonecutterFromBases(ModBlocks.DIORITE_BRICK_SLAB, dioriteFamily, 2);
                stonecutterFromBases(ModBlocks.DIORITE_BRICK_WALL, dioriteFamily);

                //granite bricks
                stonecutterFromBases(ModBlocks.GRANITE_BRICKS, removeFromFamily(graniteFamily, ModBlocks.GRANITE_BRICKS));
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
                stonecutterFromBases(Blocks.POLISHED_TUFF, List.of(Blocks.TUFF_BRICKS, ModBlocks.SMOOTH_POLISHED_TUFF));
                stonecutterFromBases(Blocks.POLISHED_TUFF_SLAB, List.of(Blocks.TUFF_BRICKS, ModBlocks.SMOOTH_POLISHED_TUFF), 2);
                stonecutterFromBases(Blocks.POLISHED_TUFF_STAIRS, List.of(Blocks.TUFF_BRICKS, ModBlocks.SMOOTH_POLISHED_TUFF));
                stonecutterFromBases(Blocks.POLISHED_TUFF_WALL, List.of(Blocks.TUFF_BRICKS, ModBlocks.SMOOTH_POLISHED_TUFF));

                //deepslate

                stonecutterFromBases(Blocks.POLISHED_DEEPSLATE, List.of(ModBlocks.SMOOTH_POLISHED_DEEPSLATE));
                stonecutterFromBases(Blocks.POLISHED_DEEPSLATE_SLAB, List.of(ModBlocks.SMOOTH_POLISHED_DEEPSLATE));
                stonecutterFromBases(Blocks.POLISHED_DEEPSLATE_STAIRS, List.of(ModBlocks.SMOOTH_POLISHED_DEEPSLATE));
                stonecutterFromBases(Blocks.POLISHED_DEEPSLATE_WALL, List.of(ModBlocks.SMOOTH_POLISHED_DEEPSLATE));

                //blackstone

                stonecutterFromBases(Blocks.POLISHED_BLACKSTONE, List.of(ModBlocks.SMOOTH_POLISHED_BLACKSTONE));
                stonecutterFromBases(Blocks.POLISHED_BLACKSTONE_SLAB, List.of(ModBlocks.SMOOTH_POLISHED_BLACKSTONE));
                stonecutterFromBases(Blocks.POLISHED_BLACKSTONE_STAIRS, List.of(ModBlocks.SMOOTH_POLISHED_BLACKSTONE));
                stonecutterFromBases(Blocks.POLISHED_BLACKSTONE_WALL, List.of(ModBlocks.SMOOTH_POLISHED_BLACKSTONE));

                //polished walls
                stonecutterFromBases(ModBlocks.POLISHED_ANDESITE_WALL, andesiteFamily);
                stonecutterFromBases(ModBlocks.POLISHED_DIORITE_WALL, dioriteFamily);
                stonecutterFromBases(ModBlocks.POLISHED_GRANITE_WALL, graniteFamily);

                //smooth polished
                stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_ANDESITE, removeFromFamily(andesiteFamily, ModBlocks.SMOOTH_POLISHED_ANDESITE));
                stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_DIORITE, removeFromFamily(dioriteFamily, ModBlocks.SMOOTH_POLISHED_DIORITE));
                stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_GRANITE, removeFromFamily(graniteFamily, ModBlocks.SMOOTH_POLISHED_GRANITE));
                stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_TUFF, removeFromFamily(tuffFamily, ModBlocks.SMOOTH_POLISHED_TUFF));
                stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_BLACKSTONE, removeFromFamily(blackStoneFamily, ModBlocks.SMOOTH_POLISHED_BLACKSTONE));
                stonecutterFromBases(ModBlocks.SMOOTH_POLISHED_DEEPSLATE, removeFromFamily(deepslateFamily, ModBlocks.SMOOTH_POLISHED_DEEPSLATE));
            }

            private void stonecutterFromBases(ItemLike result, List<? extends ItemLike> bases) {
                stonecutterFromBases(result, bases, 1);
            }

            private void stonecutterFromBases(ItemLike result, List<? extends ItemLike> bases, int count) {
                for (ItemLike base : bases) {
                    stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, result, base, count);
                }
            }

            private List<? extends ItemLike> removeFromFamily(List<? extends ItemLike> family, ItemLike item) {
                return family.stream().filter(base -> !base.equals(item)).toList();
            }
        };
    }

    @Override
    public String getName() {
        return "Willi.js Building Utilities";
    }
}
