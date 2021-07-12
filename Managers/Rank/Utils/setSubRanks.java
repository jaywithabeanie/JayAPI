package net.perforce.jayapi.Managers.Rank.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import net.perforce.jayapi.Managers.Config.Utils.saveConfig;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;


/** @ClassType Util Class */
/** @ClassInfo Sets the SubRanks of a Rank (inherits Permissions) */

public class setSubRanks {


    /** -------------------------------------------------------------------- */
    /** @UtilType       Void Util                                            */
    /** @UtilInfo       Sets the SubRanks of a Rank (inherits Permissions)   */
    /** @ParameterInfo  • rank: Rank to set the SubRanks of                  */
    /**                 • subRanks: SubRanks to add to the Rank              */
    /** -------------------------------------------------------------------- */
    /**                                                                      */
    public static void setSubRanks(String rank, List<String> subRanks) {

        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".Ranks", rank);
        configuration.set(rank + ".SubRanks", subRanks);
        JayAPI.config_manager.saveConfig(".Ranks", rank, configuration);

    }
    /**                                                                      */
    /** -------------------------------------------------------------------- */


}
