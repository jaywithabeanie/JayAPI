package me.jaypeg.jayapi.Managers.ItemStack.Utils;

import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;


/** @ClassType Util Class */
/** @ClassInfo Adds given ItemFlags to an ItemStack */

public class addItemFlags {


    /** -------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       ItemStack Util                                                                                             */
    /** @UtilInfo       Adds given Enchantments to an ItemStack                                                                    */
    /** @ParameterInfo  • itemStack: ItemStack to add Enchantments to                                                              */
    /**                 • itemFlags: ArrayList of all ItemFlags to be added                     */
    /**                 • hidden: Whether or not the Enchantments are hidden in the item's lore                                    */
    /** -------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                            */
    public static ItemStack addItemFlags(ItemStack itemStack, ArrayList<ItemFlag> itemFlags) {

        // Create ItemStack
        ItemStack itemStack_ = itemStack;

        // Change ItemMeta
        {
            ItemMeta itemMeta = itemStack_.getItemMeta();
            for (ItemFlag itemFlag : itemFlags) {
                itemStack_.getItemMeta().addItemFlags(itemFlag);
            }
            itemStack_.setItemMeta(itemMeta);
        }

        // Return ItemStack
        return itemStack_;

    }
    /**                                                                                                                            */
    /** -------------------------------------------------------------------------------------------------------------------------- */


}
