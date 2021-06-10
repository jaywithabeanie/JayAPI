package me.jaypeg.jayapi.Managers.Message.Utils;

import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Sends a Message in the Action Bar */

public class sendActionBarMessage {


    /** ------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                */
    /** @UtilInfo       Sends a Message in the Action Bar                        */
    /** @ParameterInfo  • UUID: UUID of the Player to send the Message to        */
    /**                 • player: Player to send the Message to                  */
    /**                 • world: World to send the Message to                    */
    /**                 • message: Player to send the Message to                 */
    /** ------------------------------------------------------------------------ */
    /**                                                                          */
    public static void sendActionBarMessage(String UUID, String message) {

        // Send Message
        Bukkit.getPlayer(UUID).sendMessage(ChatMessageType.ACTION_BAR + message);

    }
    /**                                                                          */
    public static void sendActionBarMessage(Player player, String message) {

        // Send Message
        player.sendMessage(ChatMessageType.ACTION_BAR + message);

    }
    /**                                                                          */
    public static void sendActionBarMessage(World world, String message) {

        // Send Message
        for (Player player : world.getPlayers()) {
            player.sendMessage(ChatMessageType.ACTION_BAR + message);
        }

    }
    /**                                                                          */
    /** ------------------------------------------------------------------------ */


}
