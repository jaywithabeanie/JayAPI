package me.jayy.jayapi.Managers.Rank.Utils;

import me.jayy.jayapi.Managers.Config.Config_Manager;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.ArrayList;
import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Grants one or more Permissions to a Rank */

public class grantRankPermissions {


    /** -------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                        */
    /** @UtilInfo       Grants one or more Permissions to a Rank                         */
    /** @ParameterInfo  • rank: Rank to add one or more Permissions to                   */
    /**                 • permission(s): Permission(s) to grant                          */
    /** -------------------------------------------------------------------------------- */
    /**                                                                                  */
    public static void grantRankPermission(String rank, String permission) {

        // Get Rank Permissions
        YamlConfiguration configuration = Config_Manager.getConfig(".JayAPI.Ranks", rank);
        List<String> currentPermissions = configuration.getStringList(rank + ".Permissions");
        if (currentPermissions == null) currentPermissions = new ArrayList<>();

        // Add Permission
        currentPermissions.add(permission);
        configuration.set(rank + ".Permissions", currentPermissions);

        // Save Permissions
        Config_Manager.saveConfig(".JayAPI.Ranks", rank, configuration);

    }
    /**                                                                                  */
    public static void grantRankPermissions(String rank, List<String> permissions) {

        // Get Rank Permissions
        YamlConfiguration configuration = Config_Manager.getConfig(".JayAPI.Ranks", rank);
        List<String> currentPermissions = configuration.getStringList(rank + ".Permissions");
        if (currentPermissions == null) currentPermissions = new ArrayList<>();

        // Add Permissions
        currentPermissions.addAll(permissions);
        configuration.set(rank + ".Permissions", currentPermissions);

        // Save Permissions
        Config_Manager.saveConfig(".JayAPI.Ranks", rank, configuration);

    }
    /**                                                                                  */
    /** -------------------------------------------------------------------------------- */


}
