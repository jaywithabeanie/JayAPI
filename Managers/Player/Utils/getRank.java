package me.jaypeg.jayapi.Managers.Player.Utils;

import me.jaypeg.jayapi.Managers.Config.Config_Manager;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Returns the Rank of a Player */

public class getRank {


    /** --------------------------------------------------- */
    /** @UtilType       String Util                         */
    /** @UtilInfo       Returns the Rank of a Player        */
    /** @ParameterInfo  • UUID: UUID of the Player          */
    /**                 • player: Player to get the Rank of */
    /** --------------------------------------------------- */
    /**                                                     */
    public static String getRank(String UUID) {

        YamlConfiguration configuration = Config_Manager.getConfig(".JayAPI.Players", UUID);
        String rank = configuration.getString(UUID + ".Rank");

        return rank;

    }
    /**                                                     */
    public static String getRank(Player player) {

        String UUID = player.getUniqueId().toString();

        YamlConfiguration configuration = Config_Manager.getConfig(".JayAPI.Players", UUID);
        String rank = configuration.getString(UUID + ".Rank");

        return rank;

    }
    /**                                                     */
    /** --------------------------------------------------- */


}
