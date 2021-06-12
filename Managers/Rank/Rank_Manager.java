package me.jayy.jayapi.Managers.Rank;

import me.jayy.jayapi.Managers.Rank.Utils.*;
import org.bukkit.Color;

import java.util.List;


/** @ClassType Manager Class */
/** @ClassInfo Manages Ranks */

public class Rank_Manager {


    /** ------------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                                             */
    /** @UtilInfo       Adds a Rank with given data                                                                                           */
    /** @ParameterInfo  • rank: Name of the Rank                                                                                              */
    /**                 • color: Color of the Rank                                                                                            */
    /**                 • prefix: Prefix of the Rank                                                                                          */
    /**                 • staff: Whether the Rank is considered Staff                                                                         */
    /**                 • subRanks: SubRanks of a Rank (inherits Permissions)                                                                 */
    /**                 • permission(s): Permission(s) to grant the Rank                                                                      */
    /** ------------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                       */
    public static void addRank(String rank, Color color, boolean staff, List<String> subRanks, String permission) {
        addRank.addRank(rank, color, staff, subRanks, permission);
    }
    /**                                                                                                                                       */
    public static void addRank(String rank, Color color, boolean staff, List<String> subRanks, List<String> permissions) {
        addRank.addRank(rank, color, staff, subRanks, permissions);
    }
    /**                                                                                                                                       */
    public static void addRank(String rank, Color color, String prefix, boolean staff, List<String> subRanks, String permission) {
        addRank.addRank(rank, color, prefix, staff, subRanks, permission);
    }
    /**                                                                                                                                       */
    public static void addRank(String rank, Color color, String prefix, boolean staff, List<String> subRanks, List<String> permissions) {
        addRank.addRank(rank, color, prefix, staff, subRanks, permissions);
    }
    /**                                                                                                                                       */
    /** ------------------------------------------------------------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------- */
    /** @UtilType       String Util                                                   */
    /** @UtilInfo       Returns the Prefix of a Rank                                  */
    /** @ParameterInfo  • rank: Rank to get the Prefix of                             */
    /** ----------------------------------------------------------------------------- */
    /**                                                                               */
    public static String getPrefix(String rank) {
        return getPrefix.getPrefix(rank);
    }
    /**                                                                               */
    /** ----------------------------------------------------------------------------- */


    /** -------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       List<String> Util                                                                              */
    /** @UtilInfo       Returns the Permissions of a Rank                                                              */
    /** @ParameterInfo  • rank: Rank to get the Permissions of                                                         */
    /** -------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                */
    public static List<String> getRankPermissions(String rank) {
        return getRankPermissions.getRankPermissions(rank);
    }
    /**                                                                                                                */
    /** -------------------------------------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------------------- */
    /** @UtilType       List<String> Util                                                         */
    /** @UtilInfo       Returns the SubRanks of a Rank                                            */
    /** @ParameterInfo  • rank: Rank to get the SubRanks of                                       */
    /** ----------------------------------------------------------------------------------------- */
    /**                                                                                           */
    public static List<String> getSubRanks(String rank) {
        return getSubRanks.getSubRanks(rank);
    }
    /**                                                                                           */
    /** ----------------------------------------------------------------------------------------- */


