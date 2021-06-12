package me.jayy.jayapi.Managers.ItemStack;

import me.jayy.jayapi.Managers.ItemStack.Utils.*;
import org.bukkit.Color;
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
    /**                 • hidden: Whether or not the Enchantments are hidden in the ItemStack's lore                               */
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


    /** --------------------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       ItemStack Util                                                                                                                */
    /** @UtilInfo       Creates an ItemStack for a Book with given data                                                                               */
    /** @ParameterInfo  • author: Name of the Author of the Book                                                                                      */
    /**                 • pages: ArrayList containing every Page of the Book                                                                          */
    /**                 • amount: Amount of Books in the ItemStack                                                                                    */
    /**                 • displayName: Custom name displayed for the ItemStack                                                                        */
    /**                 • lore: Lore of the ItemStack                                                                                                 */
    /** --------------------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                               */
    public static ItemStack createBookItemStack(String author, ArrayList<String> pages, int amount, String displayName) {
        return createBookItemStack.createBookItemStack(author, pages, amount, displayName);
    }
    /**                                                                                                                                               */
    public static ItemStack createBookItemStack(String author, ArrayList<String> pages, int amount, String displayName, ArrayList<String> lore) {
        return createBookItemStack.createBookItemStack(author, pages, amount, displayName, lore);
    }
    /**                                                                                                                                               */
    /** --------------------------------------------------------------------------------------------------------------------------------------------- */


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


    /** ----------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       ItemStack Util                                                                                                                                    */
    /** @UtilInfo       Creates an ItemStack for Leather Armor with given data                                                                                            */
    /** @ParameterInfo  • material: Material of the ItemStack                                                                                                             */
    /**                 • color: Color of the Leather Armor                                                                                                               */
    /**                 • redValue, greenValue, blueValue: RGB values for the Color of the Leather Armor                                                                  */
    /**                 • displayName: Custom name displayed for the ItemStack                                                                                            */
    /**                 • lore: Lore of the ItemStack                                                                                                                     */
    /** ----------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, Color color) {
        return createLeatherArmorItemStack.createLeatherArmorItemStack(material, color);
    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, Color color, String displayName) {
        return createLeatherArmorItemStack.createLeatherArmorItemStack(material, color, displayName);
    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, Color color, String displayName, ArrayList<String> lore) {
        return createLeatherArmorItemStack.createLeatherArmorItemStack(material, color, displayName, lore);
    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, Color color, ArrayList<String> lore) {
        return createLeatherArmorItemStack.createLeatherArmorItemStack(material, color, lore);
    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, int redValue, int greenValue, int blueValue) {
        return createLeatherArmorItemStack.createLeatherArmorItemStack(material, redValue, greenValue, blueValue);
    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, int redValue, int greenValue, int blueValue, String displayName) {
        return createLeatherArmorItemStack.createLeatherArmorItemStack(material, redValue, greenValue, blueValue, displayName);
    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, int redValue, int greenValue, int blueValue, String displayName, ArrayList<String> lore) {
        return createLeatherArmorItemStack.createLeatherArmorItemStack(material, redValue, greenValue, blueValue, displayName, lore);
    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, int redValue, int greenValue, int blueValue, ArrayList<String> lore) {
        return createLeatherArmorItemStack.createLeatherArmorItemStack(material, redValue, greenValue, blueValue, lore);
    }
    /**                                                                                                                                                                   */
    /** ----------------------------------------------------------------------------------------------------------------------------------------------------------------- */


    /** --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       ItemStack Util                                                                                                                                              */
    /** @UtilInfo       Creates an ItemStack for a Potion with given data                                                                                                           */
    /** @ParameterInfo  • mainEffect: Main Effect of the Potion (~ color)                                                                                                           */
    /**                 • potionEffects: Potion Effects the Potion contains                                                                                                         */
    /**                 • amount: Amount of Potions in the ItemStack                                                                                                                */
    /**                 • displayName: Custom name displayed for the ItemStack                                                                                                      */
    /**                 • lore: Lore of the ItemStack                                                                                                                               */
    /** --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                                                                             */
    public static ItemStack createPotionItemStack(PotionEffectType mainEffect, ArrayList<PotionEffect> potionEffects, int amount) {
        return createPotionItemStack.createPotionItemStack(mainEffect, potionEffects, amount);
    }
    /**                                                                                                                                                                             */
    public static ItemStack createPotionItemStack(PotionEffectType mainEffect, ArrayList<PotionEffect> potionEffects, int amount, String displayName) {
        return createPotionItemStack.createPotionItemStack(mainEffect, potionEffects, amount, displayName);
    }
    /**                                                                                                                                                                             */
    public static ItemStack createPotionItemStack(PotionEffectType mainEffect, ArrayList<PotionEffect> potionEffects, int amount, String displayName, ArrayList<String> lore) {
        return createPotionItemStack.createPotionItemStack(mainEffect, potionEffects, amount, displayName, lore);
    }
    /**                                                                                                                                                                             */
    public static ItemStack createPotionItemStack(PotionEffectType mainEffect, ArrayList<PotionEffect> potionEffects, int amount, ArrayList<String> lore) {
        return createPotionItemStack.createPotionItemStack(mainEffect, potionEffects, amount, lore);
    }
    /**                                                                                                                                                                             */
    /** --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       ItemStack Util                                                                                            */
    /** @UtilInfo       Creates an ItemStack for a Skull with given data                                                          */
    /** @ParameterInfo  • skullOwner: Owner of the Skull                                                                          */
    /**                 • amount: Amount of Potions in the ItemStack                                                              */
    /**                 • displayName: Custom name displayed for the ItemStack                                                    */
    /**                 • lore: Lore of the ItemStack                                                                             */
    /** ------------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                           */
    public static ItemStack createSkullItemStack(String skullOwner, int amount) {
        return createSkullItemStack.createSkullItemStack(skullOwner, amount);
    }
    /**                                                                                                                           */
    public static ItemStack createSkullItemStack(String skullOwner, int amount, String displayName) {
        return createSkullItemStack.createSkullItemStack(skullOwner, amount, displayName);
    }
    /**                                                                                                                           */
    public static ItemStack createSkullItemStack(String skullOwner, int amount, String displayName, ArrayList<String> lore) {
        return createSkullItemStack.createSkullItemStack(skullOwner, amount, displayName, lore);
    }
    /**                                                                                                                           */
    public static ItemStack createSkullItemStack(String skullOwner, int amount, ArrayList<String> lore) {
        return createSkullItemStack.createSkullItemStack(skullOwner, amount, lore);
    }
    /**                                                                                                                           */
    /** ------------------------------------------------------------------------------------------------------------------------- */


}
