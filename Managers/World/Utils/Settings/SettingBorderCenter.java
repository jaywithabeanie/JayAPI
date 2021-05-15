package me.jaypeg.jayapi.Managers.World.Utils.Settings;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class SettingBorderCenter {

    public static void SettingBorderCenter(World world, Location center) {

        world.getWorldBorder().setCenter(center);

    }

    public static void SettingBorderCenter(String worldName, Location center) {

        Bukkit.getWorld(worldName).getWorldBorder().setCenter(center);

    }

}
