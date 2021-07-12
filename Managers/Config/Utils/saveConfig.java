package net.perforce.jayapi.Managers.Config.Utils;

import net.perforce.jayapi.JayAPI;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;


/** @ClassType Util Class */
/** @ClassInfo Saves a config File in a given path */

public class saveConfig {


    /** ----------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                                     */
    /** @UtilInfo       Saves a config File                                                                                           */
    /** @ParameterInfo  • directoryPath: Path the config File will be saved in (use . to separate directories - eg. ".ExampleFolder") */
    /**                 • fileName: Name the config File will be saved as                                                             */
    /**                 • configFile: YamlConfiguration File to save                                                                  */
    /** ----------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                               */
    public static void saveConfig(String directoryPath, String fileName, YamlConfiguration configFile) {

        // Determine Plugin Name & Directory Path
        String pluginName = JayAPI.config_manager.plugin;
        directoryPath = directoryPath.replace(".", File.separator) + File.separator;

        // Save Config File
        {
            File file = new File(Bukkit.getServer().getPluginManager().getPlugin(pluginName).getDataFolder() + directoryPath, fileName + ".yml");

            try {
                configFile.save(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    /**                                                                                                                               */
    /** ----------------------------------------------------------------------------------------------------------------------------- */


}