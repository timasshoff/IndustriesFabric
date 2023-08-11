package net.skytendo.industries.engine.updatechecker;

import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class UpdateChecker {

    /**
     * Will send a chat message if a feature update is available
     */
    public static void checkForFeatureUpdates() {
        if (isFeatureOutdated()) {
            MinecraftClient mc = MinecraftClient.getInstance();
            mc.inGameHud.getChatHud().addMessage(Text.literal("Feature Outdated"));
        }
    }

    /**
     * Gets the newest version data from Curseforge
     * @return the newest version
     */
    public static Version getVersion() {
        // TODO Write Update Checker Code to provide RETURN with accurate information
        return new Version();
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
