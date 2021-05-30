package me.jaypeg.jayapi.Managers.Message.Utils;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class MessageAnnouncer {

    public static void MessageAnnouncer(World world, String message) {

        for (Player player : Bukkit.getOnlinePlayers()) {
            if (player.getWorld() == world) {
                player.sendMessage(message);
            }
        }

    }

    public static void MessageAnnouncer(String worldName, String message) {

        for (Player player : Bukkit.getOnlinePlayers()) {
            if (player.getWorld() == Bukkit.getWorld(worldName)) {
                player.sendMessage(message);
            }
        }

    }

}
