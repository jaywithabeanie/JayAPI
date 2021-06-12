package me.jayy.jayapi.Managers.Scoreboard.Utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Removes the Scoreboard of a Player */

public class removeScoreboard {


    /** -------------------------------------------------------------- */
    /** @UtilType       Void Util                                      */
    /** @UtilInfo       Removes the Scoreboard of a Player             */
    /** @ParameterInfo  • player: Player to remove the Scoreboard from */
    /** -------------------------------------------------------------- */
    /**                                                                */
    public static void removeScoreboard(Player player) {

        player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());

    }
    /**                                                                */
    /** -------------------------------------------------------------- */


}
