package net.perforce.jayapi.Managers.Scoreboard.Utils;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;


/** @ClassType Util Class */
/** @ClassInfo Removes a line of text from the Scoreboard of a Player */

public class removeLine {


    /** -------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                  */
    /** @UtilInfo       Removes a Line of text from the Scoreboard of a Player     */
    /** @ParameterInfo  • player: Player to remove a Line from the Scoreboard from */
    /**                 • lines: Line to remove from the Scoreboard                */
    /** -------------------------------------------------------------------------- */
    /**                                                                            */
    public static void removeLine(Player player, String line) {

        // Get Scoreboard
        Scoreboard scoreboard = player.getScoreboard();

        // Remove Line
        scoreboard.resetScores(line);

        // Set Scoreboard
        player.setScoreboard(scoreboard);

    }
    /**                                                                            */
    /** -------------------------------------------------------------------------- */


}
