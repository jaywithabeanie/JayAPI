package net.perforce.jayapi.Managers.Player;

import net.perforce.jayapi.Managers.Player.Utils.*;
import org.bukkit.entity.Player;

import java.util.List;


/** @ClassType Manager Class */
/** @ClassInfo Manages Players */

public class Player_Manager {


    /** ------------------------------------------------------------------------------------------------------------ */
    /** @UtilType       String Util                                                                                  */
    /** @UtilInfo       Returns the first Time and Date at which a Player first joined the server                    */
    /** @ParameterInfo  • UUID: UUID of the Player                                                                   */
    /**                 • player: Player to get the Time and Date from                                               */
    /** ------------------------------------------------------------------------------------------------------------ */
    /**                                                                                                              */
    public String getFirstDateJoined(String UUID) {
        return getFirstDateJoined.getFirstDateJoined(UUID);
    }
    /**                                                                                                              */
    public String getFirstDateJoined(Player player) {
        return getFirstDateJoined.getFirstDateJoined(player);
    }
    /**                                                                                                              */
    /** ------------------------------------------------------------------------------------------------------------ */


    /** --------------------------------------------------------------------------------------------------------- */
    /** @UtilType       String Util                                                                               */
    /** @UtilInfo       Returns the last Time and Date at which a Player joined the server                        */
    /** @ParameterInfo  • UUID: UUID of the Player                                                                */
    /**                 • player: Player to get the Time and Date from                                            */
    /** --------------------------------------------------------------------------------------------------------- */
    /**                                                                                                           */
    public String getLastDateJoined(String UUID) {
        return getLastDateJoined.getLastDateJoined(UUID);
    }
    /**                                                                                                           */
    public String getLastDateJoined(Player player) {
        return getLastDateJoined.getLastDateJoined(player);
    }
    /**                                                                                                           */
    /** --------------------------------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------- */
    /** @UtilType       String Util                                             */
    /** @UtilInfo       Returns the name of a Player                            */
    /** @ParameterInfo  • UUID: UUID of the Player                              */
    /** ----------------------------------------------------------------------- */
    /**                                                                         */
    public String getName(String UUID) {
        return getName.getName(UUID);
    }
    /**                                                                         */
    /** ----------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------------------ */
    /** @UtilType       List<String> Util                                                                      */
    /** @UtilInfo       Returns a list of all Permissions of a Player                                          */
    /** @ParameterInfo  • UUID: UUID of the Player                                                             */
    /**                 • player: Player to get the Permissions of                                             */
    /** ------------------------------------------------------------------------------------------------------ */
    /**                                                                                                        */
    public List<String> getPermissions(String UUID) {
        return getPermissions.getPermissions(UUID);
    }
    /**                                                                                                        */
    public List<String> getPermissions(Player player) {
        return getPermissions.getPermissions(player);
    }
    /**                                                                                                        */
    /** ------------------------------------------------------------------------------------------------------ */


    /** --------------------------------------------------------------------------- */
    /** @UtilType       String Util                                                 */
    /** @UtilInfo       Returns the Rank of a Player                                */
    /** @ParameterInfo  • UUID: UUID of the Player to get the Rank from             */
    /**                 • player: Player to get the Rank of                         */
    /** --------------------------------------------------------------------------- */
    /**                                                                             */
    public String getRank(String UUID) {
        return getRank.getRank(UUID);
    }
    /**                                                                             */
    public String getRank(Player player) {
        return getRank.getRank(player);
    }
    /**                                                                             */
    /** --------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------- */
    /** @UtilType       Boolean Util                                                    */
    /** @UtilInfo       Checks whether the Player has one or more Permissions           */
    /** @ParameterInfo  • UUID: UUID of the Player                                      */
    /**                 • player: Player to check the Permission(s) of                  */
    /**                 • permission(s): Permission(s) to check                         */
    /** ------------------------------------------------------------------------------- */
    /**                                                                                 */
    public boolean hasPermission(String UUID, String permission) {
        return hasPermissions.hasPermission(UUID, permission);
    }
    /**                                                                                 */
    public boolean hasPermission(Player player, String permission) {
        return hasPermissions.hasPermission(player, permission);
    }
    /**                                                                                 */
    public boolean hasPermissions(String UUID, List<String> permissions) {
        return hasPermissions.hasPermissions(UUID, permissions);
    }
    /**                                                                                 */
    public boolean hasPermissions(Player player, List<String> permissions) {
        return hasPermissions.hasPermissions(player, permissions);
    }
    /**                                                                                 */
    /** ------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------------------------- */
    /** @UtilType       Boolean Util                                                                    */
    /** @UtilInfo       Checks whether the Player has a Rank                                            */
    /** @ParameterInfo  • UUID: UUID of the Player                                                      */
    /**                 • player: Player to check the Rank of                                           */
    /**                 • rank: Rank to check                                                           */
    /** ----------------------------------------------------------------------------------------------- */
    /**                                                                                                 */
    public boolean hasRank(String UUID, String rank) {
        return hasRank.hasRank(UUID, rank);
    }
    /**                                                                                                 */
    public boolean hasRank(Player player, String rank) {
        return hasRank.hasRank(player, rank);
    }
    /**                                                                                                 */
    /** ----------------------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------- */
    /** @UtilType       Boolean Util                                                  */
    /** @UtilInfo       Checks whether a Player is considered Staff                   */
    /** @ParameterInfo  • UUID: UUID of the Player                                    */
    /**                 • player: Player to check of whether they're considered Staff */
    /** ----------------------------------------------------------------------------- */
    /**                                                                               */
    public boolean isStaff(String UUID) {
        return isStaff.isStaff(UUID);
    }
    /**                                                                               */
    public boolean isStaff(Player player) {
        return isStaff.isStaff(player);
    }
    /** ----------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                             */
    /** @UtilInfo       Sets the Rank of a Player                                             */
    /** @ParameterInfo  • UUID: UUID of the Player                                            */
    /**                 • player: Player to set the Rank of                                   */
    /**                 • rank: Rank to change to                                             */
    /** ------------------------------------------------------------------------------------- */
    /**                                                                                       */
    public void setRank(String UUID, String rank) {
        setRank.setRank(UUID, rank);
    }
    /**                                                                                       */
    public void setRank(Player player, String rank) {
        setRank.setRank(player, rank);
    }
    /**                                                                                       */
    /** ------------------------------------------------------------------------------------- */


}
