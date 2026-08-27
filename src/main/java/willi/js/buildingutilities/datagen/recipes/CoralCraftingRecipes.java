package willi.js.buildingutilities.datagen.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;

import static willi.js.buildingutilities.SirWilliJsBuildingUtilities.id;

public class CoralCraftingRecipes extends AbstractBlockFamilyRecipes {
    public CoralCraftingRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    public void buildRecipes() {

        // Tube Coral Bock
        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.TUBE_CORAL_BLOCK)
                .requires(Items.TUBE_CORAL, 4)
                .unlockedBy(getItemName(Items.TUBE_CORAL), has(Items.TUBE_CORAL))
                .save(output, id("tube_coral_block_from_coral").getPath());

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.TUBE_CORAL_BLOCK)
                .requires(Items.TUBE_CORAL_FAN, 4)
                .unlockedBy(getItemName(Items.TUBE_CORAL_FAN), has(Items.TUBE_CORAL_FAN))
                .save(output, id("tube_coral_block_from_coral_fan").getPath());

        // Brain Coral Block

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.BRAIN_CORAL_BLOCK)
                .requires(Items.BRAIN_CORAL, 4)
                .unlockedBy(getItemName(Items.BRAIN_CORAL), has(Items.BRAIN_CORAL))
                .save(output, id("brain_coral_block_from_coral").getPath());

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.BRAIN_CORAL_BLOCK)
                .requires(Items.BRAIN_CORAL_FAN, 4)
                .unlockedBy(getItemName(Items.BRAIN_CORAL_FAN), has(Items.BRAIN_CORAL_FAN))
                .save(output, id("brain_coral_block_from_fan").getPath());

        // Bubble Coral Block

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.BUBBLE_CORAL_BLOCK)
                .requires(Items.BUBBLE_CORAL, 4)
                .unlockedBy(getItemName(Items.BUBBLE_CORAL), has(Items.BUBBLE_CORAL))
                .save(output, id("bubble_coral_block_from_coral").getPath());

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.BUBBLE_CORAL_BLOCK)
                .requires(Items.BUBBLE_CORAL_FAN, 4)
                .unlockedBy(getItemName(Items.BUBBLE_CORAL_FAN), has(Items.BUBBLE_CORAL_FAN))
                .save(output, id("bubble_coral_block_from_fan").getPath());

        // Fire Coral Block

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.FIRE_CORAL_BLOCK)
                .requires(Items.FIRE_CORAL, 4)
                .unlockedBy(getItemName(Items.FIRE_CORAL), has(Items.FIRE_CORAL))
                .save(output, id("fire_coral_block_from_coral").getPath());

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.FIRE_CORAL_BLOCK)
                .requires(Items.FIRE_CORAL_FAN, 4)
                .unlockedBy(getItemName(Items.FIRE_CORAL_FAN), has(Items.FIRE_CORAL_FAN))
                .save(output, id("fire_coral_block_from_fan").getPath());

        // Horn Coral Block

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.HORN_CORAL_BLOCK)
                .requires(Items.HORN_CORAL, 4)
                .unlockedBy(getItemName(Items.HORN_CORAL), has(Items.HORN_CORAL))
                .save(output, id("horn_coral_block_from_coral").getPath());

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.HORN_CORAL_BLOCK)
                .requires(Items.HORN_CORAL_FAN, 4)
                .unlockedBy(getItemName(Items.HORN_CORAL_FAN), has(Items.HORN_CORAL_FAN))
                .save(output, id("horn_coral_block_from_fan").getPath());

        // Dead Tube Coral Bock
        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_TUBE_CORAL_BLOCK)
                .requires(Items.DEAD_TUBE_CORAL, 4)
                .unlockedBy(getItemName(Items.DEAD_TUBE_CORAL), has(Items.DEAD_TUBE_CORAL))
                .save(output, id("dead_tube_coral_block_from_coral").getPath());

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_TUBE_CORAL_BLOCK)
                .requires(Items.DEAD_TUBE_CORAL_FAN, 4)
                .unlockedBy(getItemName(Items.DEAD_TUBE_CORAL_FAN), has(Items.DEAD_TUBE_CORAL_FAN))
                .save(output, id("dead_tube_coral_block_from_coral_fan").getPath());

        // Dead Brain Coral Block

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_BRAIN_CORAL_BLOCK)
                .requires(Items.DEAD_BRAIN_CORAL, 4)
                .unlockedBy(getItemName(Items.DEAD_BRAIN_CORAL), has(Items.DEAD_BRAIN_CORAL))
                .save(output, id("dead_brain_coral_block_from_coral").getPath());

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_BRAIN_CORAL_BLOCK)
                .requires(Items.DEAD_BRAIN_CORAL_FAN, 4)
                .unlockedBy(getItemName(Items.DEAD_BRAIN_CORAL_FAN), has(Items.DEAD_BRAIN_CORAL_FAN))
                .save(output, id("dead_brain_coral_block_from_fan").getPath());

        // Dead Bubble Coral Block

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_BUBBLE_CORAL_BLOCK)
                .requires(Items.DEAD_BUBBLE_CORAL, 4)
                .unlockedBy(getItemName(Items.DEAD_BUBBLE_CORAL), has(Items.DEAD_BUBBLE_CORAL))
                .save(output, id("dead_bubble_coral_block_from_coral").getPath());

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_BUBBLE_CORAL_BLOCK)
                .requires(Items.DEAD_BUBBLE_CORAL_FAN, 4)
                .unlockedBy(getItemName(Items.DEAD_BUBBLE_CORAL_FAN), has(Items.DEAD_BUBBLE_CORAL_FAN))
                .save(output, id("dead_bubble_coral_block_from_fan").getPath());

        // Dead Fire Coral Block

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_FIRE_CORAL_BLOCK)
                .requires(Items.DEAD_FIRE_CORAL, 4)
                .unlockedBy(getItemName(Items.DEAD_FIRE_CORAL), has(Items.DEAD_FIRE_CORAL))
                .save(output, id("dead_fire_coral_block_from_coral").getPath());

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_FIRE_CORAL_BLOCK)
                .requires(Items.DEAD_FIRE_CORAL_FAN, 4)
                .unlockedBy(getItemName(Items.DEAD_FIRE_CORAL_FAN), has(Items.DEAD_FIRE_CORAL_FAN))
                .save(output, id("dead_fire_coral_block_from_fan").getPath());

        // Dead Horn Coral Block

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_HORN_CORAL_BLOCK)
                .requires(Items.DEAD_HORN_CORAL, 4)
                .unlockedBy(getItemName(Items.DEAD_HORN_CORAL), has(Items.DEAD_HORN_CORAL))
                .save(output, id("dead_horn_coral_block_from_coral").getPath());

        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DEAD_HORN_CORAL_BLOCK)
                .requires(Items.DEAD_HORN_CORAL_FAN, 4)
                .unlockedBy(getItemName(Items.DEAD_HORN_CORAL_FAN), has(Items.DEAD_HORN_CORAL_FAN))
                .save(output, id("dead_horn_coral_block_from_fan").getPath());
    }
}
