package me.jaypeg.jayapi;

import me.jaypeg.jayapi.Managers.Config.Config_Manager;
import me.jaypeg.jayapi.Managers.Inventory.Inventory_Manager;
import me.jaypeg.jayapi.Managers.ItemStack.ItemStack_Manager;
import me.jaypeg.jayapi.Managers.Message.Message_Manager;
import me.jaypeg.jayapi.Managers.NPC.Events.PlayerJoin;
import me.jaypeg.jayapi.Managers.NPC.Events.PlayerQuit;
import me.jaypeg.jayapi.Managers.NPC.NPC_Manager;
import me.jaypeg.jayapi.Managers.NPC.Events.RightClickNPCEvent.PacketReader;
import me.jaypeg.jayapi.Managers.Player.Player_Manager;
import me.jaypeg.jayapi.Managers.Rank.Rank_Manager;
import me.jaypeg.jayapi.Managers.Scoreboard.Scoreboard_Manager;
import me.jaypeg.jayapi.Managers.Title.Title_Manager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


/** @ClassType Main Class */
/** @ClassInfo Initiates all Manager Classes */

public final class JayAPI extends JavaPlugin {


    public static JayAPI instance;

    public ArmorStand_Manager armorStand_manager;
    public Config_Manager config_manager;
    public Inventory_Manager inventory_manager;
    public ItemStack_Manager itemStack_manager;
    public Message_Manager message_manager;
    public NPC_Manager npc_manager;
    public Player_Manager player_manager;
    public Rank_Manager rank_manager;
    public Scoreboard_Manager scoreboard_manager;
    public Title_Manager title_manager;
    public World_Manager world_manager;


    @Override
    public void onEnable() {

        // Instantiate Plugin
        instance = this;

        // Register Managers
        armorStand_manager = new ArmorStand_Manager();
        config_manager = new Config_Manager();
        inventory_manager = new Inventory_Manager();
        itemStack_manager = new ItemStack_Manager();
        message_manager = new Message_Manager();
        npc_manager = new NPC_Manager();
        player_manager = new Player_Manager();
        rank_manager = new Rank_Manager();
        scoreboard_manager = new Scoreboard_Manager();
        title_manager = new Title_Manager();
        world_manager = new World_Manager();

        // Register Events
        {
            // Initiate Plugin Manager
            PluginManager pluginManager = Bukkit.getPluginManager();

            // NPC Manager
            pluginManager.registerEvents(new PlayerJoin(), this);
            pluginManager.registerEvents(new PlayerQuit(), this);

            // Player Manager
            pluginManager.registerEvents(new me.jaypeg.jayapi.Managers.Player.Events.PlayerJoin(), this);
        }

        // Inject NPC Event to Online Players
        for (Player player : Bukkit.getOnlinePlayers()) {
            PacketReader reader = new PacketReader();
            reader.inject(player);
        }

    }

    @Override
    public void onDisable() {

        // Uninject NPC Event to Online Players
        for (Player player : Bukkit.getOnlinePlayers()) {
            PacketReader reader = new PacketReader();
            reader.uninject(player);
        }

    }

    public static JayAPI getInstance() {
        return instance;
    }


}
