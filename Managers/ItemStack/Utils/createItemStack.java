package net.perforce.jayapi.Managers.ItemStack.Utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;


/** @ClassType Util Class */
/** @ClassInfo Creates an ItemStack with given data */

public class createItemStack {


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

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, amount, (short) type);

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                */
    public static ItemStack createItemStack(Material material, int amount, int type, String displayName) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, amount, (short) type);

        // Change ItemMeta
        {
            ItemMeta meta = itemStack.getItemMeta();

            meta.setDisplayName(displayName);

            itemStack.setItemMeta(meta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                */
    public static ItemStack createItemStack(Material material, int amount, int type, String displayName, ArrayList<String> lore) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, amount, (short) type);

        // Change ItemMeta
        {
            ItemMeta meta = itemStack.getItemMeta();

            assert meta != null;
            meta.setDisplayName(displayName);
            meta.setLore(lore);

            itemStack.setItemMeta(meta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                */
    public static ItemStack createItemStack(Material material, int amount, int type, ArrayList<String> lore) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(material, amount, (short) type);

        // Change ItemMeta
        {
            ItemMeta meta = itemStack.getItemMeta();

            assert meta != null;
            meta.setLore(lore);

            itemStack.setItemMeta(meta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                */
    /** ------------------------------------------------------------------------------------------------------------------------------ */


}
