package me.jaypeg.jayapi.Managers.World.Utils;

import org.bukkit.Bukkit;
import org.bukkit.World;


/** @ClassType Util Class */
/** @ClassInfo Sets the Spawn of a World */

public class setSpawn {


    /** -------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                        */
    /** @UtilInfo       Sets the Spawn of a World                                        */
    /** @ParameterInfo  • world: World to set the Spawn of                               */
    /**                 • worldName: Name of the World                                   */
    /**                 • x, y, z: X, Y and Z values for the Spawn Location              */
    /** -------------------------------------------------------------------------------- */
    /**                                                                                  */
    public static void setSpawn(World world, Integer x, Integer y, Integer z) {

        world.setSpawnLocation(x, y, z);

    }
    /**                                                                                  */
    public static void setSpawn(String worldName, Integer x, Integer y, Integer z) {

        Bukkit.getWorld(worldName).setSpawnLocation(x, y, z);

    }
    /**                                                                                  */
    /** -------------------------------------------------------------------------------- */


}
