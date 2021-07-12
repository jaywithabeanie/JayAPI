package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.minecraft.server.v1_8_R3.EntityArmorStand;
import net.minecraft.server.v1_8_R3.PacketPlayOutEntityDestroy;
import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Hides all Armor Stands from a World from a Player */

public class hideArmorStands {


    /** ----------------------------------------------------------------- */
    /** @UtilType       Void Util                                         */
    /** @UtilInfo       Hides all Armor Stands from a World from a Player */
    /** @ParameterInfo  • player: Player to hide the Armor Stands from    */
    /**                 • world: World to hide the Armor Stands from      */
    /** ----------------------------------------------------------------- */
    /**                                                                   */
    public static void hideArmorStands(Player player, World world) {

        for (String armorStandID : ArmorStand_Manager.holograms.keySet()) {

            if (ArmorStand_Manager.holograms.get(armorStandID).get(0).getWorld().getWorld() != world) continue;

            for (EntityArmorStand armorStand : ArmorStand_Manager.holograms.get(armorStandID)) {

                // Hide ArmorStand from Player
                PacketPlayOutEntityDestroy packet = new PacketPlayOutEntityDestroy(armorStand.getBukkitEntity().getEntityId());
                ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);

            }

        }

    }
    /**                                                                   */
    /** ----------------------------------------------------------------- */


}
