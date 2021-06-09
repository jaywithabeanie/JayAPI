package me.jaypeg.jayapi.Managers.Message.Utils;

import me.jaypeg.jayapi.Managers.Message.Enums.MessageCenter;
import org.bukkit.ChatColor;


/** @ClassType Util Class */
/** @ClassInfo Returns a centered Message */

public class centerMessage {


    /** ----------------------------------------------------------------------- */
    /** @UtilType       String Util                                             */
    /** @UtilInfo       Returns a centered Message                              */
    /** @ParameterInfo  • message: Message to be centered (use \n to add lines) */
    /** ----------------------------------------------------------------------- */
    /**                                                                         */
    public static String centerMessage(String message) {

        // Separate Lines
        String[] lines = ChatColor.translateAlternateColorCodes('&', message).split("\n", 40);
        StringBuilder returnMessage = new StringBuilder();

        // Center Message
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
            int toCompensate = 154 - messagePxSize / 2;
            int spaceLength = MessageCenter.SPACE.getLength() + 1;
            int compensated = 0;
            StringBuilder sb = new StringBuilder();
            while (compensated < toCompensate) {
                sb.append(" ");
                compensated += spaceLength;
            }
            returnMessage.append(sb.toString()).append(line).append("\n");
        }

        // Return Message
        return returnMessage.toString();

    }
    /**                                                                         */
    /** ----------------------------------------------------------------------- */


}
