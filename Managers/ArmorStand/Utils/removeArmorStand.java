package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;


/** @ClassType Util Class */
/** @ClassInfo Removes a Main Armor Stand */

public class removeArmorStand {


    /** -------------------------------------------------------------------- */
    /** @UtilType       Void Util                                            */
    /** @UtilInfo       Removes a Main Armor Stand                           */
    /** @ParameterInfo  • armorStandID: ID of the Main Armor Stand to remove */
    /** -------------------------------------------------------------------- */
    /**                                                                      */
    public static void removeArmorStand(String armorStandID) {

        ArmorStand_Manager.holograms.keySet().remove(armorStandID);

    }
    /**                                                                      */
    /** -------------------------------------------------------------------- */


}
