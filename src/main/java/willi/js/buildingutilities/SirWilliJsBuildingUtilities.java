package willi.js.buildingutilities;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import willi.js.buildingutilities.blocks.ModBlocks;

public class SirWilliJsBuildingUtilities implements ModInitializer {
	public static final String MOD_ID = "sir-willijs-building-utilities";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loaded Nerdcraft's Vanilla+ Additions");
		ModBlocks.registerBlocks();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
