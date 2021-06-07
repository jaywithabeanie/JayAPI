package me.jaypeg.jayapi.Managers.Rank.Utils;

import me.jaypeg.jayapi.Managers.Config.Config_Manager;
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

        YamlConfiguration configuration = Config_Manager.getConfig("JayAPI.Ranks", rank);
        return configuration.getString(rank + ".Prefix");

    }
    /**                                                   */
    /** ------------------------------------------------- */


}
