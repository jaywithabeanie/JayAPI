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


/** @ClassType Util Class */
/** @ClassInfo Creates a Main Armor Stand */

public class createArmorStand {


    /** ------------------------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                                  */
    /** @UtilInfo       Creates a Main Armor Stand                                                 */
    /** @ParameterInfo  • armorStandID: ID of the Main Armor Stand                                 */
    /**                 • location: Location of the Main Armor Stand                               */
    /**                 • text: Text of the Main Armor Stand                                       */
    /** ------------------------------------------------------------------------------------------ */
    /**                                                                                            */
    public static void createArmorStand(String armorStandID, Location location, String text) {

        // Initiate Variables
        WorldServer server = ((CraftWorld) location.getWorld()).getHandle();
        EntityArmorStand armorStand = new EntityArmorStand(server);

        // Edit ArmorStand
        armorStand.setLocation(location.getX(), location.getY(), location.getZ(), 0, 0);
        armorStand.setCustomName(ChatColor.translateAlternateColorCodes('&', text));
        armorStand.setGravity(false);

        // Save ArmorStand
        List<EntityArmorStand> armorStands = new ArrayList<>();
        armorStands.add(armorStand);
        ArmorStand_Manager.holograms.put(armorStandID, armorStands);

    }
    /**                                                                                            */
    /** ------------------------------------------------------------------------------------------ */


}
