package net.perforce.jayapi.Managers.Rank.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import net.perforce.jayapi.Managers.Config.Utils.saveConfig;
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
        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".JayAPI.Ranks", rank);
        List<String> currentPermissions = configuration.getStringList(rank + ".Permissions");
        if (currentPermissions == null) currentPermissions = new ArrayList<>();

        // Add Permission
        currentPermissions.add(permission);
        configuration.set(rank + ".Permissions", currentPermissions);

        // Save Permissions
        JayAPI.config_manager.saveConfig(".JayAPI.Ranks", rank, configuration);

    }
    /**                                                                                  */
    public static void grantRankPermissions(String rank, List<String> permissions) {

        // Get Rank Permissions
        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".JayAPI.Ranks", rank);
        List<String> currentPermissions = configuration.getStringList(rank + ".Permissions");
        if (currentPermissions == null) currentPermissions = new ArrayList<>();

        // Add Permissions
        currentPermissions.addAll(permissions);
        configuration.set(rank + ".Permissions", currentPermissions);

        // Save Permissions
        JayAPI.config_manager.saveConfig(".JayAPI.Ranks", rank, configuration);

    }
    /**                                                                                  */
    /** -------------------------------------------------------------------------------- */


}
