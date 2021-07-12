package net.perforce.jayapi.Managers.Player.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import net.perforce.jayapi.Managers.Config.Utils.getConfig;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Returns the last Time and Date at which a Player joined the server */

public class getLastDateJoined {


    /** ---------------------------------------------------------------------------------- */
    /** @UtilType       String Util                                                        */
    /** @UtilInfo       Returns the last Time and Date at which a Player joined the server */
    /** @ParameterInfo  • UUID: UUID of the Player                                         */
    /**                 • player: Player to get the Time and Date from                     */
    /** ---------------------------------------------------------------------------------- */
    /**                                                                                    */
    public static String getLastDateJoined(String UUID) {

        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".Players", UUID);
        String lastDateJoined = configuration.getString(UUID + ".LastDateJoined");

        return lastDateJoined;

    }
    /**                                                                                    */
    public static String getLastDateJoined(Player player) {

        String UUID = player.getUniqueId().toString();

        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".Players", UUID);
        String lastDateJoined = configuration.getString(UUID + ".LastDateJoined");

        return lastDateJoined;

    }
    /**                                                                                    */
    /** ---------------------------------------------------------------------------------- */


}
