package willi.js.buildingutilities;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.Nullable;
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
		DataComponentEdits.modifyPotionMaxStackSize();
		RightClickChanges.weatherCopper();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
