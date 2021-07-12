package net.perforce.jayapi.Managers.ArmorStand;

import net.perforce.jayapi.Managers.ArmorStand.Utils.*;
import net.minecraft.server.v1_8_R3.EntityArmorStand;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Set;


/** @ClassType Manager Class */
/** @ClassInfo Manages Armor Stands */

public class ArmorStand_Manager {


    /** ------------------------------------------------------------------------------------------------ */
    /** @VariableType   HashMap<String, List<EntityArmorStand>> Variable                                 */
    /** @VariableInfo   HashMap containing all the Main Armor Stand IDs and their corresponding Entities */
    /** ------------------------------------------------------------------------------------------------ */
    /**                                                                                                  */
    public static HashMap<String, List<EntityArmorStand>> holograms = new HashMap<>();
    /**                                                                                                  */
    /** ------------------------------------------------------------------------------------------------ */


    /** ------------------------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                                  */
    /** @UtilInfo       Adds a line of text to an Armor Stand                                      */
    /** @ParameterInfo  • armorStandID: ID of the Armor Stand                                      */
    /**                 • text: Text to add to the Armor Stand                                     */
    /** ------------------------------------------------------------------------------------------ */
    /**                                                                                            */
    public void addLine(String armorStandID, String text) {
        addLine.addLine(armorStandID, text);
    }
    /**                                                                                            */
    /** ------------------------------------------------------------------------------------------ */


    /** ----------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                           */
    /** @UtilInfo       Creates a Main Armor Stand                                          */
    /** @ParameterInfo  • armorStandID: ID of the Main Armor Stand                          */
    /**                 • location: Location of the Main Armor Stand                        */
    /**                 • text: Text of the Main Armor Stand                                */
    /** ----------------------------------------------------------------------------------- */
    /**                                                                                     */
    public void createArmorStand(String armorStandID, Location location, String text) {
        createArmorStand.createArmorStand(armorStandID, location, text);
    }
    /**                                                                                     */
    /** ----------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                     */
    /** @UtilInfo       Edits a line of an Armor Stand                                                                */
    /** @ParameterInfo  • armorStandID: ID of the Armor Stand                                                         */
    /**                 • line: Line to edit                                                                          */
    /**                 • text: Text of the line                                                                      */
    /** ------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                               */
    public void editLine(String armorStandID, int line, String text) {
        editLine.editLine(armorStandID, line, text);
    }
    /**                                                                                                               */
    /** ------------------------------------------------------------------------------------------------------------- */


    /** ---------------------------------------------------------------------------------------------- */
    /** @UtilType       Location Util                                                                  */
    /** @UtilInfo       Returns the Location of a Main Armor Stand                                     */
    /** @ParameterInfo  • armorStandID: ID of the Main Armor Stand                                     */
    /** ---------------------------------------------------------------------------------------------- */
    /**                                                                                                */
    public Location getLocation(String armorStandID) {
        return getLocation.getLocation(armorStandID);
    }
    /**                                                                                                */
    /** ---------------------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                               */
    /** @UtilInfo       Hides all Armor Stands from a World from a Player                                       */
    /** @ParameterInfo  • player: Player to hide the Armor Stands from                                          */
    /**                 • world: World to hide the Armor Stands from                                            */
    /** ------------------------------------------------------------------------------------------------------- */
    /**                                                                                                         */
    public void hideArmorStands(Player player, World world) {
        hideArmorStands.hideArmorStands(player, world);
    }
    /**                                                                                                         */
    /** ------------------------------------------------------------------------------------------------------- */


    /** -------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                          */
    /** @UtilInfo       Removes a Main Armor Stand                                                         */
    /** @ParameterInfo  • armorStandID: ID of the Main Armor Stand to remove                               */
    /** -------------------------------------------------------------------------------------------------- */
    /**                                                                                                    */
    public void removeArmorStand(String armorStandID) {
        removeArmorStand.removeArmorStand(armorStandID);
    }
    /**                                                                                                    */
    /** -------------------------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                                        */
    /** @UtilInfo       Removes a line from an Armor Stand                                               */
    /** @ParameterInfo  • armorStandID: ID of the Armor Stand                                            */
    /**                 • line: Line to remove                                                           */
    /** ------------------------------------------------------------------------------------------------ */
    /**                                                                                                  */
    public void removeLine(String armorStandID, int line) {
        removeLine.removeLine(armorStandID, line);
    }
    /**                                                                                                  */
    /** ------------------------------------------------------------------------------------------------ */


    /** ---------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                        */
    /** @UtilInfo       Sets the Location of an Armor Stand                                                              */
    /** @ParameterInfo  • armorStandID: ID of the Armor Stand                                                            */
    /**                 • location: Location of the Armor Stand                                                          */
    /** ---------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                  */
    public void setLocation(String armorStandID, Location location) {
        setLocation.setLocation(armorStandID, location);
    }
    /**                                                                                                                  */
    /** ---------------------------------------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                           */
    /** @UtilInfo       Shows all Armor Stands in the same World as a Player                */
    /** @ParameterInfo  • armorStandID: ID of the Armor Stand                               */
    /**                 • location: Location of the Armor Stand                             */
    /** ----------------------------------------------------------------------------------- */
    /**                                                                                     */
    public void showArmorStands(Player player) {
        showArmorStands.showArmorStands(player);
    }
    /**                                                                                     */
    /** ----------------------------------------------------------------------------------- */


}
