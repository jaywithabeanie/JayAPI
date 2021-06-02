package me.jaypeg.jayapi.Managers.Message;

import me.jaypeg.jayapi.Managers.Message.Utils.ActionbarSender;
import me.jaypeg.jayapi.Managers.Message.Utils.MessageAnnouncer;
import me.jaypeg.jayapi.Managers.Message.Utils.MessageCenter;
import org.bukkit.ChatColor;
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

    public static void MessageActionbar(Player player, String Message) {
        ActionbarSender.ActionbarSender(player, Message);
    }

    public static void MessageActionbar(String playerName, String Message) {
        ActionbarSender.ActionbarSender(playerName, Message);
    }

    public static void MessageAllActionbar(String Message) {
        ActionbarSender.ActionbarSender(Message);
    }

    private final static int CENTER_PX = 154;
    public String CenterMessage(String Message) {
        String[] lines = ChatColor.translateAlternateColorCodes('&', Message).split("\n", 40);
        StringBuilder returnMessage = new StringBuilder();

        for (String line : lines) {
            int messagePxSize = 0;
            boolean previousCode = false;
            boolean isBold = false;

            for (char c : line.toCharArray()) {
                if (c == '§') {
                    previousCode = true;
                } else if (previousCode) {
                    previousCode = false;
                    isBold = c == 'l';
                } else {
                    MessageCenter dFI = MessageCenter.getDefaultFontInfo(c);
                    messagePxSize = isBold ? messagePxSize + dFI.getBoldLength() : messagePxSize + dFI.getLength();
                    messagePxSize++;
                }
            }
            int toCompensate = CENTER_PX - messagePxSize / 2;
            int spaceLength = MessageCenter.SPACE.getLength() + 1;
            int compensated = 0;
            StringBuilder sb = new StringBuilder();
            while(compensated < toCompensate){
                sb.append(" ");
                compensated += spaceLength;
            }
            returnMessage.append(sb.toString()).append(line).append("\n");
        }

        return returnMessage.toString();
    }

}
