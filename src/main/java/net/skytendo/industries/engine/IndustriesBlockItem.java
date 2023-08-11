package net.skytendo.industries.engine;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class IndustriesBlockItem extends BlockItem {

    public ItemInfo itemInfo;

    public IndustriesBlockItem(Block block, Settings settings, ItemInfo itemInfo) {
        super(block, settings);
        this.itemInfo = itemInfo;
    }
}
