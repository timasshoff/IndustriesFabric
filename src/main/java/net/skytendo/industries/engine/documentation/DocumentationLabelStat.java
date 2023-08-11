package net.skytendo.industries.engine.documentation;

import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.data.VerticalAlignment;
import net.minecraft.text.Text;

public class DocumentationLabelStat extends WLabel {
    public DocumentationLabelStat(String labelKey, String value) {
        super(Text.translatable(labelKey, value));
        setVerticalAlignment(VerticalAlignment.CENTER);
    }
}
