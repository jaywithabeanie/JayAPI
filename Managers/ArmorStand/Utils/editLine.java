package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;


/** @ClassType Util Class */
/** @ClassInfo Edits a line of an Armor Stand */

public class editLine {


    /** ------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                 */
    /** @UtilInfo       Edits a line of an Armor Stand                            */
    /** @ParameterInfo  • armorStandID: ID of the Armor Stand                     */
    /**                 • line: Line to edit                                      */
    /**                 • text: Text of the line                                  */
    /** ------------------------------------------------------------------------- */
    /**                                                                           */
    public static void editLine(String armorStandID, int line, String text) {

        // Change Text
        ArmorStand_Manager.holograms.get(armorStandID).get(line).getBukkitEntity().setCustomName(text);

    }
    /**                                                                           */
    /** ------------------------------------------------------------------------- */

}
