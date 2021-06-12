package me.jayy.jayapi.Managers.Message.Utils;

import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Sends a Message in the Action Assists */

public class sendActionBarMessage {


    /** ------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                */
    /** @UtilInfo       Sends a Message in the Action Assists                        */
    /** @ParameterInfo  • UUID: UUID of the Player to sendBossBar the Message to        */
    /**                 • player: Player to sendBossBar the Message to                  */
    /**                 • world: World to sendBossBar the Message to                    */
    /**                 • message: Player to sendBossBar the Message to                 */
    /** ------------------------------------------------------------------------ */
    /**                                                                          */
    public static void sendActionBarMessage(String UUID, String message) {

        // sendBossBar Message
        Bukkit.getPlayer(UUID).sendMessage(ChatMessageType.ACTION_BAR + message);

    }
    /**                                                                          */
    public static void sendActionBarMessage(Player player, String message) {

        // sendBossBar Message
        player.sendMessage(ChatMessageType.ACTION_BAR + message);

    }
    /**                                                                          */
    public static void sendActionBarMessage(World world, String message) {

        // sendBossBar Message
        for (Player player : world.getPlayers()) {
            player.sendMessage(ChatMessageType.ACTION_BAR + message);
        }

    }
    /**                                                                          */
    /** ------------------------------------------------------------------------ */


}
