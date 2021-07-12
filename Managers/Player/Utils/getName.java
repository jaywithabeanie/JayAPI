package net.perforce.jayapi.Managers.Player.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import net.perforce.jayapi.Managers.Config.Utils.getConfig;
import org.bukkit.configuration.file.YamlConfiguration;


/** @ClassType Util Class */
/** @ClassInfo Returns the name of a Player */

public class getName {


    /** -------------------------------------------- */
    /** @UtilType       String Util                  */
    /** @UtilInfo       Returns the name of a Player */
    /** @ParameterInfo  • UUID: UUID of the Player   */
    /** -------------------------------------------- */
    /**                                              */
    public static String getName(String UUID) {

        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".Players", UUID);
        String name = configuration.getString(UUID + ".Name");

        return name;

    }
    /**                                              */
    /** -------------------------------------------- */


}
