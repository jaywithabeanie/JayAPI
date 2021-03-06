package net.perforce.jayapi.Managers.NPC.Events.RightClickNPCEvent;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import net.perforce.jayapi.JayAPI;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.Packet;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


/** @ClassType Util Class */
/** @ClassInfo Deals with Packets regarding NPCs */

public class PacketReader {

    private JayAPI plugin = JayAPI.getInstance();

    Channel channel;
    public static Map<UUID, Channel> channels = new HashMap<UUID, Channel>();


    public void inject(Player player) {
        CraftPlayer craftPlayer = (CraftPlayer) player;
        channel = craftPlayer.getHandle().playerConnection.networkManager.channel;
        channels.put(player.getUniqueId(), channel);

        if (channel.pipeline().get("PacketInjector") != null)
            return;

        channel.pipeline().addAfter("decoder", "PacketInjector", new MessageToMessageDecoder<Packet<?>>() {

            @Override
            protected void decode(ChannelHandlerContext channel, Packet<?> packet, List<Object> arg) throws Exception {
                arg.add(packet);
                readPacket(player, packet);
            }

        });
    }


    public void uninject(Player player) {
        channel = channels.get(player.getUniqueId());
        if (channel.pipeline().get("PacketInjector") != null)
            channel.pipeline().remove("PacketInjector");
    }


    public void readPacket(Player player, Packet<?> packet) {

        if (packet.getClass().getSimpleName().equalsIgnoreCase("PacketPlayInUseEntity")) {

            if (getValue(packet, "action").toString().equalsIgnoreCase("ATTACK"))
                return;
            if (getValue(packet, "action").toString().equalsIgnoreCase("INTERACT_AT"))
                return;

            int id = (int) getValue(packet, "a");

            if (getValue(packet, "action").toString().equalsIgnoreCase("INTERACT")) {
                for (EntityPlayer npc : JayAPI.npc_manager.getNPCs()) {
                    if (npc.getId() == id) {
                        new BukkitRunnable() {
                            public void run() {
                                Bukkit.getPluginManager().callEvent(new RightClickNPCEvent(player, npc));
                            }
                        }.runTaskLater(plugin, 0);
                    }
                }
                for (EntityPlayer npc : JayAPI.npc_manager.getNPCs(player)) {
                    if (npc.getId() == id) {
                        new BukkitRunnable() {
                            public void run() {
                                Bukkit.getPluginManager().callEvent(new RightClickNPCEvent(player, npc));
                            }
                        }.runTaskLater(plugin, 0);
                    }
                }
            }

        }
    }


    private Object getValue(Object instance, String name) {
        Object result = null;

        try {

            Field field = instance.getClass().getDeclaredField(name);
            field.setAccessible(true);

            result = field.get(instance);

            field.setAccessible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}
