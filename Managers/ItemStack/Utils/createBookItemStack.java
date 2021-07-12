package net.perforce.jayapi.Managers.ItemStack.Utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.ArrayList;


/** @ClassType Util Class */
/** @ClassInfo Creates an ItemStack for a Book with given data */

public class createBookItemStack {


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

        // Create ItemStack
        ItemStack itemStack = new ItemStack(Material.WRITTEN_BOOK, amount);

        // Change BookMeta
        {
            BookMeta bookMeta = (BookMeta) itemStack.getItemMeta();

            bookMeta.setDisplayName(displayName);
            bookMeta.setAuthor(author);
            bookMeta.setPages(pages);

            itemStack.setItemMeta(bookMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                               */
    public static ItemStack createBookItemStack(String author, ArrayList<String> pages, int amount, String displayName, ArrayList<String> lore) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(Material.WRITTEN_BOOK, amount);

        // Change BookMeta
        {
            BookMeta bookMeta = (BookMeta) itemStack.getItemMeta();

            bookMeta.setDisplayName(displayName);
            bookMeta.setAuthor(author);
            bookMeta.setPages(pages);
            bookMeta.setLore(lore);

            itemStack.setItemMeta(bookMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                               */
    /** --------------------------------------------------------------------------------------------------------------------------------------------- */


}
