package net.perforce.jayapi.Managers.Player.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Utils.getConfig;
import net.perforce.jayapi.Managers.Config.Utils.saveConfig;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Sets the Rank of a Player */

public class setRank {


    /** -------------------------------------------------------- */
    /** @UtilType       Void Util                                */
    /** @UtilInfo       Sets the Rank of a Player                */
    /** @ParameterInfo  • UUID: UUID of the Player               */
    /**                 • player: Player to set the Rank of      */
    /**                 • rank: Rank to change to                */
    /** -------------------------------------------------------- */
    /**                                                          */
    public static void setRank(String UUID, String rank) {

        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".JayAPI.Players", UUID);
        configuration.set(UUID + ".Rank", rank);
        JayAPI.config_manager.saveConfig(".JayAPI.Players", UUID, configuration);

    }
    /**                                                          */
    public static void setRank(Player player, String rank) {

        String UUID = player.getUniqueId().toString();

        YamlConfiguration configuration = JayAPI.config_manager.getConfig(".JayAPI.Players", UUID);
        configuration.set(UUID + ".Rank", rank);
        JayAPI.config_manager.saveConfig(".JayAPI.Players", UUID, configuration);

    }
    /**                                                          */
    /** -------------------------------------------------------- */


}
