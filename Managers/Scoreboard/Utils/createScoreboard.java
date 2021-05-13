package me.jaypeg.jayapi.Managers.Scoreboard.Utils;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.*;

import java.util.HashMap;


/** @ClassType Util Class */
/** @ClassInfo Creates a Scoreboard from given data */

public class createScoreboard {


    /** --------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Scoreboard Util                                                                           */
    /** @UtilInfo       Creates a Scoreboard from given data                                                      */
    /** @ParameterInfo  • scoreboardTitle: Title given to the Scoreboard                                          */
    /**                 • scoreInfo: HashMap containing the Score's text with its corresponding placement Integer */
    /** --------------------------------------------------------------------------------------------------------- */
    /**                                                                                                           */
    public static Scoreboard createScoreboard(String scoreboardTitle, HashMap<Integer, String> scoreInfo) {

        // Initiate Scoreboard
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();

        // Initiate Objective for Scoreboard
        Objective objective = scoreboard.registerNewObjective(scoreboardTitle, "");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName(scoreboardTitle);

        // Set Scores for Objective
        for (Integer scoreSlot : scoreInfo.keySet()) {

            Score score = objective.getScore(scoreInfo.get(scoreSlot));
            score.setScore(scoreSlot);

        }

        // Return Scoreboard
        return scoreboard;

    }
    /**                                                                                                           */
    /** --------------------------------------------------------------------------------------------------------- */


}
