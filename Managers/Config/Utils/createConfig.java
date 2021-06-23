package net.perforce.jayapi.Managers.Config.Utils;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;


/** @ClassType Util Class */
/** @ClassInfo Creates a config File */

public class createConfig {


    /** ---------------------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                                                      */
    /** @UtilInfo       Creates a config File                                                                                                          */
    /** @ParameterInfo  • directoryPath: Path the config File will be created in (use . to separate directories - eg. ".ExamplePlugin.ExampleFolder.") */
    /**                 • fileName: Name the config File will be given                                                                                 */
    /** ---------------------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                                */
    public static void createConfig(String directoryPath, String fileName) {

        // Determine Plugin Name & Directory Path
        String pluginName = directoryPath.split("\\.")[1];
        directoryPath = directoryPath.replaceFirst("\\." + pluginName, "").replace(".", File.separator) + File.separator;

        // Create Config File
        {
            File file = new File(Bukkit.getServer().getPluginManager().getPlugin(pluginName).getDataFolder() + directoryPath, fileName + ".yml");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            YamlConfiguration.loadConfiguration(file);
        }

    }
    /**                                                                                                                                                */
    /** ---------------------------------------------------------------------------------------------------------------------------------------------- */


}
