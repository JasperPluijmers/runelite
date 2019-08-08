package net.runelite.client.plugins.clueitems;


import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.*;

@ConfigGroup("clueitems")
public interface ClueItemsConfig extends Config {

    @ConfigItem
            (
                position = 1,
                keyName = "beginner",
                name = "Beginner",
                description = "Do you want to see beginner items?"

            )
    default boolean beginner() {
        return true;
    }

    @ConfigItem(
            position = 2,
            keyName = "beginnerColor",
            name = "Beginner Clue Color",
            description = "Beginner Clue Color"
    )
    default Color beginnerColor()
    {
        return new Color(215, 225, 255, 255);
    }

    @ConfigItem
            (
                    position = 3,
                    keyName = "easy",
                    name = "Easy",
                    description = "Do you want to see easy items?"

            )
    default boolean easy() {
        return true;
    }

    @ConfigItem(
            position = 4,
            keyName = "easyColor",
            name = "Easy Clue Color",
            description = "Easy Clue Color"
    )
    default Color easyColor()
    {
        return new Color(0, 255, 0, 255);
    }

    @ConfigItem
            (
                    position = 5,
                    keyName = "medium",
                    name = "Medium",
                    description = "Do you want to see medium items?"

            )
    default boolean medium() {
        return true;
    }

    @ConfigItem(
            position = 6,
            keyName = "mediumColor",
            name = "Medium Clue Color",
            description = "Medium Clue Color"
    )
    default Color mediumColor()
    {
        return new Color(65, 248, 255, 255);
    }

    @ConfigItem
            (
                    position = 7,
                    keyName = "hard",
                    name = "Hard",
                    description = "Do you want to see hard items?"

            )
    default boolean hard() {
        return true;
    }

    @ConfigItem(
            position = 8,
            keyName = "hardColor",
            name = "Hard Clue Color",
            description = "Hard Clue Color"
    )
    default Color hardColor()
    {
        return new Color(103, 22, 255, 255);
    }

    @ConfigItem
            (
                    position = 9,
                    keyName = "elite",
                    name = "Elite",
                    description = "Do you want to see elite items?"

            )
    default boolean elite() {
        return true;
    }

    @ConfigItem(
            position = 10,
            keyName = "eliteColor",
            name = "Elite Clue Color",
            description = "Elite Clue Color"
    )
    default Color eliteColor()
    {
        return new Color(251, 255, 36, 255);
    }

    @ConfigItem
            (
                    position = 11,
                    keyName = "master",
                    name = "Master",
                    description = "Do you want to see master items?"

            )
    default boolean master() {
        return true;
    }

    @ConfigItem(
            position = 12,
            keyName = "masterColor",
            name = "Master Clue Color",
            description = "Master Clue Color"
    )
    default Color masterColor()
    {
        return new Color(255, 16, 19, 255);
    }


}
