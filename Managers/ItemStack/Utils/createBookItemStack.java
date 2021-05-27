package me.jaypeg.jayapi.Managers.ItemStack.Utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.ArrayList;


/** @ClassType Util Class */
/** @ClassInfo Creates an ItemStack for a Book with given data */

public class createBookItemStack {


    /** --------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       ItemStack Util                                                                                        */
    /** @UtilInfo       Creates an ItemStack for a Book with given data                                                       */
    /** @ParameterInfo  • amount: Amount of Books in the ItemStack                                                            */
    /**                 • displayName: Custom name displayed for the ItemStack                                                */
    /**                 • author: Name of the author of the Book                                                              */
    /**                 • pages: ArrayList of every page of the Book                                                          */
    /** --------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                       */
    public static ItemStack createBookItemStack(int amount, String displayName, String author, ArrayList<String> pages) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(Material.WRITTEN_BOOK, amount);

        // Change ItemMeta
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
    /**                                                                                                                       */
    /** --------------------------------------------------------------------------------------------------------------------- */


}
