package me.jaypeg.jayapi.Managers.Message;

import me.jaypeg.jayapi.Managers.Message.Utils.MessageAnnouncer;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.ArrayList;

/** @ClassType Manager Class */

/** @ClassInfo Manages Messages */
public class Message_Manager {

    public static void MessageManager(World world, String Message) {
        MessageAnnouncer.MessageAnnouncer(world, Message);
    }

    public static void MessageManager(String worldName, String Message) {
        MessageAnnouncer.MessageAnnouncer(worldName, Message);
    }

}
