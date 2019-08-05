package net.runelite.client.plugins.clueitems;

import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.overlay.WidgetItemOverlay;

import java.awt.*;

public class ClueItemsOverlay extends WidgetItemOverlay {

    private static final Color HIGHLIGHT = new Color(0, 255, 0, 45);

    @Override
    public void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem itemWidget) {
        Rectangle bounds = itemWidget.getCanvasBounds();
        System.out.println(bounds);
        graphics.setColor(HIGHLIGHT);
        graphics.fill(bounds);
    }
}
