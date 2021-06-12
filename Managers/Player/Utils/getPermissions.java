package me.jayy.jayapi.Managers.Player.Utils;

import me.jayy.jayapi.Managers.Player.Player_Manager;
import me.jayy.jayapi.Managers.Rank.Rank_Manager;
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

        return Rank_Manager.getRankPermissions(Player_Manager.getRank(UUID));

    }
    /**                                                               */
    public static List<String> getPermissions(Player player) {

        String UUID = player.getUniqueId().toString();
        return Rank_Manager.getRankPermissions(Player_Manager.getRank(UUID));

    }
    /**                                                               */
    /** ------------------------------------------------------------- */


}
