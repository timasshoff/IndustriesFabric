package net.skytendo.industries.engine.updatechecker;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;

public class FeatureOutdatedGui extends LightweightGuiDescription {
    public FeatureOutdatedGui(Version version) {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(150, 75);
    }
}
