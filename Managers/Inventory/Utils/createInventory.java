package me.jaypeg.jayapi.Managers.Inventory.Utils;

import me.jaypeg.jayapi.Managers.ItemStack.ItemStack_Manager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;


/** @ClassType Util Class */
/** @ClassInfo Creates an Inventory from given data */

public class createInventory {


    /** --------------------------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Inventory Util                                                                                                                      */
    /** @UtilInfo       Creates an Inventory from given data                                                                                                */
    /** @ParameterInfo  • rowCount: Amount of rows in the Inventory                                                                                         */
    /**                 • title: Title of the Inventory                                                                                                     */
    /**                 • inventorySlot_itemData: HashMap containing all the data regarding the ItemStack for the corresponding Inventory slot (as Strings) */
    /**                         - material: Material of the ItemStack                                                                                       */
    /**                         - amount: Amount of the Item within the ItemStack                                                                           */
    /**                         - type: Data type of the ItemStack (used for colored wool, durability on tools, etc.)                                       */
    /**                         - displayName: Custom name displayed for the ItemStack                                                                      */
    /**                         - lore: Lore of the ItemStack (use \n to add more lines)                                                                    */
    /** --------------------------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                                     */
    public static Inventory createInventory(int rowCount, String title, HashMap<Integer, ItemStack> inventorySlot_itemStack) {

        // Create Base Inventory
        Inventory inventory = Bukkit.createInventory(null, rowCount * 9, title);

        // Add Item Data to Inventory
        for (Integer inventorySlot : inventorySlot_itemStack.keySet()) {

            ItemStack itemStack = inventorySlot_itemStack.get(inventorySlot);

            inventory.setItem(inventorySlot, itemStack);

        }

        // Return Inventory
        return inventory;

    }
    /**                                                                                                                                                     */
    /** --------------------------------------------------------------------------------------------------------------------------------------------------- */

  
}
