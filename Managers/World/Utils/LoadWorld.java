package me.jaypeg.jayapi.Managers.World.Utils;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;

public class LoadWorld {

    public LoadWorld(String worldName) {
        world(worldName);
    }

    public void world(String worldName) {
        Bukkit.getServer().createWorld(new WorldCreator(worldName));
    }

}
