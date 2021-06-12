package me.jayy.jayapi.Managers.Player.Utils;

import me.jayy.jayapi.Managers.Player.Player_Manager;
import me.jayy.jayapi.Managers.Rank.Rank_Manager;
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

         return Rank_Manager.isStaff(Player_Manager.getRank(UUID));

    }
    /**                                                                               */
    public static boolean isStaff(Player player) {

        String UUID = player.getUniqueId().toString();
        return Rank_Manager.isStaff(Player_Manager.getRank(UUID));

    }
    /** ----------------------------------------------------------------------------- */


}
