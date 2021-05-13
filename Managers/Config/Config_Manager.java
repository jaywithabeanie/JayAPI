package me.jaypeg.jayapi.Managers.Config;

import me.jaypeg.jayapi.Managers.Config.Utils.createConfig;
import me.jaypeg.jayapi.Managers.Config.Utils.getConfig;
import me.jaypeg.jayapi.Managers.Config.Utils.saveConfig;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;


/** @ClassType Manager Class */
/** @ClassInfo Manages custom config files */

public class Config_Manager {


    /** ---------------------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                                                      */
    /** @UtilInfo       Creates a config File                                                                                                          */
    /** @ParameterInfo  • directoryPath: Path the config File will be created in (use . to separate directories - eg. ".ExamplePlugin.ExampleFolder.") */
    /**                 • fileName: Name the config File will be given                                                                                 */
    /** ---------------------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                                */
    public void createConfig(String directoryPath, String fileName) {
        createConfig.createConfig(folderPath, fileName);
    }
    /**                                                                                                                                                */
    /** ---------------------------------------------------------------------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       FileConfiguration Util                                                                                                    */
    /** @UtilInfo       Returns a config File located in a given path                                                                             */
    /** @ParameterInfo  • directoryPath: Path the config File is located in (use . to separate directories - eg. ".ExamplePlugin.ExampleFolder.") */
    /**                 • fileName: Name of the config File                                                                                       */
    /** ----------------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                           */
    public FileConfiguration getConfig(String directoryPath, String fileName) {
        return getConfig.getConfig(folderPath, fileName);
    }
    /**                                                                                                                                           */
    /** ----------------------------------------------------------------------------------------------------------------------------------------- */


    /** -------------------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                                                    */
    /** @UtilInfo       Saves a config File                                                                                                          */
    /** @ParameterInfo  • directoryPath: Path the config File will be saved in (use . to separate directories - eg. ".ExamplePlugin.ExampleFolder.") */
    /**                 • fileName: Name the config File will be saved as                                                                            */
    /**                 • yamlConfiguration: YamlConfiguration File to save                                                                          */
    /** -------------------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                              */
    public void saveConfig(String directoryPath, String fileName, YamlConfiguration configFile) {
        saveConfig.saveConfig(directoryPath, fileName, configFile);
    }
    /**                                                                                                                                              */
    /** -------------------------------------------------------------------------------------------------------------------------------------------- */


}
