package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import org.bukkit.Location;


/** @ClassType Util Class */
/** @ClassInfo Returns the Location of a Main Armor Stand */

public class getLocation {


    /** ---------------------------------------------------------- */
    /** @UtilType       Location Util                              */
    /** @UtilInfo       Returns the Location of a Main Armor Stand */
    /** @ParameterInfo  • armorStandID: ID of the Main Armor Stand */
    /** ---------------------------------------------------------- */
    /**                                                            */
    public static Location getLocation(String armorStandID) {

        return ArmorStand_Manager.holograms.get(armorStandID).get(0).getBukkitEntity().getLocation();

    }
    /**                                                            */
    /** ---------------------------------------------------------- */


}
