package net.perforce.jayapi.Managers.Scoreboard;

import net.perforce.jayapi.Managers.Scoreboard.Utils.addLine;
import net.perforce.jayapi.Managers.Scoreboard.Utils.removeLine;
import net.perforce.jayapi.Managers.Scoreboard.Utils.setTitle;
import net.perforce.jayapi.Managers.Scoreboard.Utils.createScoreboard;
import net.perforce.jayapi.Managers.Scoreboard.Utils.removeScoreboard;
import net.perforce.jayapi.Managers.Scoreboard.Utils.setScoreboard;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import java.util.HashMap;


/** @ClassType Manages Class */
/** @ClassInfo Manages Scoreboards */

public class Scoreboard_Manager {


    /** ------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                               */
    /** @UtilInfo       Adds a line to the Scoreboard of a Player                                               */
    /** @ParameterInfo  • player: Player to add a Line to the Scoreboard of                                     */
    /**                 • lines: Line to add to the Scoreboard                                                  */
    /** ------------------------------------------------------------------------------------------------------- */
    /**                                                                                                         */
    public void addLine(Player player, String line, int value) {
        addLine.addLine(player, line, value);
    }
    /**                                                                                                         */
    /** ------------------------------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Scoreboard Util                                                                             */
    /** @UtilInfo       Creates a Scoreboard from given data                                                        */
    /** @ParameterInfo  • title: Title of the Scoreboard                                                            */
    /**                 • scoreInfo: HashMap containing the Scores' text with their corresponding placement Integer */
    /** ----------------------------------------------------------------------------------------------------------- */
    /**                                                                                                             */
    public Scoreboard createScoreboard(String title, HashMap<Integer, String> scoreInfo) {
        return createScoreboard.createScoreboard(title, scoreInfo);
    }
    /**                                                                                                             */
    /** ----------------------------------------------------------------------------------------------------------- */


    /** ---------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                      */
    /** @UtilInfo       Removes a line of text from the Scoreboard of a Player                         */
    /** @ParameterInfo  • player: Player to remove a Line from the Scoreboard from                     */
    /**                 • lines: Line to remove from the Scoreboard                                    */
    /** ---------------------------------------------------------------------------------------------- */
    /**                                                                                                */
    public void removeLine(Player player, String line) {
        removeLine.removeLine(player, line);
    }
    /**                                                                                                */
    /** ---------------------------------------------------------------------------------------------- */


    /** --------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                     */
    /** @UtilInfo       Removes the Scoreboard of a Player                                            */
    /** @ParameterInfo  • player: Player to remove the Scoreboard from                                */
    /** --------------------------------------------------------------------------------------------- */
    /**                                                                                               */
    public void removeScoreboard(Player player) {
        removeScoreboard.removeScoreboard(player);
    }
    /**                                                                                               */
    /** --------------------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                */
    /** @UtilInfo       Sets the Scoreboard of a Player                          */
    /** @ParameterInfo  • player: Player the Scoreboard will be updated for      */
    /**                 • scoreboard: Scoreboard the Player will receive         */
    /** ------------------------------------------------------------------------ */
    /**                                                                          */
    public void setScoreboard(Player player, Scoreboard scoreboard) {
        setScoreboard.setScoreboard(player, scoreboard);
    }
    /**                                                                          */
    /** ------------------------------------------------------------------------ */


    /** ------------------------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                                  */
    /** @UtilInfo       Sets the Title of a Scoreboard                                             */
    /** @ParameterInfo  • player: Player set the Title of the Scoreboard for                       */
    /**                 • title: Title of the Scoreboard                                           */
    /** ------------------------------------------------------------------------------------------ */
    /**                                                                                            */
    public void setTitle(Player player, String title) {
        setTitle.setTitle(player, title);
    }
    /**                                                                                            */
    /** ------------------------------------------------------------------------------------------ */


}
