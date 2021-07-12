package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import net.minecraft.server.v1_8_R3.EntityArmorStand;
import net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntityLiving;
import net.minecraft.server.v1_8_R3.WorldServer;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Adds a line of text to an Armor Stand */

public class addLine {


    /** -------------------------------------------------------------- */
    /** @UtilType       Void Util                                      */
    /** @UtilInfo       Adds a line of text to an Armor Stand          */
    /** @ParameterInfo  • armorStandID: ID of the Armor Stand          */
    /**                 • text: Text to add to the Armor Stand         */
    /** -------------------------------------------------------------- */
    /**                                                                */
    public static void addLine(String armorStandID, String text) {

        // Initiate Variables
        Location location = JayAPI.armorStand_manager.getLocation(armorStandID);
        WorldServer server = ((CraftWorld) location.getWorld()).getHandle();
        EntityArmorStand armorStand = new EntityArmorStand(server);

        // Edit ArmorStand
        armorStand.setLocation(location.getX(), location.getY() - ((ArmorStand_Manager.holograms.get(armorStandID).size()-1) * 0.5), location.getZ(), 0, 0);
        armorStand.setCustomName(ChatColor.translateAlternateColorCodes('&', text));
        armorStand.setGravity(false);

        // Show ArmorStand to Players
        for (Player player : armorStand.getWorld().getWorld().getPlayers()) {
            PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(armorStand);
            ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);
        }

        // Save ArmorStand
        ArmorStand_Manager.holograms.get(armorStandID).add(armorStand);

    }
    /**                                                                */
    /** -------------------------------------------------------------- */


}
