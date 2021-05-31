package me.jaypeg.jayapi.Managers.ItemStack.Utils;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;


/** @ClassType Util Class */
/** @ClassInfo Creates an ItemStack for Leather Armor with given data */

public class createLeatherArmorItemStack {


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

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, 1);

        // Change LeatherArmorMeta
        {
            LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();

            leatherArmorMeta.setColor(color);

            itemStack.setItemMeta(leatherArmorMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, Color color, String displayName) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, 1);

        // Change LeatherArmorMeta
        {
            LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();

            leatherArmorMeta.setColor(color);
            leatherArmorMeta.setDisplayName(displayName);

            itemStack.setItemMeta(leatherArmorMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, Color color, String displayName, ArrayList<String> lore) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, 1);

        // Change LeatherArmorMeta
        {
            LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();

            leatherArmorMeta.setColor(color);
            leatherArmorMeta.setDisplayName(displayName);
            leatherArmorMeta.setLore(lore);

            itemStack.setItemMeta(leatherArmorMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, Color color, ArrayList<String> lore) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, 1);

        // Change LeatherArmorMeta
        {
            LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();

            leatherArmorMeta.setColor(color);
            leatherArmorMeta.setLore(lore);

            itemStack.setItemMeta(leatherArmorMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, int redValue, int greenValue, int blueValue) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, 1);

        // Change LeatherArmorMeta
        {
            LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();

            leatherArmorMeta.setColor(Color.fromRGB(redValue, greenValue, blueValue));

            itemStack.setItemMeta(leatherArmorMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, int redValue, int greenValue, int blueValue, String displayName) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, 1);

        // Change LeatherArmorMeta
        {
            LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();

            leatherArmorMeta.setColor(Color.fromRGB(redValue, greenValue, blueValue));
            leatherArmorMeta.setDisplayName(displayName);

            itemStack.setItemMeta(leatherArmorMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, int redValue, int greenValue, int blueValue, String displayName, ArrayList<String> lore) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, 1);

        // Change LeatherArmorMeta
        {
            LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();

            leatherArmorMeta.setColor(Color.fromRGB(redValue, greenValue, blueValue));
            leatherArmorMeta.setDisplayName(displayName);
            leatherArmorMeta.setLore(lore);

            itemStack.setItemMeta(leatherArmorMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                   */
    public static ItemStack createLeatherArmorItemStack(Material material, int redValue, int greenValue, int blueValue, ArrayList<String> lore) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, 1);

        // Change LeatherArmorMeta
        {
            LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) itemStack.getItemMeta();

            leatherArmorMeta.setColor(Color.fromRGB(redValue, greenValue, blueValue));
            leatherArmorMeta.setLore(lore);

            itemStack.setItemMeta(leatherArmorMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                   */
    /** ----------------------------------------------------------------------------------------------------------------------------------------------------------------- */


 }
