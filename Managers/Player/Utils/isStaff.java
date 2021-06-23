package net.perforce.jayapi.Managers.Player.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Player.Player_Manager;
import net.perforce.jayapi.Managers.Rank.Rank_Manager;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Checks whether a Player is considered Staff */

public class isStaff {


    /** ----------------------------------------------------------------------------- */
    /** @UtilType       Boolean Util                                                  */
    /** @UtilInfo       Checks whether a Player is considered Staff                   */
    /** @ParameterInfo  • UUID: UUID of the Player                                    */
    /**                 • player: Player to check of whether they're considered Staff */
    /** ----------------------------------------------------------------------------- */
    /**                                                                               */
    public static boolean isStaff(String UUID) {

         return JayAPI.rank_manager.isStaff(JayAPI.player_manager.getRank(UUID));

    }
    /**                                                                               */
    public static boolean isStaff(Player player) {

        String UUID = player.getUniqueId().toString();
        return JayAPI.rank_manager.isStaff(JayAPI.player_manager.getRank(UUID));

    }
    /** ----------------------------------------------------------------------------- */


}
