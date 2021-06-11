package me.jaypeg.jayapi.Managers.World.Utils;

import org.bukkit.Bukkit;
import org.bukkit.World;


/** @ClassType Util Class */
/** @ClassInfo Sets the Weather of a World */

public class setWeather {


    /** --------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                         */
    /** @UtilInfo       Sets the Weather of a World                                       */
    /** @ParameterInfo  • world: World to set the Weather of                              */
    /**                 • worldName: Name of the World                                    */
    /**                 • thunder: Whether it should be Thundering                        */
    /**                 • storm: Whether it should be Storming                            */
    /** --------------------------------------------------------------------------------- */
    /**                                                                                   */
    public static void setWeather(World world, Boolean thunder, Boolean storm) {

        world.setThundering(thunder);
        world.setStorm(storm);

    }
    /**                                                                                   */
    public static void setWeather(String worldName, Boolean thunder, Boolean storm) {

        Bukkit.getWorld(worldName).setThundering(thunder);
        Bukkit.getWorld(worldName).setStorm(storm);;

    }
    /**                                                                                   */
    /** --------------------------------------------------------------------------------- */


}
