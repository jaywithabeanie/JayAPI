package me.jaypeg.jayapi.Managers.Scoreboard.Utils;

import me.jaypeg.jayapi.Managers.Scoreboard.Scoreboard_Manager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Remove {

    public static void Remove(Player player) {
        Scoreboard_Manager.personalScoreboard.remove(player.getUniqueId());
        player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
    }

}
