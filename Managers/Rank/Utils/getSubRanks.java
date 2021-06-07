package me.jaypeg.jayapi.Managers.Rank.Utils;

import me.jaypeg.jayapi.Managers.Config.Config_Manager;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Returns the SubRanks of a Rank */

public class getSubRanks {


    /** ------------------------------------------------------- */
    /** @UtilType       List<String> Util                       */
    /** @UtilInfo       Returns the SubRanks of a Rank          */
    /** @ParameterInfo  • rank: Rank to get the SubRanks of     */
    /** ------------------------------------------------------- */
    /**                                                         */
    public static List<String> getSubRanks(String rank) {

        YamlConfiguration configuration = Config_Manager.getConfig("JayAPI.Ranks", rank);
        return configuration.getStringList(rank + ".SubRanks");

    }
    /**                                                         */
    /** ------------------------------------------------------- */


}
