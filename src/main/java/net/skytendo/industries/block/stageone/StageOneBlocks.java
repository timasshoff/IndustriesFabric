package net.skytendo.industries.block.stageone;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skytendo.industries.Industries;
import net.skytendo.industries.engine.ItemInfo;
import net.skytendo.industries.engine.documentation.DocumentedIndustriesBlockItem;
import net.skytendo.industries.iteminfos.HardStoneItemInfo;
import net.skytendo.industries.iteminfos.IndustrialStoneItemInfo;

public class StageOneBlocks {
    public static final Block INDUSTRIAL_STONE = registerBlock("industrial_stone",
            new Block(FabricBlockSettings.of(IndustrialStoneItemInfo.BlockMaterial)
                    .hardness(IndustrialStoneItemInfo.Hardness)
                    .requiresTool()),
            new IndustrialStoneItemInfo());

    public static final Block HARD_STONE = registerBlock("hard_stone",
            new Block(FabricBlockSettings.of(HardStoneItemInfo.BlockMaterial)
                    .hardness(HardStoneItemInfo.Hardness)
                    .requiresTool()),
            new HardStoneItemInfo());

    public static Block registerBlock(String name, Block block, ItemInfo itemInfo) {
        registerBlockItem(name, block, itemInfo);
        return Registry.register(Registries.BLOCK, new Identifier(Industries.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemInfo itemInfo) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(Industries.MOD_ID, name),
                new DocumentedIndustriesBlockItem(block, itemInfo.ItemSettings, itemInfo));
        ItemGroupEvents.modifyEntriesEvent(itemInfo.ItemTab).register(entries -> entries.add(registeredItem));
        return registeredItem;
    }
    public static void registerModBlocks() {
        Industries.LOGGER.debug("Registering mod blocks for " + Industries.MOD_ID);
    }
}
