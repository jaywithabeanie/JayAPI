package me.jaypeg.jayapi.Managers.World.Utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;


/** @ClassType Util Class */
/** @ClassInfo Sets the Border of a World */

public class setBorder {


    /** ------------------------------------------------------------------------------ */
    /** @UtilType       Void Util                                                      */
    /** @UtilInfo       Sets the Border of a World                                     */
    /** @ParameterInfo  • world: World to set the Border of                            */
    /**                 • worldName: Name of the World                                 */
    /**                 • center: Center of the Border                                 */
    /**                 • size: Size of the Border                                     */
    /** ------------------------------------------------------------------------------ */
    /**                                                                                */
    public static void setBorder(World world, Location center, Double size) {

        world.getWorldBorder().setCenter(center);
        world.getWorldBorder().setSize(size);

    }
    /**                                                                                */
    public static void setBorder(String worldName, Location center, Double size) {

        Bukkit.getWorld(worldName).getWorldBorder().setCenter(center);
        Bukkit.getWorld(worldName).getWorldBorder().setSize(size);

    }
    /**                                                                                */
    /** ------------------------------------------------------------------------------ */


}
