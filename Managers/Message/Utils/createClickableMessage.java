package net.perforce.jayapi.Managers.Message.Utils;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;


/** @ClassType Util Class */
/** @ClassInfo Returns a Clickable Message */

public class createClickableMessage {


    /** ---------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       TextComponent Util                                                                               */
    /** @UtilInfo       Returns a Clickable Message which runs a Command or opens a URL                                  */
    /** @ParameterInfo  • message: Message to display in chat                                                            */
    /**                 • hoverMessage: Message to display upon Hovering over the chat Message                           */
    /**                 • command: Command to run upon clicking the Message                                              */
    /**                 • url: URL to open upon clicking the Message                                                     */
    /** ---------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                  */
    public static TextComponent createClickableCommandMessage(String message, String hoverMessage, String command) {

        // Create Clickable Message
        TextComponent clickableMessage = new TextComponent(message);
        clickableMessage.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, command));
        clickableMessage.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(hoverMessage).create()));

        // Return Clickable Message
        return clickableMessage;

    }
    /**                                                                                                                  */
    public static TextComponent createClickableURLMessage(String message, String hoverMessage, String url) {

        // Create Clickable Message
        TextComponent clickableMessage = new TextComponent(message);
        clickableMessage.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, url));
        clickableMessage.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder(hoverMessage).create()));

        // Return Clickable Message
        return clickableMessage;

    }
    /**                                                                                                                  */
    /** ---------------------------------------------------------------------------------------------------------------- */


}
