package me.jaypeg.jayapi;

import me.jaypeg.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import me.jaypeg.jayapi.Managers.Config.Config_Manager;
import me.jaypeg.jayapi.Managers.Inventory.Inventory_Manager;
import me.jaypeg.jayapi.Managers.ItemStack.ItemStack_Manager;
import me.jaypeg.jayapi.Managers.Message.Message_Manager;
import me.jaypeg.jayapi.Managers.NPC.Events.PlayerJoin;
import me.jaypeg.jayapi.Managers.NPC.Events.PlayerQuit;
import me.jaypeg.jayapi.Managers.NPC.NPC_Manager;
import me.jaypeg.jayapi.Managers.NPC.Utils.RightClickNPCEvent.PacketReader;
import me.jaypeg.jayapi.Managers.Scoreboard.Scoreboard_Manager;
import me.jaypeg.jayapi.Managers.World.World_Manager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


/** @ClassType Main Class */
/** @ClassInfo Initiates all Manager Classes */

public final class JayAPI extends JavaPlugin {


    public static JayAPI instance;

    public Config_Manager config_manager;
    public Inventory_Manager inventory_manager;
    public ItemStack_Manager itemStack_manager;
    public Message_Manager message_manager;
    public NPC_Manager npc_manager;
    public Scoreboard_Manager scoreboard_manager;
    public World_Manager world_manager;
    public ArmorStand_Manager armorStand_manager;


    @Override
    public void onEnable() {

        // Instantiate Plugin
        instance = this;

        // Register Managers
        config_manager = new Config_Manager();
        inventory_manager = new Inventory_Manager();
        itemStack_manager = new ItemStack_Manager();
        message_manager = new Message_Manager();
        npc_manager = new NPC_Manager();
        scoreboard_manager = new Scoreboard_Manager();
        world_manager = new World_Manager();
        armorStand_manager = new ArmorStand_Manager();

        // Register Events
        {
            // Initiate Plugin Manager
            PluginManager pluginManager = Bukkit.getPluginManager();

            // NPC Manager
            pluginManager.registerEvents(new PlayerJoin(), this);
            pluginManager.registerEvents(new PlayerQuit(), this);
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
