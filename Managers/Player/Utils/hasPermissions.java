package net.perforce.jayapi.Managers.Player.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Player.Player_Manager;
import org.bukkit.entity.Player;

import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Checks whether the Player has one or more Permissions */

public class hasPermissions {


    /** ------------------------------------------------------------------------------- */
    /** @UtilType       Boolean Util                                                    */
    /** @UtilInfo       Checks whether the Player has one or more Permissions           */
    /** @ParameterInfo  • UUID: UUID of the Player                                      */
    /**                 • player: Player to check the Permission(s) of                  */
    /**                 • permission(s): Permission(s) to check                         */
    /** ------------------------------------------------------------------------------- */
    /**                                                                                 */
    public static boolean hasPermission(String UUID, String permission) {

        return JayAPI.player_manager.getPermissions(UUID).contains(permission);

    }
    /**                                                                                 */
    public static boolean hasPermission(Player player, String permission) {

        return JayAPI.player_manager.getPermissions(player).contains(permission);

    }
    /**                                                                                 */
    public static boolean hasPermissions(String UUID, List<String> permissions) {

        List<String> playerPermissions = JayAPI.player_manager.getPermissions(UUID);
        for (String permission : permissions) {
            if (!playerPermissions.contains(permission))
                return false;
        }

        return true;

    }
    /**                                                                                 */
    public static boolean hasPermissions(Player player, List<String> permissions) {

        List<String> playerPermissions = JayAPI.player_manager.getPermissions(player);
        for (String permission : permissions) {
            if (!playerPermissions.contains(permission))
                return false;
        }

        return true;

    }
    /**                                                                                 */
    /** ------------------------------------------------------------------------------- */


}
