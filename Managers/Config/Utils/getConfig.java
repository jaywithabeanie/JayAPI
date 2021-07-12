package net.perforce.jayapi.Managers.Config.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;


/** @ClassType Util Class */
/** @ClassInfo Returns a config File located in a given path */

public class getConfig {


    /** -------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       YamlConfiguration Util                                                                                     */
    /** @UtilInfo       Returns a config File located in a given path                                                              */
    /** @ParameterInfo  • directoryPath: Path the config File is located in (use . to separate directories - eg. ".ExampleFolder") */
    /**                 • fileName: Name of the config File                                                                        */
    /** -------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                            */
    public static YamlConfiguration getConfig(String directoryPath, String fileName) {

        // Determine Plugin Name & Directory Path
        String pluginName = JayAPI.config_manager.plugin;
        directoryPath = directoryPath.replace(".", File.separator) + File.separator;

        // Get Config File
        {
            File file = new File(Bukkit.getServer().getPluginManager().getPlugin(pluginName).getDataFolder() + directoryPath, fileName + ".yml");
            YamlConfiguration configFile = YamlConfiguration.loadConfiguration(file);
            return configFile;
        }

    }
    /**                                                                                                                            */
    /** -------------------------------------------------------------------------------------------------------------------------- */


}
