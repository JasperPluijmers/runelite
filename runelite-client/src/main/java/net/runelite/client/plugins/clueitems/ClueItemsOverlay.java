package net.runelite.client.plugins.clueitems;

import com.google.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.WidgetItemOverlay;

import java.awt.*;

public class ClueItemsOverlay extends WidgetItemOverlay {

    private static final Color HIGHLIGHT = new Color(0, 255, 0, 45);
    private final Client client;
    private final ClueItemsConfig config;

    @Inject
    private ClueItemsOverlay(ClueItemsConfig config, Client client)
    {
        this.client = client;
        this.config = config;
        showOnBank();
    }


    @Override
    public void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem itemWidget) {
        if (itemId == 1925  || itemId == 1926) {
            Rectangle bounds = itemWidget.getCanvasBounds();
            graphics.setColor(HIGHLIGHT);
            graphics.fill(bounds);
        }
    }
}
