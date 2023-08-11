package net.skytendo.industries.engine.documentation;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import io.github.cottonmc.cotton.gui.widget.data.Axis;
import io.github.cottonmc.cotton.gui.widget.data.HorizontalAlignment;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import net.fabricmc.fabric.api.util.TriState;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.skytendo.industries.Industries;
import net.skytendo.industries.engine.ItemInfo;

import javax.swing.*;
import java.util.List;

public class DocumentationGui extends LightweightGuiDescription {
    public DocumentationGui(ItemInfo info) {
        WTabPanel root = new WTabPanel();
        setRootPanel(root);
        root.setSize(300, 200);

        //
        // INFO PANEL
        //

        WGridPanel infoPanel = new WGridPanel(9);
        infoPanel.setSize(300, 200);
        infoPanel.setInsets(Insets.ROOT_PANEL);

        WLabel title = new WLabel(Text.translatable(info.ItemNameKey).formatted(Formatting.BOLD));
        title.setHorizontalAlignment(HorizontalAlignment.CENTER);
        infoPanel.add(title, 0, 0, 33, 1);

        for (int i = 0; i < info.ItemDescriptionKeys.size(); i++) {
            WLabel currentLine = new WLabel(Text.translatable(info.ItemDescriptionKeys.get(i)));
            infoPanel.add(currentLine, 0, i + 2, 16, 1);
        }

        if (info.Image != null)  {
            WSprite image = new WSprite(info.Image);
            infoPanel.add(image, 19, 2, 11, 11);
        }

        WScrollPanel infoScrollPanel = new WScrollPanel(infoPanel);
        infoScrollPanel.setSize(300, 200);
        infoScrollPanel.setScrollingHorizontally(TriState.FALSE);
        root.add(infoScrollPanel, tab -> tab.title(Text.translatable("documentation.industries.tab.description")));

        //
        // STATS PANEL
        //

        WGridPanel statsPanel = new WGridPanel();
        statsPanel.setSize(300, 200);
        statsPanel.setInsets(Insets.ROOT_PANEL);

        statsPanel.add(title, 0, 0, 16, 1);

        for (int i = 0; i < info.ItemStats.size(); i++) {
            if (info.ItemStats.get(i) instanceof DocumentationBarStat)
            {
                statsPanel.add(((DocumentationBarStat) info.ItemStats.get(i)).label, 0, i + 1);
                statsPanel.add(info.ItemStats.get(i), 6, i + 1, 9, 1);
            }
            else
            {
                statsPanel.add(info.ItemStats.get(i), 0, i + 1, 9, 1);
            }
        }

        WScrollPanel statsScrollPanel = new WScrollPanel(statsPanel);
        statsScrollPanel.setSize(300, 200);
        statsScrollPanel.setScrollingHorizontally(TriState.FALSE);
        root.add(statsScrollPanel, tab -> tab.title(Text.translatable("documentation.industries.tab.stats")));
    }
}
