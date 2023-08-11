package net.skytendo.industries.engine;

import io.github.cottonmc.cotton.gui.widget.WWidget;
import io.github.cottonmc.cotton.gui.widget.data.Texture;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;

import java.util.List;

public class ItemInfo {
    public FabricItemSettings ItemSettings;
    public String ItemNameKey;
    public ItemGroup ItemTab;
    public List<String> ItemDescriptionKeys;
    public Texture Image;
    public List<WWidget> ItemStats;
}
