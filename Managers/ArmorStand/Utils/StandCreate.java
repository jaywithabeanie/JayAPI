package me.jaypeg.jayapi.Managers.ArmorStand.Utils;

import me.jaypeg.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import net.minecraft.server.v1_8_R3.EntityArmorStand;
import net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntityLiving;
import net.minecraft.server.v1_8_R3.WorldServer;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class StandCreate {

    public static void ArmorStandSend(Location location, Player player, String standID, String message) {

        WorldServer server = ((CraftWorld) location.getWorld()).getHandle();
        EntityArmorStand stand = new EntityArmorStand(server);

        stand.setLocation(location.getX(), location.getY(), location.getZ(), 0, 0);
        stand.setCustomName(ChatColor.translateAlternateColorCodes('&', message));
        stand.setGravity(false);

        PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(stand);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);

        List<EntityArmorStand> Holograms = new ArrayList<>();
        Holograms.add(stand);

        ArmorStand_Manager.holograms.put(standID, Holograms);

        // TODO Save Holograms to file.
    }

}
