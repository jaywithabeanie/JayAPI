package me.jayy.jayapi.Managers.Rank.Utils;

import me.jayy.jayapi.Managers.Config.Config_Manager;
import me.jayy.jayapi.Managers.Rank.Rank_Manager;
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
        YamlConfiguration configuration = Config_Manager.getConfig(".JayAPI.Ranks", rank);
        List<String> currentPermissions = configuration.getStringList(rank + ".Permissions");
        if (currentPermissions == null) currentPermissions = new ArrayList<>();

        // Get SubRank Permissions
        for (String subRank : Rank_Manager.getSubRanks(rank)) {
            for (String permission : Rank_Manager.getRankPermissions(subRank)) {
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
