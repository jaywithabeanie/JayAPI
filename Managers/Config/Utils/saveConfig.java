package me.jaypeg.jayapi.Managers.Config.Utils;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;


/** @ClassType Util Class */
/** @ClassInfo Saves a config File */

public class saveConfig {


    /** -------------------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                                                    */
    /** @UtilInfo       Saves a config File                                                                                                          */
    /** @ParameterInfo  • directoryPath: Path the config File will be saved in (use . to separate directories - eg. ".ExamplePlugin.ExampleFolder.") */
    /**                 • fileName: Name the config File will be saved as                                                                            */
    /**                 • yamlConfiguration: YamlConfiguration File to save                                                                          */
    /** -------------------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                              */
    public static void saveConfig(String directoryPath, String fileName, YamlConfiguration configFile) {

        String pluginName = directoryPath.split("\\.")[1];
        directoryPath = directoryPath.replaceFirst("\\." + pluginName, "").replace(".", File.separator) + File.separator;

        File file = new File(Bukkit.getServer().getPluginManager().getPlugin(pluginName).getDataFolder() + directoryPath, fileName + ".yml");

        try {
            configFile.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /**                                                                                                                                              */
    /** -------------------------------------------------------------------------------------------------------------------------------------------- */

  
}