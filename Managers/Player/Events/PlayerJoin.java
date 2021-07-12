package net.perforce.jayapi.Managers.Player.Events;

import net.perforce.jayapi.JayAPI;
import net.perforce.jayapi.Managers.Config.Utils.createConfig;
import net.perforce.jayapi.Managers.Config.Utils.getConfig;
import net.perforce.jayapi.Managers.Config.Utils.saveConfig;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/** @ClassType Event Class */
/** @ClassInfo Creates & Updates the Player config File upon joining the server */

public class PlayerJoin implements Listener {


    /** ---------------------------------------------------------------------------- */
    /** @EventType  PlayerJoin Event                                                 */
    /** @EventInfo  Creates & Updates the Player config File upon joining the server */
    /** ---------------------------------------------------------------------------- */
    /**                                                                              */
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        // Initiate Variables
        Player player = event.getPlayer();
        String playerName = player.getName();
        String UUID = player.getUniqueId().toString();

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String date = (localDateTime.format(formatter));

        // Create & Update Config File
        {
            JayAPI.config_manager.createConfig(".Players", UUID);
            YamlConfiguration configuration = JayAPI.config_manager.getConfig(".Players", UUID);
            if (!configuration.getString(UUID + ".Name").equals(playerName)) {
                configuration.set(UUID + ".Name", playerName);
            }
            if (configuration.getString(UUID + ".Rank") == null) {
                configuration.set(UUID + ".Rank", "Default");
            }
            if (configuration.getString(UUID + ".FirstDateJoined") == null) {
                configuration.set(UUID + ".FirstDateJoined", date);
            }
            configuration.set(UUID + ".LastDateJoined", date);
            JayAPI.config_manager.saveConfig(".Players", UUID, configuration);
        }

    }
    /**                                                                              */
    /** ---------------------------------------------------------------------------- */


}
