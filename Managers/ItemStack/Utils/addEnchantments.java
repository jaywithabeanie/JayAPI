package me.jayy.jayapi.Managers.ItemStack.Utils;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;


/** @ClassType Util Class */
/** @ClassInfo Adds given Enchantments to an ItemStack */

public class addEnchantments {


    /** -------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       ItemStack Util                                                                                             */
    /** @UtilInfo       Adds given Enchantments to an ItemStack                                                                    */
    /** @ParameterInfo  • itemStack: ItemStack to add Enchantments to                                                              */
    /**                 • enchantments: HashMap containing all the Enchantments with their corresponding level                     */
    /**                 • hidden: Whether or not the Enchantments are hidden in the ItemStack's lore                               */
    /** -------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                            */
    public static ItemStack addEnchantments(ItemStack itemStack, HashMap<Enchantment, Integer> enchantments, boolean hidden) {

        // Create ItemStack
        ItemStack itemStack_ = itemStack;

        // Add Enchantments
        {
            itemStack_.addUnsafeEnchantments(enchantments);

            if (hidden) {
                ItemMeta itemMeta = itemStack.getItemMeta();

                itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

                itemStack_.setItemMeta(itemMeta);
            }
        }

        // Return ItemStack
        return itemStack_;

    }
    /**                                                                                                                            */
    /** -------------------------------------------------------------------------------------------------------------------------- */


}
