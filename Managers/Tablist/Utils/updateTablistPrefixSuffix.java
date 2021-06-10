package me.jaypeg.jayapi.Managers.Tablist.Utils;

import me.jaypeg.jayapi.JayAPI;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class updateTablistPrefixSuffix {

    public static void updatePrefixSuffix(String prefix, String suffix, String teamName, Player player) {

        Scoreboard scoreboard = JayAPI.getInstance().getServer().getScoreboardManager().getMainScoreboard();

        Team team = scoreboard.getTeam(teamName);
        if (team == null)
        {
            team = scoreboard.registerNewTeam(teamName);
        }

        team.setPrefix(prefix);
        team.setSuffix(suffix);

        team.addEntry(player.getName());

    }

    public static void setPlayerTeam(Team teamName, Player player)
    {
        teamName.addEntry(player.getName());
    }

}
