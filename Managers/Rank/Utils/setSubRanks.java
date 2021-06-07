package me.jaypeg.jayapi.Managers.Rank.Utils;

import me.jaypeg.jayapi.Managers.Config.Config_Manager;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Sets the SubRanks of a Rank (inherits Permissions) */

public class setSubRanks {


    /** -------------------------------------------------------------------- */
    /** @UtilType       Void Util                                            */
    /** @UtilInfo       Sets the SubRanks of a Rank (inherits Permissions)  */
    /** @ParameterInfo  • rank: Rank to set the SubRanks of                 */
    /**                 • subRanks: SubRanks to add to the Rank              */
    /** -------------------------------------------------------------------- */
    /**                                                                      */
    public static void setSubRanks(String rank, List<String> subRanks) {

        YamlConfiguration configuration = Config_Manager.getConfig("JayAPI.Ranks", rank);
        configuration.set(rank + ".SubRanks", subRanks);
        Config_Manager.saveConfig("JayAPI.Ranks", rank, configuration);

    }
    /**                                                                      */
    /** -------------------------------------------------------------------- */


}
