package me.jaypeg.jayapi.Managers.World.Utils;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class TeleportWorld {

    public static void TeleportWorld(World world, Player player) {

        player.teleport(world.getSpawnLocation());

    }

    public static void TeleportWorld(String worldName, Player player) {

        player.teleport(Bukkit.getWorld(worldName).getSpawnLocation());

    }

}
