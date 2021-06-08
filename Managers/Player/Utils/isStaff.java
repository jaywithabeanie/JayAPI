package me.jaypeg.jayapi.Managers.Player.Utils;

import me.jaypeg.jayapi.Managers.Player.Player_Manager;
import me.jaypeg.jayapi.Managers.Rank.Rank_Manager;
import org.bukkit.entity.Player;

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