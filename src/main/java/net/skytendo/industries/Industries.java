package net.skytendo.industries;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.text.Text;
import net.skytendo.industries.engine.updatechecker.UpdateChecker;
import net.skytendo.industries.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Industries implements ModInitializer {
	public static final String MOD_ID = "industries";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ServerPlayConnectionEvents.JOIN.register(new ServerPlayConnectionEvents.Join() {
			@Override
			public void onPlayReady(ServerPlayNetworkHandler handler, PacketSender sender, MinecraftServer server) {
				UpdateChecker.checkForFeatureUpdates();
			}
		});
	}
}
