package net.perforce.jayapi.Managers.Rank.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
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

        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".Ranks", rank);
        return configuration.getStringList(rank + ".SubRanks");

    }
    /**                                                         */
    /** ------------------------------------------------------- */


}
