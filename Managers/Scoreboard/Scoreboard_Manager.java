package me.jaypeg.jayapi.Managers.Scoreboard;

import me.jaypeg.jayapi.Managers.Scoreboard.Scoreboards.LobbyMain.JayPeg;
import me.jaypeg.jayapi.Managers.Scoreboard.Utils.createScoreboard;
import me.jaypeg.jayapi.Managers.Scoreboard.Utils.updateScoreboard;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import java.util.HashMap;


/** @ClassType Manager Class */
/** @ClassInfo Manages Scoreboard utils and saved Scoreboards */

public class Scoreboard_Manager {


    /** --------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Scoreboard Util                                                                           */
    /** @UtilInfo       Creates a Scoreboard from given data                                                      */
    /** @ParameterInfo  • scoreboardTitle: Title given to the Scoreboard                                          */
    /**                 • scoreInfo: HashMap containing the Score's text with its corresponding placement Integer */
    /** --------------------------------------------------------------------------------------------------------- */
    /**                                                                                                           */
    public static Scoreboard createScoreboard(String scoreboardTitle, HashMap<Integer, String> scoreInfo) {
        return createScoreboard.createScoreboard(scoreboardTitle, scoreInfo);
    }
    /**                                                                                                           */
    /** --------------------------------------------------------------------------------------------------------- */


    /** --------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                   */
    /** @UtilInfo       Updates the Scoreboard for a Player                         */
    /** @ParameterInfo  • player: Player the Scoreboard will be updated for         */
    /**                 • scoreboard: Scoreboard the Player will receive            */
    /** --------------------------------------------------------------------------- */
    /**                                                                             */
    public static void updateScoreboard(Player player, Scoreboard scoreboard) {
        updateScoreboard.updateScoreboard(player, scoreboard);
    }
    /**                                                                             */
    /** --------------------------------------------------------------------------- */


}
