package me.jaypeg.jayapi.Managers.NPC.Utils;

import me.jaypeg.jayapi.JayAPI;
import me.jaypeg.jayapi.Managers.NPC.NPC_Manager;
import net.minecraft.server.v1_8_R3.*;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;


/** @ClassType Util Class */
/** @ClassInfo Shows all NPCs in the same World to a Player */

public class showNPCs {


    /** ------------------------------------------------------------ */
    /** @UtilType       Void Util                                    */
    /** @UtilInfo       Shows all NPCs in the same World to a Player */
    /** @ParameterInfo  • player: Player to show the NPCs to         */
    /** ------------------------------------------------------------ */
    /**                                                              */
    public static void showNPCs(Player player) {

        // Show NPCs
        for (EntityPlayer npc : NPC_Manager.getNPCs()) {

            if (NPC_Manager.getLocation(npc).getWorld() != player.getWorld()) continue;

            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, npc));
            connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
            connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.yaw * 256 / 360)));

            DataWatcher watcher = npc.getDataWatcher();
            watcher.watch(10, (byte) 126);

            PacketPlayOutEntityMetadata packet = new PacketPlayOutEntityMetadata(npc.getId(), watcher, true);
            ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);

            new BukkitRunnable() {
                public void run() {
                    connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));
                }
            }.runTaskLater(JayAPI.getInstance(), 20L);

        }

        // Show Linked NPCs
        for (EntityPlayer npc : NPC_Manager.getNPCs(player)) {

            if (npc.getWorld().getWorld() != player.getWorld()) continue;

            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, npc));
            connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
            connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.yaw * 256 / 360)));

            DataWatcher watcher = npc.getDataWatcher();
            watcher.watch(10, (byte) 126);

            PacketPlayOutEntityMetadata packet = new PacketPlayOutEntityMetadata(npc.getId(), watcher, true);
            ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);

            new BukkitRunnable() {
                public void run() {
                    connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));
                }
            }.runTaskLater(JayAPI.getInstance(), 20L);

        }

    }
    /**                                                              */
    /** ------------------------------------------------------------ */


}
