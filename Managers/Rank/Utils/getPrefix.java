package net.perforce.jayapi.Managers.Rank.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import org.bukkit.configuration.file.YamlConfiguration;


/** @ClassType Util Class */
/** @ClassInfo Returns the Prefix of a Rank */

public class getPrefix {


    /** ------------------------------------------------- */
    /** @UtilType       String Util                       */
    /** @UtilInfo       Returns the Prefix of a Rank      */
    /** @ParameterInfo  • rank: Rank to get the Prefix of */
    /** ------------------------------------------------- */
    /**                                                   */
    public static String getPrefix(String rank) {

        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".Ranks", rank);
        return configuration.getString(rank + ".Prefix");

    }
    /**                                                   */
    /** ------------------------------------------------- */


}
