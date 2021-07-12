package net.perforce.jayapi.Managers.Rank.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import net.perforce.jayapi.Managers.Config.Utils.saveConfig;
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

        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".Ranks", rank);
        configuration.set(rank + ".Prefix", prefix);
        JayAPI.config_manager.saveConfig(".Ranks", rank, configuration);

    }
    /**                                                            */
    /** ---------------------------------------------------------- */


}
