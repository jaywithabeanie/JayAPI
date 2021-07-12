package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.minecraft.server.v1_8_R3.EntityArmorStand;
import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import org.bukkit.Location;


/** @ClassType Util Class */
/** @ClassInfo Removes a line from an Armor Stand */

public class removeLine {


    /** -------------------------------------------------------------- */
    /** @UtilType       Void Util                                      */
    /** @UtilInfo       Removes a line from an Armor Stand             */
    /** @ParameterInfo  • armorStandID: ID of the Armor Stand          */
    /**                 • line: Line to remove                         */
    /** -------------------------------------------------------------- */
    /**                                                                */
    public static void removeLine(String armorStandID, int line) {

        // Initiate Variables
        Location location = JayAPI.armorStand_manager.getLocation(armorStandID);

        // Remove Armor Stand from holograms
        ArmorStand_Manager.holograms.get(armorStandID).remove(line);

        // Change Active Armor Stands
        for (int counter = line; counter < ArmorStand_Manager.holograms.get(armorStandID).size(); counter++) {

            EntityArmorStand armorStand = ArmorStand_Manager.holograms.get(armorStandID).get(counter);

            armorStand.setLocation(location.getX(), location.getY() - (counter * 0.5), location.getZ(), 0, 0);

        }

    }
    /**                                                                */
    /** -------------------------------------------------------------- */


}
