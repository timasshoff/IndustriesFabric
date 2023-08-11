package net.skytendo.industries.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.skytendo.industries.Industries;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> HARD_STONE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE,
            new Identifier(Industries.MOD_ID,"hard_stone"));

    public static void addFeatures() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, HARD_STONE_PLACED);
    }
}
