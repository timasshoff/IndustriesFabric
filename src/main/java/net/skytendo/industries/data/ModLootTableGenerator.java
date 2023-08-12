package net.skytendo.industries.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.skytendo.industries.block.stageone.StageOneBlocks;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        oreDrops(StageOneBlocks.HARD_STONE, StageOneBlocks.HARD_STONE.asItem());
        addDrop(StageOneBlocks.CHESTNUT_LOG);
        addDrop(StageOneBlocks.CHESTNUT_WOOD);
        addDrop(StageOneBlocks.STRIPPED_CHESTNUT_WOOD);
        addDrop(StageOneBlocks.STRIPPED_CHESTNUT_LOG);
        addDrop(StageOneBlocks.CHESTNUT_SAPLING);
        addDrop(StageOneBlocks.INDUSTRIAL_PLANKS);
    }
}
