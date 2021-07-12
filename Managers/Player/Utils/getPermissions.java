package net.perforce.jayapi.Managers.Player.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Player.Player_Manager;
import net.perforce.jayapi.Managers.Rank.Rank_Manager;
import org.bukkit.entity.Player;

import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Returns a list of all Permissions of a Player */

public class getPermissions {


    /** ------------------------------------------------------------- */
    /** @UtilType       List<String> Util                             */
    /** @UtilInfo       Returns a list of all Permissions of a Player */
    /** @ParameterInfo  • UUID: UUID of the Player                    */
    /**                 • player: Player to get the Permissions of    */
    /** ------------------------------------------------------------- */
    /**                                                               */
    public static List<String> getPermissions(String UUID) {

        return JayAPI.rank_manager.getRankPermissions(JayAPI.player_manager.getRank(UUID));

    }
    /**                                                               */
    public static List<String> getPermissions(Player player) {

        String UUID = player.getUniqueId().toString();
        return JayAPI.rank_manager.getRankPermissions(JayAPI.player_manager.getRank(UUID));

    }
    /**                                                               */
    /** ------------------------------------------------------------- */


}
