package net.skytendo.industries.engine;

import net.minecraft.item.Item;

public class IndustriesItem extends Item {

    public ItemInfo itemInfo;

    public IndustriesItem(Settings settings, ItemInfo itemInfo) {
        super(settings);
        this.itemInfo = itemInfo;
    }
}
