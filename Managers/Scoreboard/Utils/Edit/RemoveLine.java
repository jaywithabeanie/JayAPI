package me.jaypeg.jayapi.Managers.Scoreboard.Utils.Edit;

import me.jaypeg.jayapi.Managers.Scoreboard.Scoreboard_Manager;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

public class RemoveLine {

    public static void RemoveLine(Player player, String line) {

        Scoreboard scoreboard = Scoreboard_Manager.personalScoreboard.get(player.getUniqueId());
        scoreboard.resetScores(line);

        Scoreboard_Manager.personalScoreboard.put(player.getUniqueId(), scoreboard);
        player.setScoreboard(scoreboard);
    }

}
