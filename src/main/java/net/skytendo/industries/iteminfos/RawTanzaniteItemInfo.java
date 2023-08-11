package net.skytendo.industries.iteminfos;

import io.github.cottonmc.cotton.gui.widget.data.Texture;
import net.minecraft.util.Identifier;
import net.skytendo.industries.Industries;
import net.skytendo.industries.engine.ItemInfo;
import net.skytendo.industries.engine.documentation.DocumentationBarStat;
import net.skytendo.industries.engine.documentation.DocumentationLabelStat;

import java.util.ArrayList;

public class RawTanzaniteItemInfo extends ItemInfo {

    public static final int Hardness = 11;
    public static final int MaxHardness = 50;
    public static final int HeightMin = 0;
    public static final int HeightMax = 50;
    public static final String MinToolLevel = "Diamond";

    public RawTanzaniteItemInfo() {
        ItemNameKey = "item.industries.raw_tanzanite";
        Image = new Texture(new Identifier(Industries.MOD_ID, "textures/item/raw_tanzanite.png"));

        ItemDescriptionKeys = new ArrayList<>();
        ItemDescriptionKeys.add("item.industries.raw_tanzanite.description_1");
        ItemDescriptionKeys.add("item.industries.raw_tanzanite.description_2");
        ItemDescriptionKeys.add("item.industries.raw_tanzanite.description_3");

        ItemStats = new ArrayList<>();
        ItemStats.add(new DocumentationBarStat(Hardness, MaxHardness,
                DocumentationBarStat.GRADIENT_SOFT_TO_HARD,
                "item.industries.raw_tanzanite.stats.hardness"));
        ItemStats.add(new DocumentationLabelStat("item.industries.raw_tanzanite.stats.minheight", String.valueOf(HeightMin)));
        ItemStats.add(new DocumentationLabelStat("item.industries.raw_tanzanite.stats.maxheight", String.valueOf(HeightMax)));
        ItemStats.add(new DocumentationLabelStat("item.industries.raw_tanzanite.stats.mintoollevel", MinToolLevel));
    }
}
