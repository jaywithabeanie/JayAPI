package me.jayy.jayapi.Managers.Scoreboard.Utils;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.*;

import java.util.HashMap;


/** @ClassType Util Class */
/** @ClassInfo Creates a Scoreboard from given data */

public class createScoreboard {


    /** ----------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Scoreboard Util                                                                             */
    /** @UtilInfo       Creates a Scoreboard from given data                                                        */
    /** @ParameterInfo  • title: Title of the Scoreboard                                                            */
    /**                 • scoreInfo: HashMap containing the Scores' text with their corresponding placement Integer */
    /** ----------------------------------------------------------------------------------------------------------- */
    /**                                                                                                             */
    public static Scoreboard createScoreboard(String title, HashMap<Integer, String> scoreInfo) {

        // Initiate Scoreboard
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();

        // Initiate Objective for Scoreboard
        Objective objective = scoreboard.registerNewObjective(title, "");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName(title);

        // Set Scores for Objective
        for (Integer scoreSlot : scoreInfo.keySet()) {

            Score score = objective.getScore(scoreInfo.get(scoreSlot));
            score.setScore(scoreSlot);

        }

        // Return Scoreboard
        return scoreboard;

    }
    /**                                                                                                             */
    /** ----------------------------------------------------------------------------------------------------------- */


}
