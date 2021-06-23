package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;
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

public class createArmorStand {

    public static void createArmorStand(Location location, Player player, String armorStandID, String text) {

        // Initiate Variables
        WorldServer server = ((CraftWorld) location.getWorld()).getHandle();
        EntityArmorStand armorStand = new EntityArmorStand(server);

        // Edit ArmorStand
        armorStand.setLocation(location.getX(), location.getY(), location.getZ(), 0, 0);
        armorStand.setCustomName(ChatColor.translateAlternateColorCodes('&', text));
        armorStand.setGravity(false);

        // Show ArmorStand to Player
        PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(armorStand);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);

        // Save ArmorStand
        List<EntityArmorStand> armorStands = new ArrayList<>();
        armorStands.add(armorStand);

        ArmorStand_Manager.holograms.put(armorStandID, armorStands);

        // TODO Save armorStands to file.
    }

}
