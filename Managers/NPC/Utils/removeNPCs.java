package me.jaypeg.jayapi.Managers.NPC.Utils;

import me.jaypeg.jayapi.Managers.NPC.NPC_Manager;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Set;


/** @ClassType Util Class */
/** @ClassInfo Removes one or more linked NPCs for a Player */

public class removeNPCs {


    /** ----------------------------------------------------------------------- */
    /** @UtilType       Void Util                                               */
    /** @UtilInfo       Removes one or more linked NPCs for a Player            */
    /** @ParameterInfo  • player: Player to remove the NPC(s) for               */
    /**                 • npc(s): NPC(s) to remove                              */
    /** ----------------------------------------------------------------------- */
    /**                                                                         */
    public static void removeNPC(Player player, EntityPlayer npc) {

        // Get Linked NPCs
        Set<EntityPlayer> linkedNPCs = NPC_Manager.getNPCs(player);

        // Remove NPC
        linkedNPCs.remove(npc);
        NPC_Manager.linkedNPCs.put(player, linkedNPCs);

    }
    /**                                                                         */
    public static void removeNPCs(Player player, List<EntityPlayer> npcs) {

        // Get Linked NPCs
        Set<EntityPlayer> linkedNPCs = NPC_Manager.getNPCs(player);

        // Remove NPCs
        npcs.forEach(linkedNPCs :: remove);
        NPC_Manager.linkedNPCs.put(player, linkedNPCs);

    }
    /**                                                                         */
    /** ----------------------------------------------------------------------- */


}
