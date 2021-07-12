package net.perforce.jayapi.Managers.BossBar.Utils;

import net.perforce.jayapi.Managers.BossBar.BossBar_Manager;
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

        if (BossBar_Manager.activeBossBar.containsKey(player.getUniqueId())) {
            (BossBar_Manager.activeBossBar.get(player.getUniqueId())).end();
            BossBar_Manager.activeBossBar.remove(player.getUniqueId());
        }

    }
    /**                                                             */
    /** ----------------------------------------------------------- */

}
