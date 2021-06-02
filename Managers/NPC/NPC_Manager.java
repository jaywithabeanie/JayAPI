package me.jaypeg.jayapi.Managers.NPC;

import me.jaypeg.jayapi.Managers.NPC.Utils.createNPC;
import me.jaypeg.jayapi.Managers.NPC.Utils.getLocation;
import me.jaypeg.jayapi.Managers.NPC.Utils.getNPCs;
import me.jaypeg.jayapi.Managers.NPC.Utils.showNPCs;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Set;


/** @ClassType Manager Class */
/** @ClassInfo Manages NPCs */

public class NPC_Manager {


    /** ---------------------------------------------------------------------------------------- */
    /** @VariableType   HashMap<EntityPlayer, Location> Variable                                 */
    /** @VariableInfo   HashMap containing all the NPCs and their corresponding Locations        */
    /** ---------------------------------------------------------------------------------------- */
    /**                                                                                          */
    public static HashMap<EntityPlayer, Location> NPCs = new HashMap<>();
    /**                                                                                          */
    /** ---------------------------------------------------------------------------------------- */


    /** ---------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                */
    /** @UtilInfo       Creates an NPC with given data                                           */
    /** @ParameterInfo  • location: Location of the NPC                                          */
    /**                 • skinPlayer: OfflinePlayer whose skin is used for the NPC               */
    /**                 • name: Name of the NPC                                                  */
    /** ---------------------------------------------------------------------------------------- */
    /**                                                                                          */
    public void createNPC(Location location, OfflinePlayer skinPlayer, String name) {
        createNPC.createNPC(location, skinPlayer, name);
    }
    /**                                                                                          */
    /** ---------------------------------------------------------------------------------------- */


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


    /** ------------------------------------------------------------------- */
    /** @UtilType       Set<EntityPlayer> Util                              */
    /** @UtilInfo       Returns a list of all NPCs                          */
    /** ------------------------------------------------------------------- */
    /**                                                                     */
    public static Set<EntityPlayer> getNPCs() {
        return getNPCs.getNPCs();
    }
    /**                                                                     */
    /** ------------------------------------------------------------------- */


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
