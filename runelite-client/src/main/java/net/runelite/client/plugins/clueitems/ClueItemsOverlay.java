package net.runelite.client.plugins.clueitems;

import com.google.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.WidgetItemOverlay;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ClueItemsOverlay extends WidgetItemOverlay
{
	private final ClueItemsConfig config;
	private final ItemManager itemManager;

	@Inject
	private ClueItemsOverlay(ItemManager itemManager, ClueItemsConfig config)
	{
		this.config = config;
		this.itemManager = itemManager;
		showOnBank();
	}


	@Override
	public void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem itemWidget)
	{
		ClueItemTier tier = ClueItemTier.highestEnabledTier(ItemVariationMapping.map(itemId), this::isEnabled);
		if (tier != ClueItemTier.NONE)
		{
			Rectangle bounds = itemWidget.getCanvasBounds();
			final BufferedImage outline = itemManager.getItemOutline(itemId, itemWidget.getQuantity(), colorOf(tier));
			graphics.drawImage(outline, (int) bounds.getX(), (int) bounds.getY(), null);
		}
	}

	private Color colorOf(ClueItemTier tier)
	{
		switch (tier)
		{
			case BEGINNER:
				return config.beginnerColor();
			case EASY:
				return config.easyColor();
			case MEDIUM:
				return config.mediumColor();
			case HARD:
				return config.hardColor();
			case ELITE:
				return config.eliteColor();
			case MASTER:
				return config.masterColor();
		}
		return new Color(0, 0, 0, 0);
	}

	private boolean isEnabled(ClueItemTier tier)
	{
		switch (tier)
		{

			case NONE:
				return false;
			case BEGINNER:
				return config.beginner();
			case EASY:
				return config.easy();
			case MEDIUM:
				return config.medium();
			case HARD:
				return config.hard();
			case ELITE:
				return config.elite();
			case MASTER:
				return config.master();
		}
		return false;
	}

}

