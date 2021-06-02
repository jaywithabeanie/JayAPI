package me.jaypeg.jayapi.Managers.Message.Utils;

import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ActionbarSender {

    public static void ActionbarSender(Player player, String message) {
        player.sendMessage(ChatMessageType.ACTION_BAR + message);
    }

    public static void ActionbarSender(String playerName, String message) {
        Bukkit.getPlayer(playerName).sendMessage(ChatMessageType.ACTION_BAR + message);
    }

    public static void ActionbarSender(String message) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage(ChatMessageType.ACTION_BAR + message);
        }
    }

}
