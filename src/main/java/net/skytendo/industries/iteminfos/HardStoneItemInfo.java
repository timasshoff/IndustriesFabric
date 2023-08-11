package net.skytendo.industries.iteminfos;

import io.github.cottonmc.cotton.gui.widget.data.Texture;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.skytendo.industries.Industries;
import net.skytendo.industries.engine.ItemInfo;
import net.skytendo.industries.engine.documentation.DocumentationLabelStat;
import net.skytendo.industries.item.ModItemGroup;

import java.util.ArrayList;

public class HardStoneItemInfo extends ItemInfo {

    public static float Hardness = 2.5f;
    public static int MinHeight = 0;
    public static int MaxHeight = 100;
    public static Material BlockMaterial = Material.STONE;

    public HardStoneItemInfo() {

        ItemSettings = new FabricItemSettings();
        ItemTab = ModItemGroup.INDUSTRIES;
        BlockMaterial = Material.STONE;

        ItemNameKey = "block.industries.hard_stone";
        Image = new Texture(new Identifier(Industries.MOD_ID, "textures/block/hard_stone.png"));

        ItemDescriptionKeys = new ArrayList<>();
        ItemDescriptionKeys.add("item.industries.hard_stone.description_1");
        ItemDescriptionKeys.add("item.industries.hard_stone.description_2");
        ItemDescriptionKeys.add("item.industries.hard_stone.description_3");
        ItemDescriptionKeys.add("item.industries.hard_stone.description_4");

        ItemStats = new ArrayList<>();
        ItemStats.add(new DocumentationLabelStat("item.industries.hard_stone.stats.hardness", String.valueOf(Hardness)));
        ItemStats.add(new DocumentationLabelStat("item.industries.hard_stone.stats.minheight", String.valueOf(MinHeight)));
        ItemStats.add(new DocumentationLabelStat("item.industries.hard_stone.stats.maxheight", String.valueOf(MaxHeight)));

    }

}
