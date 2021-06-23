package net.perforce.jayapi.Managers.Scoreboard.Utils;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;


/** @ClassType Util Class */
/** @ClassInfo Sets the Title of a Scoreboard */

public class setTitle {


    /** -------------------------------------------------------------------- */
    /** @UtilType       Void Util                                            */
    /** @UtilInfo       Sets the Title of a Scoreboard                       */
    /** @ParameterInfo  • player: Player set the Title of the Scoreboard for */
    /**                 • title: Title of the Scoreboard                     */
    /** -------------------------------------------------------------------- */
    /**                                                                      */
    public static void setTitle(Player player, String title) {

        // Get Scoreboard
        Scoreboard scoreboard = player.getScoreboard();

        // Set Display Name
        Objective objective = scoreboard.getObjective(DisplaySlot.SIDEBAR);
        objective.setDisplayName(title);

        // Set Scoreboard
        player.setScoreboard(scoreboard);

    }
    /**                                                                      */
    /** -------------------------------------------------------------------- */


}
