package net.perforce.jayapi.Managers.Message;

import net.md_5.bungee.api.chat.TextComponent;
import net.perforce.jayapi.Managers.Message.Utils.centerMessage;
import net.perforce.jayapi.Managers.Message.Utils.createClickableMessage;
import net.perforce.jayapi.Managers.Message.Utils.sendActionBarMessage;
import net.perforce.jayapi.Managers.Message.Utils.sendMessage;
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
    public String centerMessage(String message) {
        return centerMessage.centerMessage(message);
    }
    /**                                                                                                 */
    /** ----------------------------------------------------------------------------------------------- */


    /** ---------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       TextComponent Util                                                                               */
    /** @UtilInfo       Returns a Clickable Message which runs a Command or opens a URL                                  */
    /** @ParameterInfo  • message: Message to display in chat                                                            */
    /**                 • hoverMessage: Message to display upon Hovering over the chat Message                           */
    /**                 • command: Command to run upon clicking the Message                                              */
    /**                 • url: URL to open upon clicking the Message                                                     */
    /** ---------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                  */
    public TextComponent createClickableCommandMessage(String message, String hoverMessage, String command) {
        return createClickableMessage.createClickableCommandMessage(message, hoverMessage, command);
    }
    /**                                                                                                                  */
    public TextComponent createClickableURLMessage(String message, String hoverMessage, String url) {
        return createClickableMessage.createClickableURLMessage(message, hoverMessage, url);
    }
    /**                                                                                                                  */
    /** ---------------------------------------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                */
    /** @UtilInfo       Sends a Message in the Action Bar                        */
    /** @ParameterInfo  • UUID: UUID of the Player to send the Message to        */
    /**                 • player: Player to send the Message to                  */
    /**                 • world: World to send the Message to                    */
    /**                 • message: Player to send the Message to                 */
    /** ------------------------------------------------------------------------ */
    /**                                                                          */
    public void sendActionBarMessage(Player player, String message) {
        sendActionBarMessage.sendActionBarMessage(player, message);
    }
    /**                                                                          */
    public void sendActionBarMessage(String UUID, String message) {
        sendActionBarMessage.sendActionBarMessage(UUID, message);
    }
    /**                                                                          */
    public void sendActionBarMessage(World world, String message) {
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
    public void sendMessage(World world, String message) {
        sendMessage.sendMessage(world, message);
    }
    /**                                                                                                               */
    public void sendMessage(String worldName, String message) {
        sendMessage.sendMessage(worldName, message);
    }
    /**                                                                                                               */
    /** ------------------------------------------------------------------------------------------------------------- */


}
