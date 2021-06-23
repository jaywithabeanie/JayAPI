package net.perforce.jayapi.Managers.NPC.Utils;

import net.perforce.jayapi.Managers.NPC.NPC_Manager;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import org.bukkit.Location;


/** @ClassType Util Class */
/** @ClassInfo Returns an NPC's Location */

public class getLocation {


    /** ---------------------------------------------------------- */
    /** @UtilType       Location Util                              */
    /** @UtilInfo       Returns an NPC's Location                  */
    /** @ParameterInfo  • npc: EntityPlayer to get the location of */
    /** ---------------------------------------------------------- */
    /**                                                            */
    public static Location getLocation(EntityPlayer npc) {

        return NPC_Manager.NPCs.get(npc);

    }
    /**                                                            */
    /** ---------------------------------------------------------- */


}
