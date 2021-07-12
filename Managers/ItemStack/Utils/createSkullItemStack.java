package net.perforce.jayapi.Managers.ItemStack.Utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;


/** @ClassType Util Class */
/** @ClassInfo Creates an ItemStack for a Skull with given data */

public class createSkullItemStack {


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

        // Create ItemStack
        ItemStack itemStack = new ItemStack(Material.SKULL_ITEM, amount, (short) 3);

        // Change SkullMeta
        {
            SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();

            skullMeta.setOwner(skullOwner);

            itemStack.setItemMeta(skullMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                           */
    public static ItemStack createSkullItemStack(String skullOwner, int amount, String displayName) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(Material.SKULL_ITEM, amount, (short) 3);

        // Change SkullMeta
        {
            SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();

            skullMeta.setOwner(skullOwner);
            skullMeta.setDisplayName(displayName);

            itemStack.setItemMeta(skullMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                           */
    public static ItemStack createSkullItemStack(String skullOwner, int amount, String displayName, ArrayList<String> lore) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(Material.SKULL_ITEM, amount, (short) 3);

        // Change SkullMeta
        {
            SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();

            skullMeta.setOwner(skullOwner);
            skullMeta.setDisplayName(displayName);
            skullMeta.setLore(lore);

            itemStack.setItemMeta(skullMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                           */
    public static ItemStack createSkullItemStack(String skullOwner, int amount, ArrayList<String> lore) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(Material.SKULL_ITEM, amount, (short) 3);

        // Change SkullMeta
        {
            SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();

            skullMeta.setOwner(skullOwner);
            skullMeta.setLore(lore);

            itemStack.setItemMeta(skullMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                           */
    /** ------------------------------------------------------------------------------------------------------------------------- */


}
