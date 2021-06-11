package me.jaypeg.jayapi.Managers.World.Utils;

import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;


/** @ClassType Util Class */
/** @ClassInfo Loads a World */

public class loadWorld {


    /** ------------------------------------------------------ */
    /** @UtilType       Void Util                              */
    /** @UtilInfo       Changes a Game Rule for a World        */
    /** @ParameterInfo  • worldName: Name of the World to load */
    /** ------------------------------------------------------ */
    /**                                                        */
    public static void loadWorld(String worldName) {

        Bukkit.getServer().createWorld(new WorldCreator(worldName));

    }
    /**                                                        */
    /** ------------------------------------------------------ */


}
