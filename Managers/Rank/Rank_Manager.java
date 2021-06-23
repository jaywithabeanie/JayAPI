package net.perforce.jayapi.Managers.Rank;

import net.perforce.jayapi.Managers.Rank.Utils.*;
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
    public void addRank(String rank, Color color, boolean staff, List<String> subRanks, String permission) {
        addRank.addRank(rank, color, staff, subRanks, permission);
    }
    /**                                                                                                                                       */
    public void addRank(String rank, Color color, boolean staff, List<String> subRanks, List<String> permissions) {
        addRank.addRank(rank, color, staff, subRanks, permissions);
    }
    /**                                                                                                                                       */
    public void addRank(String rank, Color color, String prefix, boolean staff, List<String> subRanks, String permission) {
        addRank.addRank(rank, color, prefix, staff, subRanks, permission);
    }
    /**                                                                                                                                       */
    public void addRank(String rank, Color color, String prefix, boolean staff, List<String> subRanks, List<String> permissions) {
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
    public String getPrefix(String rank) {
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
    public List<String> getRankPermissions(String rank) {
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
    public List<String> getSubRanks(String rank) {
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
    public void grantRankPermission(String rank, String permission) {
        grantRankPermissions.grantRankPermission(rank, permission);
    }
    /**                                                                                  */
    public void grantRankPermissions(String rank, List<String> permissions) {
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
    public boolean hasPermission(String rank, String permission) {
        return hasPermissions.hasPermission(rank, permission);
    }
    /**                                                                               */
    public boolean hasPermissions(String rank, List<String> permissions) {
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
    public boolean isStaff(String rank) {
        return isStaff.isStaff(rank);
    }
    /**                                                                          */
    /** ------------------------------------------------------------------------ */


    /** ----------------------------------------------------------------------- */
    /** @UtilType       Void Util                                               */
    /** @UtilInfo       Removes a Rank                                          */
    /** @ParameterInfo  • rank: Rank to remove                                  */
    /** ----------------------------------------------------------------------- */
    /**                                                                         */
    public void removeRank(String rank) {
        removeRank.removeRank(rank);
    }
    /**                                                                         */
    /** ----------------------------------------------------------------------- */


    /** --------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                         */
    /** @UtilInfo       Removes one or more Permissions from a Rank                       */
    /** @ParameterInfo  • rank: Rank to remove one or more Permissions from               */
    /**                 • permission(s): Permission(s) to remove from the Rank            */
    /** --------------------------------------------------------------------------------- */
    /**                                                                                   */
    public void removeRankPermission(String rank, String permission) {
        removeRankPermissions.removeRankPermission(rank, permission);
    }
    /**                                                                                   */
    public void removeRankPermissions(String rank, List<String> permissions) {
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
    public void setPrefix(String rank, String prefix) {
        setPrefix.setPrefix(rank, prefix);
    }
    /**                                                                                             */
    /** ------------------------------------------------------------------------------------------- */


    /** --------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                               */
    /** @UtilInfo       Changes whether a Rank is considered Staff                              */
    /** @ParameterInfo  • rank: Rank to set or remove from Staff                                */
    /**                 • staff: Whether the Rank is considered Staff                           */
    /** --------------------------------------------------------------------------------------- */
    /**                                                                                         */
    public void setStaff(String rank, boolean staff) {
        setStaff.setStaff(rank, staff);
    }
    /**                                                                                         */
    /** --------------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                   */
    /** @UtilInfo       Sets the SubRanks of a Rank (inherits Permissions)                                          */
    /** @ParameterInfo  • rank: Rank to set the Sub-Ranks of                                                        */
    /**                 • subRanks: SubRanks to add to the Rank                                                     */
    /** ----------------------------------------------------------------------------------------------------------- */
    /**                                                                                                             */
    public void setSubRanks(String rank, List<String> subRanks) {
        setSubRanks.setSubRanks(rank, subRanks);
    }
    /**                                                                                                             */
    /** ----------------------------------------------------------------------------------------------------------- */


}
