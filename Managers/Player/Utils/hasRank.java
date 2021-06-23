package net.perforce.jayapi.Managers.Player.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Player.Player_Manager;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Checks whether the Player has a Rank */

public class hasRank {


    /** ----------------------------------------------------------- */
    /** @UtilType       Boolean Util                                */
    /** @UtilInfo       Checks whether the Player has a Rank        */
    /** @ParameterInfo  • UUID: UUID of the Player                  */
    /**                 • player: Player to check the Rank of       */
    /**                 • rank: Rank to check                       */
    /** ----------------------------------------------------------- */
    /**                                                             */
    public static boolean hasRank(String UUID, String rank) {

        return JayAPI.player_manager.getRank(UUID).equals(rank);

    }
    /**                                                             */
    public static boolean hasRank(Player player, String rank) {

        return JayAPI.player_manager.getRank(player).equals(rank);

    }
    /**                                                             */
    /** ----------------------------------------------------------- */


}
