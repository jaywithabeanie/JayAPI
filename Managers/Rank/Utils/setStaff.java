package net.perforce.jayapi.Managers.Rank.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import net.perforce.jayapi.Managers.Config.Utils.saveConfig;
import org.bukkit.configuration.file.YamlConfiguration;


/** @ClassType Util Class */
/** @ClassInfo Changes whether a Rank is considered Staff */

public class setStaff {


    /** ------------------------------------------------------------- */
    /** @UtilType       Void Util                                     */
    /** @UtilInfo       Changes whether a Rank is considered Staff    */
    /** @ParameterInfo  • rank: Rank to set or removeScoreboard from Staff      */
    /**                 • staff: Whether the Rank is considered Staff */
    /** ------------------------------------------------------------- */
    /**                                                               */
    public static void setStaff(String rank, boolean staff) {

        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".JayAPI.Ranks", rank);
        configuration.set(rank + ".IsStaff", staff);
        JayAPI.config_manager.saveConfig(".JayAPI.Ranks", rank, configuration);

    }
    /**                                                               */
    /** ------------------------------------------------------------- */


}
