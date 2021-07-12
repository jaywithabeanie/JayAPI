package net.perforce.jayapi.Managers.Rank.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import net.perforce.jayapi.Managers.Rank.Rank_Manager;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.ArrayList;
import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Returns the Permissions of a Rank */

public class getRankPermissions {


    /** ------------------------------------------------------------ */
    /** @UtilType       List<String> Util                            */
    /** @UtilInfo       Returns the Permissions of a Rank            */
    /** @ParameterInfo  • rank: Rank to get the Permissions of       */
    /** ------------------------------------------------------------ */
    /**                                                              */
    public static List<String> getRankPermissions(String rank) {

        // Get Rank Permissions
        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".Ranks", rank);
        List<String> currentPermissions = configuration.getStringList(rank + ".Permissions");
        if (currentPermissions == null) currentPermissions = new ArrayList<>();

        // Get SubRank Permissions
        for (String subRank : JayAPI.rank_manager.getSubRanks(rank)) {
            for (String permission : JayAPI.rank_manager.getRankPermissions(subRank)) {
                if (!currentPermissions.contains(permission))
                    currentPermissions.add(permission);
            }
        }

        // Return Permissions
        return currentPermissions;

    }
    /**                                                              */
    /** ------------------------------------------------------------ */


}
