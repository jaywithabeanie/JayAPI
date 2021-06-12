package me.jayy.jayapi.Managers.World.Utils;

import org.bukkit.Bukkit;
import org.bukkit.World;


/** @ClassType Util Class */
/** @ClassInfo Sets the Time of a World */

public class setTime {


    /** --------------------------------------------------------- */
    /** @UtilType       Void Util                                 */
    /** @UtilInfo       Sets the Time of a World                  */
    /** @ParameterInfo  • world: World to set the Time of         */
    /**                 • worldName: Name of the World            */
    /**                 • time: Time to set the World's Time to   */
    /** --------------------------------------------------------- */
    /**                                                           */
    public static void setTime(World world, Long time) {

        world.setTime(time);

    }
    /**                                                           */
    public static void setTime(String worldName, Long time) {

        Bukkit.getWorld(worldName).setTime(time);

    }
    /**                                                           */
    /** --------------------------------------------------------- */


}
