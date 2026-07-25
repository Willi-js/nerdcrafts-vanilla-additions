package willi.js.buildingutilities;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import willi.js.buildingutilities.datagen.ModBlockLootTableProvider;
import willi.js.buildingutilities.datagen.ModBlockTagsProvider;
import willi.js.buildingutilities.datagen.ModModelProviders;
import willi.js.buildingutilities.datagen.ModRecipeProvider;

public class SirWilliJsBuildingUtilitiesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProviders::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);

		pack.addProvider(ModRecipeProvider::new);
	}
}
