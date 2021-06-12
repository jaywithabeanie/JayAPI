package me.jayy.jayapi.Managers.BossBar.Utils;

import me.jayy.jayapi.Managers.BossBar.BossBar_Manager;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Removes the Boss Bar for a Player */

public class removeBossBar {


    /** ----------------------------------------------------------- */
    /** @UtilType       Void Util                                   */
    /** @UtilInfo       Removes the Boss Bar for a Player           */
    /** @ParameterInfo  • player: Player to remove the Boss Bar for */
    /** ----------------------------------------------------------- */
    /**                                                             */
    public static void removeBossBar(Player player) {

        if (BossBar_Manager.ActiveBossBar.containsKey(player.getUniqueId())) {
            (BossBar_Manager.ActiveBossBar.get(player.getUniqueId())).end();
            BossBar_Manager.ActiveBossBar.remove(player.getUniqueId());
        }

    }
    /**                                                             */
    /** ----------------------------------------------------------- */

}
