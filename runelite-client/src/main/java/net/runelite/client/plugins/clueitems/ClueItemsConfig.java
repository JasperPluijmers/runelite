package net.runelite.client.plugins.clueitems;


import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

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

    @ConfigItem
            (
                    position = 2,
                    keyName = "easy",
                    name = "Easy",
                    description = "Do you want to see easy items?"

            )
    default boolean easy() {
        return true;
    }

    @ConfigItem
            (
                    position = 3,
                    keyName = "medium",
                    name = "Medium",
                    description = "Do you want to see medium items?"

            )
    default boolean medium() {
        return true;
    }

    @ConfigItem
            (
                    position = 4,
                    keyName = "hard",
                    name = "Hard",
                    description = "Do you want to see hard items?"

            )
    default boolean hard() {
        return true;
    }

    @ConfigItem
            (
                    position = 5,
                    keyName = "elite",
                    name = "Elite",
                    description = "Do you want to see elite items?"

            )
    default boolean elite() {
        return true;
    }

    @ConfigItem
            (
                    position = 6,
                    keyName = "master",
                    name = "Master",
                    description = "Do you want to see master items?"

            )
    default boolean master() {
        return true;
    }


}
