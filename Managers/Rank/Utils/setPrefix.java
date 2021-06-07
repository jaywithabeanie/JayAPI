package me.jaypeg.jayapi.Managers.Rank.Utils;

import me.jaypeg.jayapi.Managers.Config.Config_Manager;
import org.bukkit.configuration.file.YamlConfiguration;


/** @ClassType Util Class */
/** @ClassInfo Sets the Prefix of a Rank */

public class setPrefix {


    /** ---------------------------------------------------------- */
    /** @UtilType       Void Util                                  */
    /** @UtilInfo       Sets the Prefix of a Rank                  */
    /** @ParameterInfo  • rank: Rank to set the Prefix of          */
    /**                 • prefix: Prefix of the Rank               */
    /** ---------------------------------------------------------- */
    /**                                                            */
    public static void setPrefix(String rank, String prefix) {

        YamlConfiguration configuration = Config_Manager.getConfig("JayAPI.Ranks", rank);
        configuration.set(rank + ".Prefix", prefix);
        Config_Manager.saveConfig("JayAPI.Ranks", rank, configuration);

    }
    /**                                                            */
    /** ---------------------------------------------------------- */


}
