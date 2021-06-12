package me.jayy.jayapi.Managers.Player.Utils;

import me.jayy.jayapi.Managers.Config.Config_Manager;
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

        YamlConfiguration configuration = Config_Manager.getConfig(".JayAPI.Players", UUID);
        String name = configuration.getString(UUID + ".Name");

        return name;

    }
    /**                                              */
    /** -------------------------------------------- */


}
