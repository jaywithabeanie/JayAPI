package net.perforce.jayapi.Managers.Rank.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import net.perforce.jayapi.Managers.Config.Utils.createConfig;
import net.perforce.jayapi.Managers.Rank.Rank_Manager;
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
        JayAPI.config_manager.createConfig(".Ranks", rank);

        // Set Prefix
        JayAPI.rank_manager.setPrefix(rank, color + "[" + rank + "] ");

        // Set Staff
        JayAPI.rank_manager.setStaff(rank, staff);

        // Set SubRanks
        JayAPI.rank_manager.setSubRanks(rank, subRanks);

        // Grant Permissions
        JayAPI.rank_manager.grantRankPermission(rank, permission);

    }
    /**                                                                                                                                       */
    public static void addRank(String rank, Color color, boolean staff, List<String> subRanks, List<String> permissions) {

        // Create Config
        JayAPI.config_manager.createConfig(".Ranks", rank);

        // Set Prefix
        JayAPI.rank_manager.setPrefix(rank, color + "[" + rank + "] ");

        // Set Staff
        JayAPI.rank_manager.setStaff(rank, staff);

        // Set SubRanks
        JayAPI.rank_manager.setSubRanks(rank, subRanks);

        // Grant Permissions
        JayAPI.rank_manager.grantRankPermissions(rank, permissions);

    }
    /**                                                                                                                                       */
    public static void addRank(String rank, Color color, String prefix, boolean staff, List<String> subRanks, String permission) {

        // Create Config
        JayAPI.config_manager.createConfig(".Ranks", rank);

        // Set Prefix
        JayAPI.rank_manager.setPrefix(rank, color + "[" + prefix + "] ");

        // Set Staff
        JayAPI.rank_manager.setStaff(rank, staff);

        // Set SubRanks
        JayAPI.rank_manager.setSubRanks(rank, subRanks);

        // Grant Permissions
        JayAPI.rank_manager.grantRankPermission(rank, permission);

    }
    /**                                                                                                                                       */
    public static void addRank(String rank, Color color, String prefix, boolean staff, List<String> subRanks, List<String> permissions) {

        // Create Config
        JayAPI.config_manager.createConfig(".Ranks", rank);

        // Set Prefix
        JayAPI.rank_manager.setPrefix(rank, color + "[" + prefix + "] ");

        // Set Staff
        JayAPI.rank_manager.setStaff(rank, staff);

        // Set SubRanks
        JayAPI.rank_manager.setSubRanks(rank, subRanks);

        // Grant Permissions
        JayAPI.rank_manager.grantRankPermissions(rank, permissions);

    }
    /**                                                                                                                                       */
    /** ------------------------------------------------------------------------------------------------------------------------------------- */


}
