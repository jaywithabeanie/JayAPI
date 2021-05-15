package me.jaypeg.jayapi.Managers.World.Utils.Settings;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class SettingBorderSize {

    public static void SettingBorderSize(World world, Double size) {

        world.getWorldBorder().setSize(size);

    }

    public static void SettingBorderSize(String worldName, Double size) {

        Bukkit.getWorld(worldName).getWorldBorder().setSize(size);

    }

}
