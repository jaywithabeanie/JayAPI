package me.jaypeg.jayapi.Managers.Player.Utils;

import me.jaypeg.jayapi.Managers.Player.Player_Manager;
import me.jaypeg.jayapi.Managers.Rank.Rank_Manager;
import org.bukkit.entity.Player;

import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Checks whether the Player has one or more Permissions */

public class hasPermission {


    /** ------------------------------------------------------------------------------- */
    /** @UtilType       Boolean Util                                                    */
    /** @UtilInfo       Checks whether the Player has one or more Permissions           */
    /** @ParameterInfo  • UUID: UUID of the Player                                      */
    /**                 • Player: Player to check the Permission(s) of                  */
    /** ------------------------------------------------------------------------------- */
    /**                                                                                 */
    public static boolean hasPermission(String UUID, String permission) {

        return Player_Manager.getPermissions(UUID).contains(permission);

    }
    /**                                                                                 */
    public static boolean hasPermission(Player player, String permission) {

        return Player_Manager.getPermissions(player).contains(permission);

    }
    /**                                                                                 */
    public static boolean hasPermissions(String UUID, List<String> permissions) {

        List<String> playerPermissions = Player_Manager.getPermissions(UUID);
        for (String permission : permissions) {
            if (!playerPermissions.contains(permission))
                return false;
        }

        return true;

    }
    /**                                                                                 */
    public static boolean hasPermissions(Player player, List<String> permissions) {

        List<String> playerPermissions = Player_Manager.getPermissions(player);
        for (String permission : permissions) {
            if (!playerPermissions.contains(permission))
                return false;
        }

        return true;

    }
    /**                                                                                 */
    /** ------------------------------------------------------------------------------- */


}
