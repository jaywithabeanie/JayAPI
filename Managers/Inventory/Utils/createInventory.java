package net.perforce.jayapi.Managers.Inventory.Utils;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;


/** @ClassType Util Class */
/** @ClassInfo Creates an Inventory with given data */

public class createInventory {


    /** ------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Inventory Util                                                                                      */
    /** @UtilInfo       Creates an Inventory with given data                                                                */
    /** @ParameterInfo  • rowCount: Amount of rows in the Inventory                                                         */
    /**                 • title: Title of the Inventory                                                                     */
    /**                 • inventoryContent: HashMap containing all Inventory slots with their corresponding ItemStacks      */
    /** ------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                     */
    public static Inventory createInventory(int rowCount, String title, HashMap<Integer, ItemStack> inventoryContent) {

        // Create Base Inventory
        Inventory inventory = Bukkit.createInventory(null, rowCount * 9, title);

        // Add ItemStacks to Inventory
        for (Integer inventorySlot : inventoryContent.keySet()) {

            ItemStack itemStack = inventoryContent.get(inventorySlot);

            inventory.setItem(inventorySlot, itemStack);

        }

        // Return Inventory
        return inventory;

    }
    /**                                                                                                                     */
    /** ------------------------------------------------------------------------------------------------------------------- */


}
