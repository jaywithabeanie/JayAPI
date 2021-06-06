package me.jaypeg.jayapi.Managers.Scoreboard;

import me.jaypeg.jayapi.Managers.Scoreboard.Utils.Create;
import me.jaypeg.jayapi.Managers.Scoreboard.Utils.Edit.AddLine;
import me.jaypeg.jayapi.Managers.Scoreboard.Utils.Edit.RemoveLine;
import me.jaypeg.jayapi.Managers.Scoreboard.Utils.Edit.SetDisplayName;
import me.jaypeg.jayapi.Managers.Scoreboard.Utils.Remove;
import me.jaypeg.jayapi.Managers.Scoreboard.Utils.Update;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Scoreboard_Manager {

    public static Map<UUID, Scoreboard> personalScoreboard = new HashMap<>();

    public static void createScoreboard(String boardName, Player player, String boardTitle, String line, int value) {
        Create.Create(boardName, player, boardTitle, line, value);
    }

    public static void removeScoreboard(Player player) {
        Remove.Remove(player);
    }

    public static void updateScoreboard(Player player) {
        Update.Update(player);
    }

    public static void setScoreboardTitle(Player player, String boardName, String displayName) {
        SetDisplayName.SetDisplayName(player, boardName, displayName);
    }

    public static void addScoreboardLine(Player player, String boardName, String line, int value) {
        AddLine.AddLine(player, boardName, line, value);
    }

    public static void removeScoreboardLine(Player player, String line) {
        RemoveLine.RemoveLine(player, line);
    }

}
