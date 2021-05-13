package me.jaypeg.jayapi.Managers.Inventory;

import me.jaypeg.jayapi.Managers.Inventory.Inventories.LobbyDuels.DuelsCompass;
import me.jaypeg.jayapi.Managers.Inventory.Inventories.LobbyMain.GameCompass;
import me.jaypeg.jayapi.Managers.Inventory.Utils.createInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;


/** @ClassType Manager Class */
/** @ClassInfo Manages Inventory utils and saved Inventories */

public class Inventory_Manager {


    /** ---------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Inventory Util                                                                                         */
    /** @UtilInfo       Creates an Inventory from given data                                                                   */
    /** @ParameterInfo  • rowCount: Amount of rows in the Inventory                                                            */
    /**                 • title: Title of the Inventory                                                                        */
    /**                 • inventorySlot_itemStack: HashMap containing all ItemStacks and their corresponding Inventory slot    */
    /** ---------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                        */
    public static Inventory createInventory(int rowCount, String title, HashMap<Integer, ItemStack> inventorySlot_itemStack) {
        return createInventory.createInventory(rowCount, title, inventorySlot_itemStack);
    }
    /**                                                                                                                        */
    /** ---------------------------------------------------------------------------------------------------------------------- */


}
