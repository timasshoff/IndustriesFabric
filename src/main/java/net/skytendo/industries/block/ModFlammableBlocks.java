package net.skytendo.industries.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.skytendo.industries.block.stageone.StageOneBlocks;

public class ModFlammableBlocks {

    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(StageOneBlocks.CHESTNUT_LOG, 5, 5);
        registry.add(StageOneBlocks.CHESTNUT_WOOD, 5, 5);
        registry.add(StageOneBlocks.STRIPPED_CHESTNUT_WOOD, 5, 5);
        registry.add(StageOneBlocks.INDUSTRIAL_PLANKS, 5, 20);
    }

}
