package net.perforce.jayapi.Managers.Tablist.Utils;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerListHeaderFooter;
import net.minecraft.server.v1_8_R3.PlayerConnection;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;


/** @ClassType Util Class */
/** @ClassInfo Updates the Tab List for a Player */

public class updateTabList {


    /** ----------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                                           */
    /** @UtilInfo       Updates the Tab List for a Player                                                                                   */
    /** @ParameterInfo  • player: Player to update the Tab List for                                                                         */
    /**                 • headerString: Text for the Header                                                                                 */
    /**                 • headerColor: Color for the Header                                                                                 */
    /**                 • footerString: Text for the Footer                                                                                 */
    /**                 • footerColor: Color for the Footer                                                                                 */
    /** ----------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                     */
    public static void updateTabList(Player player, String headerString, String headerColor, String footerString, String footerColor) {

        // Initiate Packet
        PacketPlayOutPlayerListHeaderFooter packet = new PacketPlayOutPlayerListHeaderFooter();

        // Create Header & Footer
        IChatBaseComponent header = IChatBaseComponent.ChatSerializer.a("{'extra': [{text:" + headerString + ", color:" + headerColor + "}]}");
        IChatBaseComponent footer = IChatBaseComponent.ChatSerializer.a("{'extra': [{text:" + footerString + ", color:" + footerColor + "}]}");

        // Add Header & Footer to Packet
        {
            try {
                Field headerField = packet.getClass().getDeclaredField("a");
                headerField.setAccessible(true);
                headerField.set(packet, header);
                headerField.setAccessible(!headerField.isAccessible());

                Field footerField = packet.getClass().getDeclaredField("ab");
                footerField.setAccessible(true);
                footerField.set(packet, footer);
                footerField.setAccessible(!footerField.isAccessible());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Send Packet
        PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
        connection.sendPacket(packet);

    }
    /**                                                                                                                                     */
    /** ----------------------------------------------------------------------------------------------------------------------------------- */


}
