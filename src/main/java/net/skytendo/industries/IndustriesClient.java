package net.skytendo.industries;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.skytendo.industries.block.stageone.StageOneBlocks;

public class IndustriesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(StageOneBlocks.CHESTNUT_SAPLING, RenderLayer.getCutout());
    }
}
