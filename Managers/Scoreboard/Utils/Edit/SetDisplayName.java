package me.jaypeg.jayapi.Managers.Scoreboard.Utils.Edit;

import me.jaypeg.jayapi.Managers.Scoreboard.Scoreboard_Manager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class SetDisplayName {

    public static void SetDisplayName(Player player, String boardName, String displayName) {

        Scoreboard scoreboard = Scoreboard_Manager.personalScoreboard.get(player.getUniqueId());
        Objective objective = scoreboard.getObjective(boardName);
        objective.setDisplayName(ChatColor.translateAlternateColorCodes('&', displayName));

        Scoreboard_Manager.personalScoreboard.put(player.getUniqueId(), scoreboard);
        player.setScoreboard(scoreboard);

    }

}
