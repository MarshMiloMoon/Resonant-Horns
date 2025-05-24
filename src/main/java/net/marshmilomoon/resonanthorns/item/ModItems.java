package net.marshmilomoon.resonanthorns.item;

import net.marshmilomoon.resonanthorns.ResonantHorns;
import net.marshmilomoon.resonanthorns.item.custom.AmethystHornItem;
import net.minecraft.tags.InstrumentTags;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ResonantHorns.MOD_ID);

    public static final DeferredItem<Item> AMETHYST_HORN = ITEMS.register("amethyst_horn",
            () -> new AmethystHornItem(new Item.Properties(), InstrumentTags.GOAT_HORNS));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
