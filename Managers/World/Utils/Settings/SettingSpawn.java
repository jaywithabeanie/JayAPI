package me.jaypeg.jayapi.Managers.World.Utils.Settings;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class SettingSpawn {

    public static void SettingSpawn(World world, Integer X, Integer Y, Integer Z) {

        world.setSpawnLocation(X, Y, Z);

    }

    public static void SettingSpawn(String worldName, Integer X, Integer Y, Integer Z) {

        Bukkit.getWorld(worldName).setSpawnLocation(X, Y, Z);

    }

}
