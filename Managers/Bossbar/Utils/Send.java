package me.jaypeg.jayapi.Managers.Bossbar.Utils;

import me.jaypeg.jayapi.Managers.Bossbar.Bar;
import me.jaypeg.jayapi.Managers.Bossbar.Bossbar_Manager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Send {

    public static void Send(Player player, String message) {
        if (!Bossbar_Manager.ActiveBossbar.containsKey(player.getUniqueId()))
            Bossbar_Manager.ActiveBossbar.put(player.getUniqueId(), new Bar(player, ChatColor.translateAlternateColorCodes('&', message)));
    }

}
