package me.jayy.jayapi.Managers.Message;

import me.jayy.jayapi.Managers.Message.Utils.centerMessage;
import me.jayy.jayapi.Managers.Message.Utils.sendActionBarMessage;
import me.jayy.jayapi.Managers.Message.Utils.sendMessage;
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
    /** @UtilInfo       Sends a Message in the Action Assists                        */
    /** @ParameterInfo  • UUID: UUID of the Player to sendBossBar the Message to        */
    /**                 • player: Player to sendBossBar the Message to                  */
    /**                 • world: World to sendBossBar the Message to                    */
    /**                 • message: Player to sendBossBar the Message to                 */
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
    /** @ParameterInfo  • world: World to sendBossBar the Message in                                                         */
    /**                 • worldName: Name of the World to sendBossBar the Message in                                         */
    /**                 • message: Message to sendBossBar                                                                    */
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
