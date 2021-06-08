package me.jaypeg.jayapi.Managers.Player.Utils;

import me.jaypeg.jayapi.Managers.Player.Player_Manager;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Checks whether the Player has a Rank */

public class hasRank {


    /** ------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Boolean Util                                                                                  */
    /** @UtilInfo       Checks whether the Player has a Rank                                                          */
    /** @ParameterInfo  • UUID: UUID of the Player                                                                    */
    /**                 • Player: Player to check the Rank of                                                         */
    /** ------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                               */
    public static boolean hasRank(String UUID, String rank) {
        return Player_Manager.getRank(UUID).equals(rank);
    }
    /**                                                                                                               */
    public static boolean hasRank(Player player, String rank) {
        return Player_Manager.getRank(player).equals(rank);
    }
    /**                                                                                                               */
    /** ------------------------------------------------------------------------------------------------------------- */


}