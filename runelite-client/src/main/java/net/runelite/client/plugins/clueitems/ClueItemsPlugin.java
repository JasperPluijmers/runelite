package net.runelite.client.plugins.clueitems;

import com.google.inject.Provides;
import net.runelite.api.Client;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
	name = "Clue Items",
	description = "Shows which items in your bank are needed for emote clues",
	tags = {"clue", "emote", "bank"}
)
public class ClueItemsPlugin extends Plugin
{

	@Inject
	private ClueItemsOverlay overlay;

	@Inject
	private OverlayManager overlayManager;

	@Provides
	ClueItemsConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ClueItemsConfig.class);
	}

	@Override
	protected void startUp()
	{
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown()
	{
		overlayManager.remove(overlay);
	}
}
