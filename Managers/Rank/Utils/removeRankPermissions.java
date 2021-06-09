package me.jaypeg.jayapi.Managers.Rank.Utils;

import me.jaypeg.jayapi.Managers.Config.Config_Manager;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.ArrayList;
import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Removes one or more Permissions from a Rank */

public class removeRankPermissions {


    /** --------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                         */
    /** @UtilInfo       Removes one or more Permissions from a Rank                       */
    /** @ParameterInfo  • rank: Rank to remove one or more Permissions from               */
    /**                 • permission(s): Permission(s) to remove from the Rank            */
    /** --------------------------------------------------------------------------------- */
    /**                                                                                   */
    public static void removeRankPermission(String rank, String permission) {

        // Get Rank Permissions
        YamlConfiguration configuration = Config_Manager.getConfig(".JayAPI.Ranks", rank);
        List<String> currentPermissions = configuration.getStringList(rank + ".Permissions");
        if (currentPermissions == null) currentPermissions = new ArrayList<>();

        // Remove Permission
        currentPermissions.remove(permission);
        configuration.set(rank + ".Permissions", currentPermissions);

        // Save Permissions
        Config_Manager.saveConfig(".JayAPI.Ranks", rank, configuration);

    }
    /**                                                                                   */
    public static void removeRankPermissions(String rank, List<String> permissions) {

        // Get Rank Permissions
        YamlConfiguration configuration = Config_Manager.getConfig(".JayAPI.Ranks", rank);
        List<String> currentPermissions = configuration.getStringList(rank + ".Permissions");
        if (currentPermissions == null) currentPermissions = new ArrayList<>();

        // Remove Permissions
        currentPermissions.removeAll(permissions);
        configuration.set(rank + ".Permissions", currentPermissions);

        // Save Permissions
        Config_Manager.saveConfig(".JayAPI.Ranks", rank, configuration);

    }
    /**                                                                                   */
    /** --------------------------------------------------------------------------------- */


}
