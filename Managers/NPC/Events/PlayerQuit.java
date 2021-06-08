package me.jaypeg.jayapi.Managers.NPC.Events;

import me.jaypeg.jayapi.Managers.NPC.Events.RightClickNPCEvent.PacketReader;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;


/** @ClassType Event Class */
/** @ClassInfo Uninjects the PacketReader data to a Player upon leaving the server */

public class PlayerQuit implements Listener {


    /** ------------------------------------------------------------------------------- */
    /** @EventType  PlayerQuit Event                                                    */
    /** @EventInfo  Uninjects the PacketReader data to a Player upon leaving the server */
    /** ------------------------------------------------------------------------------- */
    /**                                                                                 */
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {

        PacketReader reader = new PacketReader();
        reader.uninject(event.getPlayer());

    }
    /**                                                                                 */
    /** ------------------------------------------------------------------------------- */


}
