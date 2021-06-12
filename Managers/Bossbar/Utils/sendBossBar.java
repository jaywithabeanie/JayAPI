package me.jayy.jayapi.Managers.Bossbar.Utils;

import me.jayy.jayapi.Managers.Bossbar.Assists.Bar;
import me.jayy.jayapi.Managers.Bossbar.BossBar_Manager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Sends a Boss Bar to a Player */

public class sendBossBar {


    /** ---------------------------------------------------------- */
    /** @UtilType       Void Util                                  */
    /** @UtilInfo       Sends a Boss Bar to a Player               */
    /** @ParameterInfo  • player: Player to send the Boss Bar to   */
    /**                 • message: Message to show in the Boss Bar */
    /** ---------------------------------------------------------- */
    /**                                                            */
    public static void sendBossBar(Player player, String message) {

        if (!BossBar_Manager.ActiveBossBar.containsKey(player.getUniqueId()))
            BossBar_Manager.ActiveBossBar.put(player.getUniqueId(), new Bar(player, ChatColor.translateAlternateColorCodes('&', message)));

    }
    /**                                                            */
    /** ---------------------------------------------------------- */


}
