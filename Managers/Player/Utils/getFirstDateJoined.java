package me.jayy.jayapi.Managers.Player.Utils;

import me.jayy.jayapi.Managers.Config.Config_Manager;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Returns the first Time and Date at which a Player first joined the server */

public class getFirstDateJoined {


    /** ----------------------------------------------------------------------------------------- */
    /** @UtilType       String Util                                                               */
    /** @UtilInfo       Returns the first Time and Date at which a Player first joined the server */
    /** @ParameterInfo  • UUID: UUID of the Player                                                */
    /**                 • player: Player to get the Time and Date from                            */
    /** ----------------------------------------------------------------------------------------- */
    /**                                                                                           */
    public static String getFirstDateJoined(String UUID) {

        YamlConfiguration configuration = Config_Manager.getConfig(".JayAPI.Players", UUID);
        String firstDateJoined = configuration.getString(UUID + ".FirstDateJoined");

        return firstDateJoined;

    }
    /**                                                                                           */
    public static String getFirstDateJoined(Player player) {

        String UUID = player.getUniqueId().toString();

        YamlConfiguration configuration = Config_Manager.getConfig(".JayAPI.Players", UUID);
        String firstDateJoined = configuration.getString(UUID + ".FirstDateJoined");

        return firstDateJoined;

    }
    /**                                                                                           */
    /** ----------------------------------------------------------------------------------------- */


}
