package willi.js.buildingutilities.datagen.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.ItemLike;

import java.util.List;

public abstract class AbstractBlockFamilyRecipes extends RecipeProvider {
    public AbstractBlockFamilyRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    protected void stonecutterFromBases(ItemLike result, List<? extends ItemLike> bases) {
        stonecutterFromBases(result, bases, 1);
    }

    protected void stonecutterFromBases(ItemLike result, List<? extends ItemLike> bases, int count) {
        for (ItemLike base : bases) {
            stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, result, base, count);
        }
    }

    protected List<? extends ItemLike> removeFromFamily(List<? extends ItemLike> family, ItemLike item) {
        return family.stream().filter(base -> !base.equals(item)).toList();
    }
}
