package net.perforce.jayapi.Managers.NPC.Events.RightClickNPCEvent;

import net.minecraft.server.v1_8_R3.EntityPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;


/** @ClassType Util Class */
/** @ClassInfo Creates the RightClickNPC Event */

public class RightClickNPCEvent extends Event implements Listener {

    private final Player player;
    private final EntityPlayer npc;
    private boolean isCancelled;

    public RightClickNPCEvent(Player player, EntityPlayer npc) {
        this.player = player;
        this.npc = npc;
    }

    public Player getPlayer() {
        return player;
    }

    public EntityPlayer getNPC() {
        return npc;
    }

    public HandlerList getHandlers() { return null; }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean arg) {
        isCancelled = arg;
    }

}
