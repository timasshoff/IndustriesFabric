package net.skytendo.industries.iteminfos;

import io.github.cottonmc.cotton.gui.widget.data.Texture;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Identifier;
import net.skytendo.industries.Industries;
import net.skytendo.industries.engine.IndustriesBlockItem;
import net.skytendo.industries.engine.ItemInfo;
import net.skytendo.industries.engine.documentation.DocumentationBarStat;
import net.skytendo.industries.engine.documentation.DocumentationLabelStat;
import net.skytendo.industries.item.ModItemGroup;

import java.util.ArrayList;

public class IndustrialStoneItemInfo extends ItemInfo {

    public static float Hardness = 3f;
    public static Material BlockMaterial = Material.STONE;

    public IndustrialStoneItemInfo() {

        ItemSettings = new FabricItemSettings();
        ItemTab = ModItemGroup.INDUSTRIES;
        BlockMaterial = Material.STONE;

        ItemNameKey = "block.industries.industrial_stone";
        Image = new Texture(new Identifier(Industries.MOD_ID, "textures/block/industrial_stone.png"));

        ItemDescriptionKeys = new ArrayList<>();
        ItemDescriptionKeys.add("item.industries.industrial_stone.description_1");
        ItemDescriptionKeys.add("item.industries.industrial_stone.description_2");
        ItemDescriptionKeys.add("item.industries.industrial_stone.description_3");
        ItemDescriptionKeys.add("item.industries.industrial_stone.description_4");
        ItemDescriptionKeys.add("item.industries.industrial_stone.description_5");

        ItemStats = new ArrayList<>();
        ItemStats.add(new DocumentationLabelStat("item.industries.industrial_stone.stats.hardness", String.valueOf(Hardness)));

    }

}
