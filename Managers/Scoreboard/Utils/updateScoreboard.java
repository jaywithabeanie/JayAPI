package me.jaypeg.jayapi.Managers.Scoreboard.Utils;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;


/** @ClassType Util Class */
/** @ClassInfo Updates the Scoreboard for a Player */

public class updateScoreboard {


    /** ----------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                   */
    /** @UtilInfo       Updates the Scoreboard for a Player                                                         */
    /** @ParameterInfo  • player: Player the Scoreboard will be updated for                                         */
    /**                 • scoreboard: Scoreboard the Player will receive                                            */
    /** ----------------------------------------------------------------------------------------------------------- */
    /**                                                                                                             */
    public static void updateScoreboard(Player player, Scoreboard scoreboard) {
        player.setScoreboard(scoreboard);
    }
    /**                                                                                                             */
    /** ----------------------------------------------------------------------------------------------------------- */


}
