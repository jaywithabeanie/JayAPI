package net.perforce.jayapi;

import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import net.perforce.jayapi.Managers.BossBar.BossBar_Manager;
import net.perforce.jayapi.Managers.Config.Config_Manager;
import net.perforce.jayapi.Managers.Inventory.Inventory_Manager;
import net.perforce.jayapi.Managers.ItemStack.ItemStack_Manager;
import net.perforce.jayapi.Managers.Message.Message_Manager;
import net.perforce.jayapi.Managers.NPC.Events.PlayerJoin;
import net.perforce.jayapi.Managers.NPC.Events.PlayerQuit;
import net.perforce.jayapi.Managers.NPC.NPC_Manager;
import net.perforce.jayapi.Managers.NPC.Events.RightClickNPCEvent.PacketReader;
import net.perforce.jayapi.Managers.Player.Player_Manager;
import net.perforce.jayapi.Managers.Rank.Rank_Manager;
import net.perforce.jayapi.Managers.Scoreboard.Scoreboard_Manager;
import net.perforce.jayapi.Managers.Tablist.TabList_Manager;
import net.perforce.jayapi.Managers.Title.Title_Manager;
import net.perforce.jayapi.Managers.World.World_Manager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


/** @ClassType Main Class */
/** @ClassInfo Initiates all Manager Classes */

public final class JayAPI extends JavaPlugin {


    public static JayAPI instance;

    //public static ArmorStand_Manager armorStand_manager;
    public static BossBar_Manager bossBar_manager;
    public static Config_Manager config_manager;
    public static Inventory_Manager inventory_manager;
    public static ItemStack_Manager itemStack_manager;
    public static Message_Manager message_manager;
    public static NPC_Manager npc_manager;
    public static Player_Manager player_manager;
    public static Rank_Manager rank_manager;
    public static Scoreboard_Manager scoreboard_manager;
    public static TabList_Manager tablist_manager;
    public static Title_Manager title_manager;
    public static World_Manager world_manager;


    @Override
    public void onEnable() {

        // Instantiate Plugin
        instance = this;

        // Register Managers
        //armorStand_manager = new ArmorStand_Manager();
        bossBar_manager = new BossBar_Manager();
        config_manager = new Config_Manager();
        inventory_manager = new Inventory_Manager();
        itemStack_manager = new ItemStack_Manager();
        message_manager = new Message_Manager();
        npc_manager = new NPC_Manager();
        player_manager = new Player_Manager();
        rank_manager = new Rank_Manager();
        scoreboard_manager = new Scoreboard_Manager();
        tablist_manager = new TabList_Manager();
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
            pluginManager.registerEvents(new PlayerJoin(), this);
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
