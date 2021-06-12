package me.jayy.jayapi.Managers.World.Utils;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.World;


/** @ClassType Util Class */
/** @ClassInfo Sets the Difficulty of a World */

public class setDifficulty {


    /** --------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                   */
    /** @UtilInfo       Sets the Difficulty of a World                              */
    /** @ParameterInfo  • world: World to set the Difficulty of                     */
    /**                 • worldName: Name of the World                              */
    /**                 • difficulty: Difficulty to set the World to                */
    /** --------------------------------------------------------------------------- */
    /**                                                                             */
    public static void setDifficulty(World world, Difficulty difficulty) {

        world.setDifficulty(difficulty);

    }
    /**                                                                             */
    public static void setDifficulty(String worldName, Difficulty difficulty) {

        Bukkit.getWorld(worldName).setDifficulty(difficulty);

    }
    /**                                                                             */
    /** --------------------------------------------------------------------------- */


}
