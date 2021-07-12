package net.perforce.jayapi.Managers.Rank.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Rank.Rank_Manager;

import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Checks whether a Rank has the given Permission(s) */

public class hasPermissions {


    /** ----------------------------------------------------------------------------- */
    /** @UtilType       Boolean Util                                                  */
    /** @UtilInfo       Checks whether a Rank has the given Permission(s)             */
    /** @ParameterInfo  • rank: Rank to check of whether it has given Permission(s)   */
    /**                 • permission(s): Permission(s) to check                       */
    /** ----------------------------------------------------------------------------- */
    /**                                                                               */
    public static boolean hasPermission(String rank, String permission) {

        // Check Rank Permissions
        return JayAPI.rank_manager.getRankPermissions(rank).contains(permission);

    }
    /**                                                                               */
    public static boolean hasPermissions(String rank, List<String> permissions) {

        // Check Each Permission
        for (String permission : permissions) {
            if (!JayAPI.rank_manager.hasPermission(rank, permission))
                return false;
        }

        // Return True if the Rank has Every Permission
        return true;

    }
    /**                                                                               */
    /** ----------------------------------------------------------------------------- */


}
