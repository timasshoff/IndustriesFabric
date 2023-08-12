package net.skytendo.industries.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.skytendo.industries.block.stageone.StageOneBlocks;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(StageOneBlocks.CHESTNUT_LOG, StageOneBlocks.STRIPPED_CHESTNUT_LOG);
        StrippableBlockRegistry.register(StageOneBlocks.CHESTNUT_WOOD, StageOneBlocks.STRIPPED_CHESTNUT_WOOD);
    }
}
