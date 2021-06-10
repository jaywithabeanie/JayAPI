package me.jaypeg.jayapi.Managers.Tablist.Utils;

import com.sun.corba.se.pept.protocol.ProtocolHandler;
import me.jaypeg.jayapi.JayAPI;
import me.jaypeg.jayapi.Managers.Tablist.Tablist_Manager;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerListHeaderFooter;
import net.minecraft.server.v1_8_R3.PlayerConnection;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;

public class updateTablist {

    public static void updateTablist(String headerString, String headercolor, String footerString, String footercolor, Player player) {

        PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;

        IChatBaseComponent header = IChatBaseComponent.ChatSerializer.a("{'extra': [{text:" + headerString + ", color:" + headercolor + "}]}");
        IChatBaseComponent footer = IChatBaseComponent.ChatSerializer.a("{'extra': [{text:" + footerString + ", color:" + footercolor + "}]}");

        PacketPlayOutPlayerListHeaderFooter packet = new PacketPlayOutPlayerListHeaderFooter();

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

        connection.sendPacket(packet);

    }

}
