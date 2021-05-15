package me.jaypeg.jayapi.Managers.World.Utils.Settings;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.World;

public class SettingDifficulty {

    public static void SettingDifficulty(World world, Difficulty difficulty) {

        world.setDifficulty(difficulty);

    }

    public static void SettingDifficulty(String worldName, Difficulty difficulty) {

        Bukkit.getWorld(worldName).setDifficulty(difficulty);

    }

}
