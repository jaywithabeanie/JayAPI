package me.jaypeg.jayapi.Managers.ArmorStand.Utils.Edits;

import me.jaypeg.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import net.minecraft.server.v1_8_R3.EntityArmorStand;
import net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntityLiving;
import net.minecraft.server.v1_8_R3.WorldServer;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class AddLine {

    public static void AddLine(String standID, Player player, String newLine) {

        Location location = ArmorStand_Manager.getStandLocation(standID);
        WorldServer server = ((CraftWorld) location.getWorld()).getHandle();
        EntityArmorStand stand = new EntityArmorStand(server);

        stand.setLocation(location.getX(), location.getY(), location.getZ(), 0, 0);
        stand.setCustomName(ChatColor.translateAlternateColorCodes('&', newLine));
        stand.setGravity(false);

        PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(stand);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);

        ArmorStand_Manager.holograms.get(standID).add(stand);

    }

}
