package me.jaypeg.jayapi.Managers.NPC.Events;

import me.jaypeg.jayapi.Managers.NPC.Events.RightClickNPCEvent.PacketReader;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


/** @ClassType Event Class */
/** @ClassInfo Injects the PacketReader data to a Player upon joining the server */

public class PlayerJoin implements Listener {


    /** ----------------------------------------------------------------------------- */
    /** @EventType  PlayerJoin Event                                                  */
    /** @EventInfo  Injects the PacketReader data to a Player upon joining the server */
    /** ----------------------------------------------------------------------------- */
    /**                                                                               */
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        PacketReader reader = new PacketReader();
        reader.inject(event.getPlayer());

    }
    /**                                                                               */
    /** ----------------------------------------------------------------------------- */


}
