package net.skytendo.industries.item.stageone;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skytendo.industries.Industries;
import net.skytendo.industries.engine.documentation.DocumentedIndustriesItem;
import net.skytendo.industries.iteminfos.RawTanzaniteItemInfo;

public class StageOneItems {
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new DocumentedIndustriesItem(new FabricItemSettings(), new RawTanzaniteItemInfo()), ItemGroups.INGREDIENTS);

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Industries.MOD_ID, name), item);
    }

    private static Item registerItem(String name, Item item, ItemGroup itemGroup) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(Industries.MOD_ID, name), item);
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        return registeredItem;
    }

    public static void registerModItems() {
        Industries.LOGGER.debug("Registering stage 1 mod items for " + Industries.MOD_ID);
    }
}
