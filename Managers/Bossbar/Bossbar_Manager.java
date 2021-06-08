package me.jaypeg.jayapi.Managers.Bossbar;

import me.jaypeg.jayapi.Managers.Bossbar.Utils.Remove;
import me.jaypeg.jayapi.Managers.Bossbar.Utils.Send;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Bossbar_Manager {

    public static Map<UUID, Bar> ActiveBossbar = new HashMap<>();

    public void sendBossbar(Player player, String message) {
        Send.Send(player, message);
    }

    public void removeBossbar(Player player) {
        Remove.Remove(player);
    }

}
