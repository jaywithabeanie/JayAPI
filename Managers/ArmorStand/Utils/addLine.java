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

public class addLine {

    public static void addLine(String armorStandID, Player player, String text) {

        // Initiate Variables
        Location location = ArmorStand_Manager.getLocation(armorStandID);
        WorldServer server = ((CraftWorld) location.getWorld()).getHandle();
        EntityArmorStand stand = new EntityArmorStand(server);

        // Edit ArmorStand
        stand.setLocation(location.getX(), location.getY() - .5, location.getZ(), 0, 0);
        stand.setCustomName(ChatColor.translateAlternateColorCodes('&', text));
        stand.setGravity(false);

        // Show ArmorStand to Player
        PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(stand);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);

        // Save ArmorStand
        ArmorStand_Manager.holograms.get(armorStandID).add(stand);

    }

}
