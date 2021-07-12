package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.minecraft.server.v1_8_R3.EntityArmorStand;
import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import org.bukkit.Location;


/** @ClassType Util Class */
/** @ClassInfo Sets the Location of an Armor Stand */

public class setLocation {


    /** ------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                */
    /** @UtilInfo       Sets the Location of an Armor Stand                      */
    /** @ParameterInfo  • armorStandID: ID of the Armor Stand                    */
    /**                 • location: Location of the Armor Stand                  */
    /** ------------------------------------------------------------------------ */
    /**                                                                          */
    public static void setLocation(String armorStandID, Location location) {

        // Set Location for all Armor Stands
        for (int counter = 0; counter < ArmorStand_Manager.holograms.get(armorStandID).size(); counter++) {

            EntityArmorStand armorStand = ArmorStand_Manager.holograms.get(armorStandID).get(counter);

            armorStand.setLocation(location.getX(), location.getY() - (counter * 0.5), location.getZ(), 0, 0);

        }

    }
    /**                                                                          */
    /** ------------------------------------------------------------------------ */

}
