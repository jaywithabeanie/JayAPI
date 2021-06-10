package me.jaypeg.jayapi.Managers.Tablist;

import me.jaypeg.jayapi.Managers.Tablist.Utils.updateTablist;
import me.jaypeg.jayapi.Managers.Tablist.Utils.updateTablistPrefixSuffix;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import java.util.HashMap;

public class Tablist_Manager {

    public static void TablistUpdate(String headerString, String headercolor, String footerString, String footercolor, Player player) {
        updateTablist.updateTablist(headerString, headercolor, footerString, footercolor, player);
    }

    public static void TablistPrefixSuffix(String prefix, String suffix, String teamName, Player player) {
        updateTablistPrefixSuffix.updatePrefixSuffix(prefix, suffix, teamName, player);
    }

    public static void TablistSet(Team teamName, Player player)
    {
        updateTablistPrefixSuffix.setPlayerTeam(teamName, player);
    }

}
