package net.perforce.jayapi.Managers.Title;

import net.perforce.jayapi.Managers.Title.Utils.sendTitle;
import org.bukkit.entity.Player;


/** @ClassType Manager Class */
/** @ClassInfo Manages Titles */

public class Title_Manager {


    /** ----------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                                           */
    /** @UtilInfo       Displays a Title to a Player                                                                                        */
    /** @ParameterInfo  • player: Player to send the Title to                                                                               */
    /**                 • title: Title to send to the Player                                                                                */
    /**                 • subTitle: Subtitle to send to the Player                                                                          */
    /**                 • displayTime: Time to Display the Title for (seconds)                                                              */
    /**                 • fadeInTime: Time the fade-in of the Title lasts for (seconds)                                                     */
    /**                 • fadeOutTime: Time the fade-out of the Title lasts for (seconds)                                                   */
    /** ----------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                     */
    public void sendTitle(Player player, String title, Integer displayTime) {
        sendTitle.sendTitle(player, title, displayTime);
    }
    /**                                                                                                                                     */
    public void sendTitle(Player player, String title, Integer displayTime, Integer fadeInTime, Integer fadeOutTime) {
        sendTitle.sendTitle(player, title, displayTime, fadeInTime, fadeOutTime);
    }
    /**                                                                                                                                     */
    public void sendTitle(Player player, String title, String subTitle, Integer displayTime) {
        sendTitle.sendTitle(player, title, subTitle, displayTime);
    }
    /**                                                                                                                                     */
    public void sendTitle(Player player, String title, String subTitle, Integer displayTime, Integer fadeInTime, Integer fadeOutTime) {
        sendTitle.sendTitle(player, title, subTitle, displayTime, fadeInTime, fadeOutTime);
    }
    /**                                                                                                                                     */
    /** ----------------------------------------------------------------------------------------------------------------------------------- */


}
