package net.skytendo.industries.engine.documentation;

import io.github.cottonmc.cotton.gui.widget.WBar;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.data.VerticalAlignment;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.skytendo.industries.Industries;

public class DocumentationBarStat extends WBar {

    public static final Identifier GRADIENT_DEFAULT = new Identifier(Industries.MOD_ID, "textures/gui/statsbar_default_filled.png");
    public static final Identifier GRADIENT_COLD_TO_HOT = new Identifier(Industries.MOD_ID, "textures/gui/statsbar_cold_to_hot_filled.png");
    public static final Identifier GRADIENT_SOFT_TO_HARD = new Identifier(Industries.MOD_ID, "textures/gui/statsbar_soft_to_hard_filled.png");
    public static final Identifier GRADIENT_LOW_POWER_TO_HIGH_POWER = new Identifier(Industries.MOD_ID, "textures/gui/statsbar_power_low_to_high_filled.png");

    public WLabel label;

    public DocumentationBarStat(int value, int maxValue, Identifier gradient, String labelKey) {
        super(new Identifier(Industries.MOD_ID, "textures/gui/statsbar_bg.png"), gradient, 0, 1, WBar.Direction.RIGHT);

        label = new WLabel(Text.translatable(labelKey, value));
        label.setVerticalAlignment(VerticalAlignment.CENTER);

        PropertyDelegate properties = new ArrayPropertyDelegate(2);
        properties.set(0, value);
        properties.set(1, maxValue);
        setProperties(properties);
        withTooltip(Text.translatable(labelKey, value));
    }

    public DocumentationBarStat(int value, int maxValue, Identifier gradient) {
        super(new Identifier(Industries.MOD_ID, "textures/gui/statsbar_bg.png"), gradient, 0, 1, WBar.Direction.RIGHT);

        PropertyDelegate properties = new ArrayPropertyDelegate(2);
        properties.set(0, value);
        properties.set(1, maxValue);
        setProperties(properties);
    }
}
