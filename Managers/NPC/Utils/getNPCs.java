package me.jaypeg.jayapi.Managers.NPC.Utils;

import me.jaypeg.jayapi.Managers.NPC.NPC_Manager;
import net.minecraft.server.v1_8_R3.EntityPlayer;

import java.util.Set;


/** @ClassType Util Class */
/** @ClassInfo Returns a list of all NPCs */

public class getNPCs {


    /** ------------------------------------------- */
    /** @UtilType       Set<EntityPlayer> Util      */
    /** @UtilInfo       Returns a list of all NPCs  */
    /** ------------------------------------------- */
    /**                                             */
    public static Set<EntityPlayer> getNPCs() {

        return NPC_Manager.NPCs.keySet();

    }
    /**                                             */
    /** ------------------------------------------- */


}
