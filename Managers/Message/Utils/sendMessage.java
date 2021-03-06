package net.perforce.jayapi.Managers.Message.Utils;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Sends a Message to a World */

public class sendMessage {


    /** --------------------------------------------------------------------- */
    /** @UtilType       Void Util                                             */
    /** @UtilInfo       Sends a Message to a World                            */
    /** @ParameterInfo  • world: World to send the Message in                 */
    /**                 • worldName: Name of the World to send the Message in */
    /**                 • message: Message to send                            */
    /** --------------------------------------------------------------------- */
    /**                                                                       */
    public static void sendMessage(World world, String message) {

        // Send Message
        for (Player player : world.getPlayers()) {
            player.sendMessage(message);
        }

    }
    /**                                                                       */
    public static void sendMessage(String worldName, String message) {

        // Send Message
        for (Player player : Bukkit.getWorld(worldName).getPlayers()) {
            player.sendMessage(message);
        }

    }
    /**                                                                       */
    /** --------------------------------------------------------------------- */


}