    /** -------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                        */
    /** @UtilInfo       Grants one or more Permissions to a Rank                         */
    /** @ParameterInfo  • rank: Rank to add one or more Permissions to                   */
    /**                 • permission(s): Permission(s) to grant                          */
    /** -------------------------------------------------------------------------------- */
    /**                                                                                  */
    public static void grantRankPermission(String rank, String permission) {
        grantRankPermissions.grantRankPermission(rank, permission);
    }
    /**                                                                                  */
    public static void grantRankPermissions(String rank, List<String> permissions) {
        grantRankPermissions.grantRankPermissions(rank, permissions);
    }
    /**                                                                                  */
    /** -------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------- */
    /** @UtilType       Boolean Util                                                  */
    /** @UtilInfo       Checks whether a Rank has the given Permission(s)             */
    /** @ParameterInfo  • rank: Rank to check of whether it has given Permission(s)   */
    /**                 • permission(s): Permission(s) to check                       */
    /** ----------------------------------------------------------------------------- */
    /**                                                                               */
    public static boolean hasPermission(String rank, String permission) {
        return hasPermissions.hasPermission(rank, permission);
    }
    /**                                                                               */
    public static boolean hasPermissions(String rank, List<String> permissions) {
        return hasPermissions.hasPermissions(rank, permissions);
    }
    /**                                                                               */
    /** ----------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------ */
    /** @UtilType       Boolean Util                                             */
    /** @UtilInfo       Checks whether a Rank is considered Staff                */
    /** @ParameterInfo  • rank: Rank to check of whether it's considered Staff   */
    /** ------------------------------------------------------------------------ */
    /**                                                                          */
    public static boolean isStaff(String rank) {
        return isStaff.isStaff(rank);
    }
    /**                                                                          */
    /** ------------------------------------------------------------------------ */


    /** ----------------------------------------------------------------------- */
    /** @UtilType       Void Util                                               */
    /** @UtilInfo       Removes a Rank                                          */
    /** @ParameterInfo  • rank: Rank to removeScoreboard                                  */
    /** ----------------------------------------------------------------------- */
    /**                                                                         */
    public static void removeRank(String rank) {
        removeRank.removeRank(rank);
    }
    /**                                                                         */
    /** ----------------------------------------------------------------------- */


    /** --------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                         */
    /** @UtilInfo       Removes one or more Permissions from a Rank                       */
    /** @ParameterInfo  • rank: Rank to removeScoreboard one or more Permissions from               */
    /**                 • permission(s): Permission(s) to removeScoreboard from the Rank            */
    /** --------------------------------------------------------------------------------- */
    /**                                                                                   */
    public static void removeRankPermission(String rank, String permission) {
        removeRankPermissions.removeRankPermission(rank, permission);
    }
    /**                                                                                   */
    public static void removeRankPermissions(String rank, List<String> permissions) {
        removeRankPermissions.removeRankPermissions(rank, permissions);
    }
    /**                                                                                   */
    /** --------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                   */
    /** @UtilInfo       Sets the Prefix of a Rank                                                   */
    /** @ParameterInfo  • rank: Rank to set the Prefix of                                           */
    /**                 • prefix: Prefix of the Rank                                                */
    /** ------------------------------------------------------------------------------------------- */
    /**                                                                                             */
    public static void setPrefix(String rank, String prefix) {
        setPrefix.setPrefix(rank, prefix);
    }
    /**                                                                                             */
    /** ------------------------------------------------------------------------------------------- */


    /** --------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                               */
    /** @UtilInfo       Changes whether a Rank is considered Staff                              */
    /** @ParameterInfo  • rank: Rank to set or removeScoreboard from Staff                                */
    /**                 • staff: Whether the Rank is considered Staff                           */
    /** --------------------------------------------------------------------------------------- */
    /**                                                                                         */
    public static void setStaff(String rank, boolean staff) {
        setStaff.setStaff(rank, staff);
    }
    /**                                                                                         */
    /** --------------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                   */
    /** @UtilInfo       Sets the SubRanks of a Rank (inherits Permissions)                                         */
    /** @ParameterInfo  • rank: Rank to set the Sub-Ranks of                                                        */
    /**                 • subRanks: SubRanks to add to the Rank                                                     */
    /** ----------------------------------------------------------------------------------------------------------- */
    /**                                                                                                             */
    public static void setSubRanks(String rank, List<String> subRanks) {
        setSubRanks.setSubRanks(rank, subRanks);
    }
    /**                                                                                                             */
    /** ----------------------------------------------------------------------------------------------------------- */


}
