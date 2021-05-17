package me.jaypeg.jayapi.Managers.ItemStack;

import me.jaypeg.jayapi.Managers.ItemStack.Utils.createItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


/** @ClassType Manager Class */
/** @ClassInfo Manages ItemStack utils and saved lobbyMain_ItemStacks */

public class ItemStack_Manager {


    /** ------------------------------------------------------------------------------------------------------ */
    /** @UtilType       ItemStack Util                                                                         */
    /** @UtilInfo       Creates an ItemStack with given data                                                   */
    /** @ParameterInfo  • material: Material of the ItemStack                                                  */
    /**                 • amount: Amount of the Material in the ItemStack                                      */
    /**                 • type: Data type of the ItemStack (used for colored wool, durability on tools, etc.)  */
    /**                 • displayName: Custom name displayed for the ItemStack                                 */
    /** ------------------------------------------------------------------------------------------------------ */
    /**                                                                                                        */
    public static ItemStack createItemStack(Material material, int amount, int type, String displayName) {
        return createItemStack.createItemStack(material, amount, type, displayName);
    }
    /**                                                                                                        */
    /** ------------------------------------------------------------------------------------------------------ */


}
