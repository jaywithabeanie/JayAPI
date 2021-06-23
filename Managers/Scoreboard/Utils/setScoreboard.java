package net.perforce.jayapi.Managers.Scoreboard.Utils;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;


/** @ClassType Util Class */
/** @ClassInfo Sets the Scoreboard of a Player */

public class setScoreboard {


    /** ------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                */
    /** @UtilInfo       Sets the Scoreboard of a Player                          */
    /** @ParameterInfo  • player: Player the Scoreboard will be updated for      */
    /**                 • scoreboard: Scoreboard the Player will receive         */
    /** ------------------------------------------------------------------------ */
    /**                                                                          */
    public static void setScoreboard(Player player, Scoreboard scoreboard) {

        player.setScoreboard(scoreboard);

    }
    /**                                                                          */
    /** ------------------------------------------------------------------------ */


}
