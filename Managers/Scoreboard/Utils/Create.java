package me.jaypeg.jayapi.Managers.Scoreboard.Utils;

import me.jaypeg.jayapi.Managers.Scoreboard.Scoreboard_Manager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class Create {

    public static void Create(String boardName, Player player, String boardTitle, String line, int value) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard board = manager.getNewScoreboard();

        Objective objective = board.registerNewObjective(boardName, "dummy");
        objective.setDisplayName(ChatColor.translateAlternateColorCodes('&', boardTitle));
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        Score score = objective.getScore(line);
        score.setScore(value);
        player.setScoreboard(board);

        Scoreboard_Manager.personalScoreboard.put(player.getUniqueId(), board);
    }

}
