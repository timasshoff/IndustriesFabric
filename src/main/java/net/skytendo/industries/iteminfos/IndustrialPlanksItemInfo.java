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

public class IndustrialPlanksItemInfo extends ItemInfo {

    public static float Hardness = 2f;
    public static Material BlockMaterial = Material.WOOD;

    public IndustrialPlanksItemInfo() {

        ItemSettings = new FabricItemSettings();
        ItemTab = ModItemGroup.INDUSTRIES;

        ItemNameKey = "block.industries.industrial_planks";
        Image = new Texture(new Identifier(Industries.MOD_ID, "textures/block/industrial_planks.png"));

        ItemDescriptionKeys = new ArrayList<>();
        ItemDescriptionKeys.add("item.industries.industrial_planks.description_1");
        ItemDescriptionKeys.add("item.industries.industrial_planks.description_2");
        ItemDescriptionKeys.add("item.industries.industrial_planks.description_3");
        ItemDescriptionKeys.add("item.industries.industrial_planks.description_4");
        ItemDescriptionKeys.add("item.industries.industrial_planks.description_5");
        ItemDescriptionKeys.add("item.industries.industrial_planks.description_6");

        ItemStats = new ArrayList<>();
        ItemStats.add(new DocumentationLabelStat("item.industries.industrial_planks.stats.hardness", String.valueOf(Hardness)));

    }

}
