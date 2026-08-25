package willi.js.buildingutilities.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import willi.js.buildingutilities.datagen.recipes.*;

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
                new AndesiteFamilyRecipes(registries, output).buildRecipes();
                new DioriteFamilyRecipes(registries, output).buildRecipes();
                new GraniteFamilyRecipes(registries, output).buildRecipes();
                new TuffFamilyRecipes(registries, output).buildRecipes();
                new BlackstoneFamilyRecipes(registries, output).buildRecipes();
                new DeepslateFamilyRecipes(registries, output).buildRecipes();
            }
        };
    }

    @Override
    public String getName() {
        return "Willi.js Building Utilities";
    }
}
