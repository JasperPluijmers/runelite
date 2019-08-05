package net.runelite.client.plugins.clueitems;

import net.runelite.api.Client;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
        name = "Clue Items",
        description = "Shows which items in your bank are needed for emote clues",
        tags = {"clue", "emote", "bank"}
)
public class ClueItemsPlugin extends Plugin {

    @Inject
    private Client client;

    @Inject
    private ClientThread clientThread;

    @Inject
    private ClueItemsPlugin config;

    @Inject
    private ClueItemsOverlay overlay;

    @Inject
    private OverlayManager overlayManager;
}
