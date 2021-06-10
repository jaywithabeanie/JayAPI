package me.jaypeg.jayapi.Managers.NPC.Utils;

import me.jaypeg.jayapi.Managers.NPC.NPC_Manager;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.PacketPlayOutEntityDestroy;
import net.minecraft.server.v1_8_R3.PacketPlayOutPlayerInfo;
import net.minecraft.server.v1_8_R3.PlayerConnection;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Hides all NPCs for a Player */

public class hideNPCs {


    /** ------------------------------------------------------ */
    /** @UtilType       Void Util                              */
    /** @UtilInfo       Hides all NPCs for a Player            */
    /** @ParameterInfo  • player: Player to hide the NPCs from */
    /** ------------------------------------------------------ */
    /**                                                        */
    public static void hideNPCs(Player player) {

        // Hide NPCs
        for (EntityPlayer npc : NPC_Manager.getNPCs()) {
            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));
            connection.sendPacket(new PacketPlayOutEntityDestroy(npc.getId()));
        }

        // Hide Linked NPCs
        for (EntityPlayer npc : NPC_Manager.getNPCs(player)) {
            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));
            connection.sendPacket(new PacketPlayOutEntityDestroy(npc.getId()));
        }

    }
    /**                                                        */
    /** ------------------------------------------------------ */


}
