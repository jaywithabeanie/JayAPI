package me.jaypeg.jayapi.Managers.Rank.Utils;

import me.jaypeg.jayapi.Managers.Config.Config_Manager;
import org.bukkit.configuration.file.YamlConfiguration;


/** @ClassType Util Class */
/** @ClassInfo Changes whether a Rank is considered Staff */

public class setStaff {


    /** ------------------------------------------------------------- */
    /** @UtilType       Void Util                                     */
    /** @UtilInfo       Changes whether a Rank is considered Staff    */
    /** @ParameterInfo  • rank: Rank to set or remove from Staff      */
    /**                 • staff: Whether the Rank is considered Staff */
    /** ------------------------------------------------------------- */
    /**                                                               */
    public static void setStaff(String rank, boolean staff) {

        YamlConfiguration configuration = Config_Manager.getConfig("JayAPI.Ranks", rank);
        configuration.set(rank + ".IsStaff", staff);
        Config_Manager.saveConfig("JayAPI.Ranks", rank, configuration);

    }
    /**                                                               */
    /** ------------------------------------------------------------- */


}
