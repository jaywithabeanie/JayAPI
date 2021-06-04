package me.jaypeg.jayapi.Managers.Title.Utils;

import net.minecraft.server.v1_8_R1.ChatSerializer;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Displays a Title to a Player */

public class sendTitle {


    /** ------------------------------------------------------------------------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                                                                                  */
    /** @UtilInfo       Displays a Title to a Player                                                                                               */
    /** @ParameterInfo  • player: Player to send the Title to                                                                                      */
    /**                 • title: Title to send to the Player                                                                                       */
    /**                 • subTitle: Subtitle to send to the Player                                                                                 */
    /**                 • displayTime: Time to Display the Title for (seconds)                                                                     */
    /**                 • fadeInTime: Time the fade-in of the Title lasts for (seconds)                                                            */
    /**                 • fadeOutTime: Time the fade-out of the Title lasts for (seconds)                                                          */
    /** ------------------------------------------------------------------------------------------------------------------------------------------ */
    /**                                                                                                                                            */
    public static void sendTitle(Player player, String title, Integer displayTime) {

        PacketPlayOutTitle titlePacket = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, (IChatBaseComponent) ChatSerializer.a("{\"text\":\"" + title + "\"}"), 0, displayTime * 20, 0);

        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(titlePacket);

    }
    /**                                                                                                                                            */
    public static void sendTitle(Player player, String title, Integer displayTime, Integer fadeInTime, Integer fadeOutTime) {

        PacketPlayOutTitle titlePacket = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, (IChatBaseComponent) ChatSerializer.a("{\"text\":\"" + title + "\"}"), fadeInTime, displayTime * 20, fadeOutTime);

        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(titlePacket);

    }
    /**                                                                                                                                            */
    public static void sendTitle(Player player, String title, String subTitle, Integer displayTime) {

        PacketPlayOutTitle titlePacket = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, (IChatBaseComponent) ChatSerializer.a("{\"text\":\"" + title + "\"}"), 0, displayTime * 20, 0);
        PacketPlayOutTitle subTitlePacket = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, (IChatBaseComponent) ChatSerializer.a("{\"text\":\"" + subTitle + "\"}"), 0, displayTime * 20, 0);

        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(titlePacket);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(subTitlePacket);

    }
    /**                                                                                                                                            */
    public static void sendTitle(Player player, String title, String subTitle, Integer displayTime, Integer fadeInTime, Integer fadeOutTime) {

        PacketPlayOutTitle titlePacket = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, (IChatBaseComponent) ChatSerializer.a("{\"text\":\"" + title + "\"}"), fadeInTime, displayTime * 20, fadeOutTime);
        PacketPlayOutTitle subTitlePacket = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, (IChatBaseComponent) ChatSerializer.a("{\"text\":\"" + subTitle + "\"}"), fadeInTime, displayTime * 20, fadeOutTime);

        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(titlePacket);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(subTitlePacket);

    }
    /**                                                                                                                                            */
    /** ------------------------------------------------------------------------------------------------------------------------------------------ */


}
