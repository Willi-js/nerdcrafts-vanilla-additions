package willi.js.buildingutilities;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Items;

public class DataComponentEdits {

    static void modifyPotionMaxStackSize() {

        DefaultItemComponentEvents.MODIFY.register(context -> {
            context.modify(Items.POTION, builder -> {
                DataComponentMap components = DataComponentMap.builder()
                        .addAll(Items.POTION.components())
                        .set(DataComponents.MAX_STACK_SIZE, 16)
                        .build();
                builder.addAll(components);
            });
            context.modify(Items.LINGERING_POTION, builder -> {
                DataComponentMap components = DataComponentMap.builder()
                        .addAll(Items.LINGERING_POTION.components())
                        .set(DataComponents.MAX_STACK_SIZE, 16)
                        .build();
                builder.addAll(components);
            });
            context.modify(Items.SPLASH_POTION, builder -> {
                DataComponentMap components = DataComponentMap.builder()
                        .addAll(Items.SPLASH_POTION.components())
                        .set(DataComponents.MAX_STACK_SIZE, 16)
                        .build();
                builder.addAll(components);
            });
        });

    }

}
