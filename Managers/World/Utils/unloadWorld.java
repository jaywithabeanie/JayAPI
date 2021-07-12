package net.perforce.jayapi.Managers.World.Utils;

import org.bukkit.World;

import static org.bukkit.Bukkit.getServer;
import static org.bukkit.Bukkit.getWorld;


/** @ClassType Util Class */
/** @ClassInfo Unloads a World */

public class unloadWorld {


    /** ---------------------------------------------------------------- */
    /** @UtilType       Void Util                                        */
    /** @UtilInfo       Unloads a World                                  */
    /** @ParameterInfo  • world: World to unload                         */
    /**                 • worldName: Name of the World                   */
    /**                 • save: Whether or not to save the World         */
    /** ---------------------------------------------------------------- */
    /**                                                                  */
    public static void unloadWorld(World world, Boolean save) {

        getServer().unloadWorld(world, save);

    }
    /**                                                                  */
    public static void unloadWorld(String worldName, Boolean save) {

        getServer().unloadWorld(getWorld(worldName), save);

    }
    /**                                                                  */
    /** ---------------------------------------------------------------- */


}
