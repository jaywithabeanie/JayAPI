package net.perforce.jayapi.Managers.Rank.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import org.bukkit.configuration.file.YamlConfiguration;


/** @ClassType Util Class */
/** @ClassInfo Checks whether a Rank is considered Staff */

public class isStaff {


    /** ---------------------------------------------------------------------- */
    /** @UtilType       Boolean Util                                           */
    /** @UtilInfo       Checks whether a Rank is considered Staff              */
    /** @ParameterInfo  • rank: Rank to check of whether it's considered Staff */
    /** ---------------------------------------------------------------------- */
    /**                                                                        */
    public static boolean isStaff(String rank) {

        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".Ranks", rank);
        return configuration.getBoolean(rank + ".IsStaff");

    }
    /**                                                                        */
    /** ---------------------------------------------------------------------- */


}
