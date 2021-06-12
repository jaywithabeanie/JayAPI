package me.jayy.jayapi.Managers.Rank.Utils;

import me.jayy.jayapi.Managers.Config.Config_Manager;
import me.jayy.jayapi.Managers.Rank.Rank_Manager;
import org.bukkit.Color;

import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Adds a Rank with given data */

public class addRank {


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

        // Create Config
        Config_Manager.createConfig(".JayAPI.Ranks", rank);

        // Set Prefix
        Rank_Manager.setPrefix(rank, color + "[" + rank + "] ");

        // Set Staff
        Rank_Manager.setStaff(rank, staff);

        // Set SubRanks
        Rank_Manager.setSubRanks(rank, subRanks);

        // Grant Permissions
        Rank_Manager.grantRankPermission(rank, permission);

    }
    /**                                                                                                                                       */
    public static void addRank(String rank, Color color, boolean staff, List<String> subRanks, List<String> permissions) {

        // Create Config
        Config_Manager.createConfig(".JayAPI.Ranks", rank);

        // Set Prefix
        Rank_Manager.setPrefix(rank, color + "[" + rank + "] ");

        // Set Staff
        Rank_Manager.setStaff(rank, staff);

        // Set SubRanks
        Rank_Manager.setSubRanks(rank, subRanks);

        // Grant Permissions
        Rank_Manager.grantRankPermissions(rank, permissions);

    }
    /**                                                                                                                                       */
    public static void addRank(String rank, Color color, String prefix, boolean staff, List<String> subRanks, String permission) {

        // Create Config
        Config_Manager.createConfig(".JayAPI.Ranks", rank);

        // Set Prefix
        Rank_Manager.setPrefix(rank, color + "[" + prefix + "] ");

        // Set Staff
        Rank_Manager.setStaff(rank, staff);

        // Set SubRanks
        Rank_Manager.setSubRanks(rank, subRanks);

        // Grant Permissions
        Rank_Manager.grantRankPermission(rank, permission);

    }
    /**                                                                                                                                       */
    public static void addRank(String rank, Color color, String prefix, boolean staff, List<String> subRanks, List<String> permissions) {

        // Create Config
        Config_Manager.createConfig(".JayAPI.Ranks", rank);

        // Set Prefix
        Rank_Manager.setPrefix(rank, color + "[" + prefix + "] ");

        // Set Staff
        Rank_Manager.setStaff(rank, staff);

        // Set SubRanks
        Rank_Manager.setSubRanks(rank, subRanks);

        // Grant Permissions
        Rank_Manager.grantRankPermissions(rank, permissions);

    }
    /**                                                                                                                                       */
    /** ------------------------------------------------------------------------------------------------------------------------------------- */


}
