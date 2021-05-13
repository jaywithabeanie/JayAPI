package me.jaypeg.jayapi.Managers.Message.Utils;

import org.bukkit.entity.Player;


public class createMessage {


    public static String createMessage(Player sender, String messageText) {

        String message = "§f";

        if (sender != null) {
            message = sender.getName() + ": ";
        }

        message = message + messageText;

        return message;

    }


}
