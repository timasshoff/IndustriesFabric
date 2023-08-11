package net.skytendo.industries.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.skytendo.industries.Industries;
import net.skytendo.industries.item.stageone.StageOneItems;

public class ModItemGroup {

    public static ItemGroup INDUSTRIES;

    public static void registerItemGroups() {
        INDUSTRIES = FabricItemGroup.builder(new Identifier(Industries.MOD_ID, "industriesgroup"))
                .icon(() -> new ItemStack(StageOneItems.RAW_TANZANITE))
                .displayName(Text.translatable("itemGroup.industries.default"))
                .build();
    }

}
