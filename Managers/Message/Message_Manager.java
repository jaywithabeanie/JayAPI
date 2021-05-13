package me.jaypeg.jayapi.Managers.Message;

import me.jaypeg.jayapi.Managers.Message.Utils.createMessage;
import me.jaypeg.jayapi.Managers.Message.Utils.sendMessage;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.ArrayList;


public class Message_Manager {


    public static String createMessage(Player sender, String messageText) {
        return createMessage.createMessage(sender, messageText);
    }


    public static void sendMessage(ArrayList<World> worlds, String messageText) {
        sendMessage.sendMessage(worlds, messageText);
    }


}
