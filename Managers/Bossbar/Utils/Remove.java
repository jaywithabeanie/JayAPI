package me.jaypeg.jayapi.Managers.Bossbar.Utils;

import me.jaypeg.jayapi.Managers.Bossbar.Bossbar_Manager;
import org.bukkit.entity.Player;

public class Remove {

    public static void Remove(Player player) {
        if (Bossbar_Manager.ActiveBossbar.containsKey(player.getUniqueId())) {
            (Bossbar_Manager.ActiveBossbar.get(player.getUniqueId())).end();
            Bossbar_Manager.ActiveBossbar.remove(player.getUniqueId());
        }
    }

}
