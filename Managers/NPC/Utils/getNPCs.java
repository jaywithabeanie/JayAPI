package net.perforce.jayapi.Managers.NPC.Utils;

import net.perforce.jayapi.Managers.NPC.NPC_Manager;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import org.bukkit.entity.Player;

import java.util.Set;


/** @ClassType Util Class */
/** @ClassInfo Returns a list of all NPCs */

public class getNPCs {


    /** ---------------------------------------------------------- */
    /** @UtilType       Set<EntityPlayer> Util                     */
    /** @UtilInfo       Returns a list of all NPCs                 */
    /** @ParameterInfo  • player: Player to get the linked NPCs of */
    /** ---------------------------------------------------------- */
    /**                                                            */
    public static Set<EntityPlayer> getNPCs() {

        return NPC_Manager.NPCs.keySet();

    }
    /**                                                            */
    public static Set<EntityPlayer> getNPCs(Player player) {

        return NPC_Manager.linkedNPCs.get(player);

    }
    /**                                                            */
    /** ---------------------------------------------------------- */


}
