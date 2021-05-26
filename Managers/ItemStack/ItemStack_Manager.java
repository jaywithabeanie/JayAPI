package me.jaypeg.jayapi.Managers.ItemStack;

import me.jaypeg.jayapi.Managers.ItemStack.Utils.addEnchantments;
import me.jaypeg.jayapi.Managers.ItemStack.Utils.addItemFlags;
import me.jaypeg.jayapi.Managers.ItemStack.Utils.createItemStack;
import me.jaypeg.jayapi.Managers.ItemStack.Utils.createPotionItemStack;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.HashMap;


/** @ClassType Manager Class */
/** @ClassInfo Manages ItemStacks */

public class ItemStack_Manager {


    /** -------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       ItemStack Util                                                                                             */
    /** @UtilInfo       Adds given Enchantments to an ItemStack                                                                    */
    /** @ParameterInfo  • itemStack: ItemStack to add Enchantments to                                                              */
    /**                 • enchantments: HashMap containing all the Enchantments with their corresponding level                     */
    /**                 • hidden: Whether or not the Enchantments are hidden in the item's lore                                    */
    /** -------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                            */
    public static ItemStack addEnchantments(ItemStack itemStack, HashMap<Enchantment, Integer> enchantments, boolean hidden) {
        return addEnchantments.addEnchantments(itemStack, enchantments, hidden);
    }
    /**                                                                                                                            */
    /** -------------------------------------------------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------ */
    /** @UtilType       ItemStack Util                                                             */
    /** @UtilInfo       Adds given ItemFlags to an ItemStack                                       */
    /** @ParameterInfo  • itemStack: ItemStack to add ItemFlags to                                 */
    /**                 • itemFlags: ArrayList of all ItemFlags to be added                        */
    /** ------------------------------------------------------------------------------------------ */
    /**                                                                                            */
    public static ItemStack addItemFlags(ItemStack itemStack, ArrayList<ItemFlag> itemFlags) {
        return addItemFlags.addItemFlags(itemStack, itemFlags);
    }
    /**                                                                                            */
    /** ------------------------------------------------------------------------------------------ */


    /** ------------------------------------------------------------------------------------------------------------------------------ */
    /** @UtilType       ItemStack Util                                                                                                 */
    /** @UtilInfo       Creates an ItemStack with given data                                                                           */
    /** @ParameterInfo  • material: Material of the ItemStack                                                                          */
    /**                 • amount: Amount of the Material in the ItemStack                                                              */
    /**                 • type: Data type of the ItemStack (used for colored wool, durability on tools, etc.)                          */
    /**                 • displayName: Custom name displayed for the ItemStack                                                         */
    /**                 • lore: Lore of the ItemStack                                                                                  */
    /** ------------------------------------------------------------------------------------------------------------------------------ */
    /**                                                                                                                                */
    public static ItemStack createItemStack(Material material, int amount, int type) {
        return createItemStack.createItemStack(material, amount, type);
    }
    /**                                                                                                                                */
    public static ItemStack createItemStack(Material material, int amount, int type, String displayName) {
        return createItemStack.createItemStack(material, amount, type, displayName);
    }
    /**                                                                                                                                */
    public static ItemStack createItemStack(Material material, int amount, int type, String displayName, ArrayList<String> lore) {
        return createItemStack.createItemStack(material, amount, type, displayName, lore);
    }
    /**                                                                                                                                */
    public static ItemStack createItemStack(Material material, int amount, int type, ArrayList<String> lore) {
        return createItemStack.createItemStack(material, amount, type, lore);
    }
    /**                                                                                                                                */
    /** ------------------------------------------------------------------------------------------------------------------------------ */


    /** ------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       ItemStack Util                                                                                                  */
    /** @UtilInfo       Creates an ItemStack for a Potion with given data                                                               */
    /** @ParameterInfo  • mainEffect: Main Effect of the Potion (~ color)                                                               */
    /**                 • potionEffects: Potion Effects the Potion contains                                                             */
    /**                 • amount: Amount of Potions in the ItemStack                                                                    */
    /** ------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                 */
    public static ItemStack createPotionItemStack(PotionEffectType mainEffect, ArrayList<PotionEffect> potionEffects, int amount) {
        return createPotionItemStack.createPotionItemStack(mainEffect, potionEffects, amount);
    }
    /**                                                                                                                                 */
    /** ------------------------------------------------------------------------------------------------------------------------------- */

    
}
