package net.perforce.jayapi.Managers.Tablist.Utils;

import net.perforce.jayapi.JayAPI;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;


/** @ClassType Util Class */
/** @ClassInfo Sets the Team of a Player */

public class setTeam {


    /** ------------------------------------------------------------ */
    /** @UtilType       Void Util                                    */
    /** @UtilInfo       Sets the Team of a Player                    */
    /** @ParameterInfo  • player: Player to change the Team of       */
    /**                 • teamName: Name of the Team of the Player   */
    /** ------------------------------------------------------------ */
    /**                                                              */
    public static void setTeam(Player player, String teamName) {

        // Get Main Scoreboard
        Scoreboard scoreboard = JayAPI.getInstance().getServer().getScoreboardManager().getMainScoreboard();

        // Get Team from Team Name
        Team team = scoreboard.getTeam(teamName);
        if (team == null)
        {
            team = scoreboard.registerNewTeam(teamName);
        }

        // Add Player to Team
        team.addEntry(player.getName());

    }
    /**                                                              */
    /** ------------------------------------------------------------ */


}
