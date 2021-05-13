package me.jaypeg.jayapi;

import me.jaypeg.jayapi.Managers.Config.Config_Manager;
import me.jaypeg.jayapi.Managers.Inventory.Inventory_Manager;
import me.jaypeg.jayapi.Managers.ItemStack.ItemStack_Manager;
import me.jaypeg.jayapi.Managers.Message.Message_Manager;
import me.jaypeg.jayapi.Managers.Message.Utils.initiateMessages;
import me.jaypeg.jayapi.Managers.Scoreboard.Scoreboard_Manager;
import org.bukkit.plugin.java.JavaPlugin;


/** @ClassType Main Class */
/** @ClassInfo Initiates all Manager Classes */

public final class JayAPI extends JavaPlugin {


    public Config_Manager config_manager;
    public Inventory_Manager inventory_manager;
    public ItemStack_Manager itemStack_manager;
    public Message_Manager message_manager;
    public Scoreboard_Manager scoreboard_manager;


    @Override
    public void onEnable() {
        
        initiateMessages.initiateMessages();

        config_manager = new Config_Manager();
        inventory_manager = new Inventory_Manager();
        itemStack_manager = new ItemStack_Manager();
        message_manager = new Message_Manager();
        scoreboard_manager = new Scoreboard_Manager();

    }


}
