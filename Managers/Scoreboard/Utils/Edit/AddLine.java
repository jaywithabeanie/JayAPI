package me.jaypeg.jayapi.Managers.Scoreboard.Utils.Edit;

import me.jaypeg.jayapi.Managers.Scoreboard.Scoreboard_Manager;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class AddLine {

    public static void AddLine(Player player, String boardName, String line, int value) {

        Scoreboard scoreboard = Scoreboard_Manager.personalScoreboard.get(player.getUniqueId());
        Objective objective = scoreboard.getObjective(boardName);
        Score score = objective.getScore(line);
        score.setScore(value);

        Scoreboard_Manager.personalScoreboard.put(player.getUniqueId(), scoreboard);
        player.setScoreboard(scoreboard);
    }

}
