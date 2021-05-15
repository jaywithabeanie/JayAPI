package me.jaypeg.jayapi.Managers.World.Utils;

import org.bukkit.World;

import static org.bukkit.Bukkit.getServer;
import static org.bukkit.Bukkit.getWorld;

public class UnloadWorld {

    public static void UnloadWorld(World world, Boolean save) {
        getServer().unloadWorld(world, save);
    }

    public static void UnloadWorld(String worldName, Boolean save) {
        getServer().unloadWorld(getWorld(worldName), save);
    }


}
