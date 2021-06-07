package me.jaypeg.jayapi.Managers.Player.Utils;

import me.jaypeg.jayapi.Managers.Config.Config_Manager;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Sets the Rank of a Player */

public class setRank {


    /** -------------------------------------------------------- */
    /** @UtilType       Void Util                                */
    /** @UtilInfo       Sets the Rank of a Player                */
    /** @ParameterInfo  • UUID: UUID of the Player               */
    /**                 • Player: Player to set the Rank of      */
    /** -------------------------------------------------------- */
    /**                                                          */
    public static void setRank(String UUID, String rank) {

        YamlConfiguration configuration = Config_Manager.getConfig("JayAPI.Players", UUID);
        configuration.set(UUID + ".Rank", rank);
        Config_Manager.saveConfig("JayAPI.Players", UUID, configuration);

    }
    /**                                                          */
    public static void setRank(Player player, String rank) {

        String UUID = player.getUniqueId().toString();

        YamlConfiguration configuration = Config_Manager.getConfig("JayAPI.Players", UUID);
        configuration.set(UUID + ".Rank", rank);
        Config_Manager.saveConfig("JayAPI.Players", UUID, configuration);

    }
    /**                                                          */
    /** -------------------------------------------------------- */


}
