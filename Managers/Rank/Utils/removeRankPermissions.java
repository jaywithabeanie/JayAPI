package net.perforce.jayapi.Managers.Rank.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import net.perforce.jayapi.Managers.Config.Utils.saveConfig;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.ArrayList;
import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Removes one or more Permissions from a Rank */

public class removeRankPermissions {


    /** --------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                         */
    /** @UtilInfo       Removes one or more Permissions from a Rank                       */
    /** @ParameterInfo  • rank: Rank to removeScoreboard one or more Permissions from               */
    /**                 • permission(s): Permission(s) to removeScoreboard from the Rank            */
    /** --------------------------------------------------------------------------------- */
    /**                                                                                   */
    public static void removeRankPermission(String rank, String permission) {

        // Get Rank Permissions
        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".JayAPI.Ranks", rank);
        List<String> currentPermissions = configuration.getStringList(rank + ".Permissions");
        if (currentPermissions == null) currentPermissions = new ArrayList<>();

        // removeScoreboard Permission
        currentPermissions.remove(permission);
        configuration.set(rank + ".Permissions", currentPermissions);

        // Save Permissions
        JayAPI.config_manager.saveConfig(".JayAPI.Ranks", rank, configuration);

    }
    /**                                                                                   */
    public static void removeRankPermissions(String rank, List<String> permissions) {

        // Get Rank Permissions
        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".JayAPI.Ranks", rank);
        List<String> currentPermissions = configuration.getStringList(rank + ".Permissions");
        if (currentPermissions == null) currentPermissions = new ArrayList<>();

        // removeScoreboard Permissions
        currentPermissions.removeAll(permissions);
        configuration.set(rank + ".Permissions", currentPermissions);

        // Save Permissions
        JayAPI.config_manager.saveConfig(".JayAPI.Ranks", rank, configuration);

    }
    /**                                                                                   */
    /** --------------------------------------------------------------------------------- */


}
