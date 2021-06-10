package me.jaypeg.jayapi.Managers.Message;

import me.jaypeg.jayapi.Managers.Message.Utils.centerMessage;
import me.jaypeg.jayapi.Managers.Message.Utils.sendActionBarMessage;
import me.jaypeg.jayapi.Managers.Message.Utils.sendMessage;
import me.jaypeg.jayapi.Managers.Message.Enums.MessageCenter;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;


/** @ClassType Manager Class */
/** @ClassInfo Manages Messages */

public class Message_Manager {


    /** ----------------------------------------------------------------------------------------------- */
    /** @UtilType       String Util                                                                     */
    /** @UtilInfo       Returns a centered Message                                                      */
    /** @ParameterInfo  • message: Message to be centered (use \n to add lines)                         */
    /** ----------------------------------------------------------------------------------------------- */
    /**                                                                                                 */
    public static String centerMessage(String message) {
        return centerMessage.centerMessage(message);
    }
    /**                                                                                                 */
    /** ----------------------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                */
    /** @UtilInfo       Sends a Message in the Action Bar                        */
    /** @ParameterInfo  • UUID: UUID of the Player to send the Message to        */
    /**                 • player: Player to send the Message to                  */
    /**                 • world: World to send the Message to                    */
    /**                 • message: Player to send the Message to                 */
    /** ------------------------------------------------------------------------ */
    /**                                                                          */
    public static void sendActionBarMessage(Player player, String message) {
        sendActionBarMessage.sendActionBarMessage(player, message);
    }
    /**                                                                          */
    public static void sendActionBarMessage(String UUID, String message) {
        sendActionBarMessage.sendActionBarMessage(UUID, message);
    }
    /**                                                                          */
    public static void sendActionBarMessage(World world, String message) {
        sendActionBarMessage.sendActionBarMessage(world, message);
    }
    /**                                                                          */
    /** ------------------------------------------------------------------------ */


    /** ------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                     */
    /** @UtilInfo       Sends a Message to a World                                                                    */
    /** @ParameterInfo  • world: World to send the Message in                                                         */
    /**                 • worldName: Name of the World to send the Message in                                         */
    /**                 • message: Message to send                                                                    */
    /** ------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                               */
    public static void sendMessage(World world, String message) {
        sendMessage.sendMessage(world, message);
    }
    /**                                                                                                               */
    public static void sendMessage(String worldName, String message) {
        sendMessage.sendMessage(worldName, message);
    }
    /**                                                                                                               */
    /** ------------------------------------------------------------------------------------------------------------- */


}
