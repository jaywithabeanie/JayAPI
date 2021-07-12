package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.minecraft.server.v1_8_R3.EntityArmorStand;
import net.minecraft.server.v1_8_R3.PacketPlayOutSpawnEntityLiving;
import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Shows all Armor Stands in the same World as a Player */

public class showArmorStands {


    /** -------------------------------------------------------------------- */
    /** @UtilType       Void Util                                            */
    /** @UtilInfo       Shows all Armor Stands in the same World as a Player */
    /** @ParameterInfo  • armorStandID: ID of the Armor Stand                */
    /**                 • location: Location of the Armor Stand              */
    /** -------------------------------------------------------------------- */
    /**                                                                      */
    public static void showArmorStands(Player player) {

        for (String armorStandID : ArmorStand_Manager.holograms.keySet()) {

            for (EntityArmorStand armorStand : ArmorStand_Manager.holograms.get(armorStandID)) {

                // Show ArmorStand to Player
                PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(armorStand);
                ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);

            }

        }

    }
    /**                                                                      */
    /** -------------------------------------------------------------------- */


}
