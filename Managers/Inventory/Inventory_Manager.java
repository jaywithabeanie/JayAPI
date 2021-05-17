package me.jaypeg.jayapi.Managers.Inventory;

import me.jaypeg.jayapi.Managers.Inventory.Utils.createInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;


/** @ClassType Manager Class */
/** @ClassInfo Manages Inventories */

public class Inventory_Manager {


    /** ------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Inventory Util                                                                                      */
    /** @UtilInfo       Creates an Inventory with given data                                                                */
    /** @ParameterInfo  • rowCount: Amount of rows in the Inventory                                                         */
    /**                 • title: Title of the Inventory                                                                     */
    /**                 • inventoryContent: HashMap containing all Inventory slots with their corresponding ItemStacks      */
    /** ------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                     */
    public static Inventory createInventory(int rowCount, String title, HashMap<Integer, ItemStack> inventoryContent) {
        return createInventory.createInventory(rowCount, title, inventoryContent);
    }
    /**                                                                                                                     */
    /** ------------------------------------------------------------------------------------------------------------------- */


}
