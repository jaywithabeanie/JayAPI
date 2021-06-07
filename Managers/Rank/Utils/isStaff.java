package me.jaypeg.jayapi.Managers.Rank.Utils;

import me.jaypeg.jayapi.Managers.Config.Config_Manager;
import me.jaypeg.jayapi.Managers.Player.Player_Manager;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


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

        YamlConfiguration configuration = Config_Manager.getConfig("JayAPI.Ranks", rank);
        return configuration.getBoolean(rank + ".IsStaff");

    }
    /**                                                                        */
    /** ---------------------------------------------------------------------- */


}
