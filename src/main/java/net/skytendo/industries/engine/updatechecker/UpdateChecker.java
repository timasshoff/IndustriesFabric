package net.skytendo.industries.engine.updatechecker;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import net.skytendo.industries.engine.documentation.DocumentationGui;
import net.skytendo.industries.engine.documentation.DocumentationScreen;

public class UpdateChecker {

    /**
     * Will send a chat message if a feature update is available
     */
    public static void checkForFeatureUpdates() {
        if (isFeatureOutdated()) {
            //MinecraftClient.getInstance().setScreen(new FeatureOutdatedScreen(new FeatureOutdatedGui(getVersion())));
        }
    }

    /**
     * Gets the newest version data from Curseforge
     * @return the newest version
     */
    public static Version getVersion() {
        // TODO Write Update Checker Code to provide RETURN with accurate information
        Version version = new Version();
        version.featureOutdated = true;

        return version;
    }

    /**
     * Checks if current version is feature outdated by requesting new version data
     * @return Mod Feature Outdated
     */
    public static boolean isFeatureOutdated() {
        return getVersion().featureOutdated;
    }
    /**
     * Checks if current version is feature outdated by requesting new version data
     * @return Mod Minor Outdated
     */
    public static boolean isMinorOutdated() {
        return getVersion().minorOutdated;
    }
}
