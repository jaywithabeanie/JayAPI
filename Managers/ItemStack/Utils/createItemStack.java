package me.jaypeg.jayapi.Managers.ItemStack.Utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;


/** @ClassType Util Class */
/** @ClassInfo Creates an ItemStack from given data */

public class createItemStack {


    /** ------------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       ItemStack Util                                                                                      */
    /** @UtilInfo       Creates an ItemStack from given data                                                                */
    /** @ParameterInfo  • material: Material of the ItemStack                                                               */
    /**                 • amount: Amount of the Item within the ItemStack                                                   */
    /**                 • type: Data type of the ItemStack (used for colored wool, durability on tools, etc.)               */
    /**                 • displayName: Custom name displayed for the ItemStack                                              */
    /**                 • lore: Lore of the ItemStack (use \n to add more lines)                                            */
    /** ------------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                     */
    public static ItemStack createItemStack(Material material, int amount, int type, String displayName, String lore) {
        ItemStack item = new ItemStack(material, amount, (short) type);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        if (!displayName.equals("/")) meta.setDisplayName(displayName);
        String[] itemLore = new String[0];
        if (!lore.equals("/")) itemLore = lore.split("\n");
        meta.setLore(Arrays.asList(itemLore));
        meta.spigot().setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }
    /**                                                                                                                     */
    /** ------------------------------------------------------------------------------------------------------------------- */


}
