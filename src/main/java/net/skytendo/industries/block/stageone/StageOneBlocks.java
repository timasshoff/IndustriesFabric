package net.skytendo.industries.block.stageone;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.skytendo.industries.Industries;
import net.skytendo.industries.engine.IndustriesBlockItem;
import net.skytendo.industries.engine.ItemInfo;
import net.skytendo.industries.engine.documentation.DocumentedIndustriesBlockItem;
import net.skytendo.industries.item.ModItemGroup;
import net.skytendo.industries.iteminfos.HardStoneItemInfo;
import net.skytendo.industries.iteminfos.IndustrialPlanksItemInfo;
import net.skytendo.industries.iteminfos.IndustrialStoneItemInfo;
import net.skytendo.industries.world.feature.tree.ChestnutSaplingGenerator;

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

    public static final Block INDUSTRIAL_PLANKS = registerBlock("industrial_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)),
            new IndustrialPlanksItemInfo());

    public static final Block CHESTNUT_LOG = registerBlock("chestnut_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)),
            ModItemGroup.INDUSTRIES);

    public static final Block CHESTNUT_WOOD = registerBlock("chestnut_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)),
            ModItemGroup.INDUSTRIES);

    public static final Block STRIPPED_CHESTNUT_LOG = registerBlock("stripped_chestnut_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)),
            ModItemGroup.INDUSTRIES);

    public static final Block STRIPPED_CHESTNUT_WOOD = registerBlock("stripped_chestnut_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModItemGroup.INDUSTRIES);

    public static final Block CHESTNUT_SAPLING = registerBlock("chestnut_sapling",
            new SaplingBlock(new ChestnutSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)),
            ModItemGroup.INDUSTRIES);

    public static Block registerBlock(String name, Block block, ItemInfo itemInfo) {
        registerBlockItem(name, block, itemInfo);
        return Registry.register(Registries.BLOCK, new Identifier(Industries.MOD_ID, name), block);
    }

    public static Block registerBlock(String name, Block block, ItemGroup itemTab) {
        registerBlockItem(name, block, itemTab);
        return Registry.register(Registries.BLOCK, new Identifier(Industries.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemInfo itemInfo) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(Industries.MOD_ID, name),
                new DocumentedIndustriesBlockItem(block, itemInfo.ItemSettings, itemInfo));
        ItemGroupEvents.modifyEntriesEvent(itemInfo.ItemTab).register(entries -> entries.add(registeredItem));
        return registeredItem;
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup itemTab) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(Industries.MOD_ID, name),
                new IndustriesBlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(itemTab).register(entries -> entries.add(registeredItem));
        return registeredItem;
    }

    public static void registerModBlocks() {
        Industries.LOGGER.debug("Registering mod blocks for " + Industries.MOD_ID);
    }
}
