package net.perforce.jayapi.Managers.Tablist.Utils;

import net.perforce.jayapi.JayAPI;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;


/** @ClassType Util Class */
/** @ClassInfo Updates the Prefix and/or Suffix of a Team */

public class updateTeam {


    /** ----------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                           */
    /** @UtilInfo       Updates the Prefix and/or Suffix of a Team                          */
    /** @ParameterInfo  • teamName: Name of the Team to change the Prefix and/or Suffix of  */
    /**                 • prefix: Prefix of the Team (set to "/" to only change the Suffix) */
    /**                 • suffix: Suffix of the Team (set to "/" to only change the Prefix) */
    /** ----------------------------------------------------------------------------------- */
    /**                                                                                     */
    public static void updateTeam(String teamName, String prefix, String suffix) {

        // Get Main Scoreboard
        Scoreboard scoreboard = JayAPI.getInstance().getServer().getScoreboardManager().getMainScoreboard();

        // Get Team from Team Name
        Team team = scoreboard.getTeam(teamName);
        if (team == null)
        {
            team = scoreboard.registerNewTeam(teamName);
        }

        // Set Prefix & Suffix
        if (!prefix.equals("/")) team.setPrefix(prefix);
        if (!suffix.equals("/")) team.setSuffix(suffix);

    }
    /**                                                                                     */
    /** ----------------------------------------------------------------------------------- */


}
