package net.perforce.jayapi.Managers.ItemStack.Utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;


/** @ClassType Util Class */
/** @ClassInfo Creates an ItemStack for a Potion with given data */

public class createPotionItemStack {


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

        // Create ItemStack
        ItemStack itemStack = new ItemStack(Material.POTION, amount, (short) 0);

        // Change PotionMeta
        {
            PotionMeta potionMeta = (PotionMeta) itemStack.getItemMeta();

            potionMeta.setMainEffect(mainEffect);
            for (PotionEffect potionEffect : potionEffects) {
                potionMeta.addCustomEffect(potionEffect, true);
            }

            itemStack.setItemMeta(potionMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                             */
    public static ItemStack createPotionItemStack(PotionEffectType mainEffect, ArrayList<PotionEffect> potionEffects, int amount, String displayName) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(Material.POTION, amount, (short) 0);

        // Change PotionMeta
        {
            PotionMeta potionMeta = (PotionMeta) itemStack.getItemMeta();

            potionMeta.setMainEffect(mainEffect);
            for (PotionEffect potionEffect : potionEffects) {
                potionMeta.addCustomEffect(potionEffect, true);
            }
            potionMeta.setDisplayName(displayName);

            itemStack.setItemMeta(potionMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                             */
    public static ItemStack createPotionItemStack(PotionEffectType mainEffect, ArrayList<PotionEffect> potionEffects, int amount, String displayName, ArrayList<String> lore) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(Material.POTION, amount, (short) 0);

        // Change PotionMeta
        {
            PotionMeta potionMeta = (PotionMeta) itemStack.getItemMeta();

            potionMeta.setMainEffect(mainEffect);
            for (PotionEffect potionEffect : potionEffects) {
                potionMeta.addCustomEffect(potionEffect, true);
            }
            potionMeta.setDisplayName(displayName);
            potionMeta.setLore(lore);

            itemStack.setItemMeta(potionMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                             */
    public static ItemStack createPotionItemStack(PotionEffectType mainEffect, ArrayList<PotionEffect> potionEffects, int amount, ArrayList<String> lore) {

        // Create ItemStack
        ItemStack itemStack = new ItemStack(Material.POTION, amount, (short) 0);

        // Change PotionMeta
        {
            PotionMeta potionMeta = (PotionMeta) itemStack.getItemMeta();

            potionMeta.setMainEffect(mainEffect);
            for (PotionEffect potionEffect : potionEffects) {
                potionMeta.addCustomEffect(potionEffect, true);
            }
            potionMeta.setLore(lore);

            itemStack.setItemMeta(potionMeta);
        }

        // Return ItemStack
        return itemStack;

    }
    /**                                                                                                                                                                             */
    /** --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */


}
