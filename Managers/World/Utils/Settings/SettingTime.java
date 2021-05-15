package me.jaypeg.jayapi.Managers.World.Utils.Settings;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.World;

public class SettingTime {

    public static void SettingTime(World world, Long time) {

        world.setTime(time);

    }

    public static void SettingTime(String worldName, Long time) {

        Bukkit.getWorld(worldName).setTime(time);

    }

    // Possible day/noon/night default options?

}
