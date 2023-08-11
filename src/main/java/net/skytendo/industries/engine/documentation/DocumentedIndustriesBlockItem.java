package net.skytendo.industries.engine.documentation;

import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.skytendo.industries.engine.IndustriesBlockItem;
import net.skytendo.industries.engine.IndustriesItem;
import net.skytendo.industries.engine.ItemInfo;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DocumentedIndustriesBlockItem extends IndustriesBlockItem {

    private int ticksAltDown = 0;
    private final int neededTicks = 36;
    private int progress = 0;

    public DocumentedIndustriesBlockItem(Block block, Settings settings, ItemInfo itemInfo) {
        super(block, settings, itemInfo);
        this.itemInfo = itemInfo;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasAltDown()) {
            ticksAltDown++;
            if (ticksAltDown % 2 == 0)
                progress++;

            StringBuilder sb = new StringBuilder();
            sb.append("§7§l[§4§l");

            for (int i = 0; i < progress; i++) {
                sb.append("|");
            }

            int remains = (neededTicks / 2) - progress;
            for (int i = 0; i < remains; i++) {
                sb.append(".");
            }

            sb.append("§7§l]");
            tooltip.add(Text.literal(sb.toString()));

            if (ticksAltDown >= neededTicks) {
                ticksAltDown = 0;
                progress = 0;
                MinecraftClient.getInstance().setScreen(new DocumentationScreen(new DocumentationGui(itemInfo)));
            }
        } else {
            ticksAltDown = 0;
            progress = 0;
            tooltip.add(Text.translatable("documentation.industries.itemtooltip"));
        }
    }
}
