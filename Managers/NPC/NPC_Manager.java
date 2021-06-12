package me.jayy.jayapi.Managers.NPC;

import me.jayy.jayapi.Managers.NPC.Utils.*;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Set;


/** @ClassType Manager Class */
/** @ClassInfo Manages NPCs */

public class NPC_Manager {


    /** --------------------------------------------------------------------------------- */
    /** @VariableType   HashMap<EntityPlayer, Location> Variable                          */
    /** @VariableInfo   HashMap containing all the NPCs and their corresponding Locations */
    /** --------------------------------------------------------------------------------- */
    /**                                                                                   */
    public static HashMap<EntityPlayer, Location> NPCs = new HashMap<>();
    /**                                                                                   */
    /** --------------------------------------------------------------------------------- */


    /** --------------------------------------------------------------------------- */
    /** @VariableType   HashMap<Player, Set<EntityPlayer>> Variable                 */
    /** @VariableInfo   HashMap containing all the Players with their linked NPCs   */
    /** --------------------------------------------------------------------------- */
    /**                                                                             */
    public static HashMap<Player, Set<EntityPlayer>> linkedNPCs = new HashMap<>();
    /**                                                                             */
    /** --------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                     */
    /** @UtilInfo       Creates an NPC with given data                                                                */
    /** @ParameterInfo  • location: Location of the NPC                                                               */
    /**                 • skinPlayer: OfflinePlayer whose skin is used for the NPC                                    */
    /**                 • name: Name of the NPC                                                                       */
    /**                 • linkedPlayer: Player who the NPC is linked to                                               */
    /** ------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                               */
    public static void createNPC(Location location, OfflinePlayer skinPlayer, String name) {
        createNPC.createNPC(location, skinPlayer, name);
    }
    /**                                                                                                               */
    public static void createNPC(Location location, OfflinePlayer skinPlayer, String name, Player linkedPlayer) {
        createNPC.createNPC(location, skinPlayer, name, linkedPlayer);
    }
    /**                                                                                                               */
    /** ------------------------------------------------------------------------------------------------------------- */


    /** ----------------------------------------------------------------------------------------- */
    /** @UtilType       Location Util                                                             */
    /** @UtilInfo       Returns an NPC's Location                                                 */
    /** @ParameterInfo  • npc: EntityPlayer to get the location of                                */
    /** ----------------------------------------------------------------------------------------- */
    /**                                                                                           */
    public static Location getLocation(EntityPlayer npc) {
        return getLocation.getLocation(npc);
    }
    /**                                                                                           */
    /** ----------------------------------------------------------------------------------------- */


    /** --------------------------------------------------------------------------------------- */
    /** @UtilType       Set<EntityPlayer> Util                                                  */
    /** @UtilInfo       Returns a list of all NPCs                                              */
    /** @ParameterInfo  • player: Player to get the linked NPCs of                              */
    /** --------------------------------------------------------------------------------------- */
    /**                                                                                         */
    public static Set<EntityPlayer> getNPCs() {
        return getNPCs.getNPCs();
    }
    /**                                                                                         */
    public static Set<EntityPlayer> getNPCs(Player player) {
        return getNPCs.getNPCs(player);
    }
    /**                                                                                         */
    /** --------------------------------------------------------------------------------------- */


    /** --------------------------------------------------------------------- */
    /** @UtilType       Void Util                                             */
    /** @UtilInfo       Hides all NPCs for a Player                           */
    /** @ParameterInfo  • player: Player to hide the NPCs from                */
    /** --------------------------------------------------------------------- */
    /**                                                                       */
    public static void hideNPCs(Player player) {
        hideNPCs.hideNPCs(player);
    }
    /**                                                                       */
    /** --------------------------------------------------------------------- */


    /** ---------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                  */
    /** @UtilInfo       Removes one or more linked NPCs for a Player                                               */
    /** @ParameterInfo  • player: Player to removeScoreboard the NPC(s) for                                                  */
    /**                 • npc(s): NPC(s) to removeScoreboard                                                                 */
    /** ---------------------------------------------------------------------------------------------------------- */
    /**                                                                                                            */
    public static void removeNPC(Player player, EntityPlayer npc) {
        removeNPCs.removeNPC(player, npc);
    }
    /**                                                                                                            */
    public static void removeNPCs(Player player, List<EntityPlayer> npcs) {
        removeNPCs.removeNPCs(player, npcs);
    }
    /**                                                                                                            */
    /** ---------------------------------------------------------------------------------------------------------- */


    /** --------------------------------------------------------------------- */
    /** @UtilType       Void Util                                             */
    /** @UtilInfo       Shows all NPCs in the same World to a Player          */
    /** @ParameterInfo  • player: Player to show the NPCs to                  */
    /** --------------------------------------------------------------------- */
    /**                                                                       */
    public static void showNPCs(Player player) {
        showNPCs.showNPCs(player);
    }
    /**                                                                       */
    /** --------------------------------------------------------------------- */


}
