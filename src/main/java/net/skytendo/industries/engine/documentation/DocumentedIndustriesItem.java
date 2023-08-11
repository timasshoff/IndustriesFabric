package net.skytendo.industries.engine.documentation;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.skytendo.industries.engine.IndustriesItem;
import net.skytendo.industries.engine.ItemInfo;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DocumentedIndustriesItem extends IndustriesItem {
    public DocumentedIndustriesItem(Settings settings, ItemInfo itemInfo) {
        super(settings, itemInfo);
        this.itemInfo = itemInfo;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasAltDown())
            MinecraftClient.getInstance().setScreen(new DocumentationScreen(new DocumentationGui(itemInfo)));
        else
            tooltip.add(Text.translatable("documentation.industries.itemtooltip"));
    }
}
