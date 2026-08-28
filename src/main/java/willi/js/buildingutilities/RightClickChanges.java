package willi.js.buildingutilities;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

import java.util.Objects;
import java.util.Optional;

public class RightClickChanges {
    public static void weatherCopper() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            if(player.isSpectator()) {
                return InteractionResult.PASS;
            }

            BlockPos pos = hitResult.getBlockPos();
            BlockState blockState = world.getBlockState(pos);
            Block block = blockState.getBlock();
            ItemStack heldItem = player.getItemInHand(hand);

            if(!heldItem.is(Items.POTION) || !Objects.requireNonNull(heldItem.get(DataComponents.POTION_CONTENTS)).is(Potions.WATER)) return InteractionResult.PASS;
            if(!Blocks.COPPER_BLOCK.asList().contains(block)
                    && !Blocks.COPPER_BARS.asList().contains(block)
                    && !Blocks.COPPER_BULB.asList().contains(block)
                    && !Blocks.COPPER_CHAIN.asList().contains(block)
                    && !Blocks.COPPER_CHEST.asList().contains(block)
                    && !Blocks.COPPER_DOOR.asList().contains(block)
                    && !Blocks.COPPER_GOLEM_STATUE.asList().contains(block)
                    && !Blocks.COPPER_GRATE.asList().contains(block)
                    && !Blocks.COPPER_LANTERN.asList().contains(block)
                    && !Blocks.COPPER_TRAPDOOR.asList().contains(block)
                    && !Blocks.CHISELED_COPPER.asList().contains(block)
                    && !Blocks.CUT_COPPER.asList().contains(block)
                    && !Blocks.CUT_COPPER_SLAB.asList().contains(block)
                    && !Blocks.CUT_COPPER_STAIRS.asList().contains(block)
            ) return InteractionResult.PASS;

            Optional<Block> newBlock = WeatheringCopper.getNext(block);

            if(newBlock.isEmpty()) return InteractionResult.PASS;

            BlockState newBlockState = newBlock.get().defaultBlockState();
            for (Property<?> property : blockState.getProperties()) {
                if (newBlockState.hasProperty(property)) {
                    newBlockState = copyProperty(newBlockState, blockState, property);
                }
            }
            world.setBlock(pos, newBlockState, 3);

            if (world instanceof ServerLevel serverLevel) {
                serverLevel.sendParticles(
                        ParticleTypes.SCRAPE,
                        pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                        30,
                        0.5, 0.5, 0.5,
                        0.0
                );
            }

            if(player.isCreative()) return  InteractionResult.SUCCESS;

            player.getInventory().removeItem(player.getInventory().getSelectedSlot(), 1);
            player.getInventory().add(Items.GLASS_BOTTLE.getDefaultInstance());

            return  InteractionResult.SUCCESS;
        });
    }

    private static <T extends Comparable<T>> BlockState copyProperty(BlockState newState, BlockState oldState, Property<T> property) {
        return newState.setValue(property, oldState.getValue(property));
    }
}
