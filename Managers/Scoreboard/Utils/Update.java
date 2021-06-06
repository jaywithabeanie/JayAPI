package me.jaypeg.jayapi.Managers.Scoreboard.Utils;

import me.jaypeg.jayapi.Managers.Scoreboard.Scoreboard_Manager;
import org.bukkit.entity.Player;

public class Update {

    public static void Update(Player player) {
        player.setScoreboard(Scoreboard_Manager.personalScoreboard.get(player.getUniqueId()));
    }

}
