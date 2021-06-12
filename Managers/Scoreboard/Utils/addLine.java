package me.jayy.jayapi.Managers.Scoreboard.Utils;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;


/** @ClassType Util Class */
/** @ClassInfo Adds a line to the Scoreboard of a Player */

public class addLine {


    /** ------------------------------------------------------------------- */
    /** @UtilType       Void Util                                           */
    /** @UtilInfo       Adds a line to the Scoreboard of a Player           */
    /** @ParameterInfo  • player: Player to add a Line to the Scoreboard of */
    /**                 • lines: Line to add to the Scoreboard              */
    /** ------------------------------------------------------------------- */
    /**                                                                     */
    public static void addLine(Player player, String text, int value) {

        // Get Scoreboard
        Scoreboard scoreboard = player.getScoreboard();

        // Add Line
        Objective objective = scoreboard.getObjective(DisplaySlot.SIDEBAR);
        Score score = objective.getScore(text);
        score.setScore(value);

        // Set Scoreboard
        player.setScoreboard(scoreboard);

    }
    /**                                                                     */
    /** ------------------------------------------------------------------- */


}
