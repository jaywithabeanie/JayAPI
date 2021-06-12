package me.jayy.jayapi.Managers.BossBar;

import me.jayy.jayapi.Managers.BossBar.Assists.Bar;
import me.jayy.jayapi.Managers.BossBar.Utils.removeBossBar;
import me.jayy.jayapi.Managers.BossBar.Utils.sendBossBar;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


/** @ClassType Manager Class */
/** @ClassInfo Manages Boss Bars */

public class BossBar_Manager {


    /** ------------------------------------------------------------------------------------------ */
    /** @VariableType   HashMap<UUID, Bar> Variable                                                */
    /** @VariableInfo   HashMap containing all the Players' UUIDs and their corresponding Boss Bar */
    /** ------------------------------------------------------------------------------------------ */
    /**                                                                                            */
    public static Map<UUID, Bar> activeBossBar = new HashMap<>();
    /**                                                                                            */
    /** ------------------------------------------------------------------------------------------ */


    /** ----------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                     */
    /** @UtilInfo       Removes the Boss Bar for a Player                             */
    /** @ParameterInfo  • player: Player to remove the Boss Bar for                   */
    /** ----------------------------------------------------------------------------- */
    /**                                                                               */
    public void removeBossBar(Player player) {
        removeBossBar.removeBossBar(player);
    }
    /**                                                                               */
    /** ----------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                                        */
    /** @UtilInfo       Sends a Boss Bar to a Player                                                     */
    /** @ParameterInfo  • player: Player to send the Boss Bar to                                         */
    /**                 • message: Message to show in the Boss Bar                                       */
    /** ------------------------------------------------------------------------------------------------ */
    /**                                                                                                  */
    public void sendBossBar(Player player, String message) {
        sendBossBar.sendBossBar(player, message);
    }
    /**                                                                                                  */
    /** ------------------------------------------------------------------------------------------------ */

}
