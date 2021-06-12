package me.jayy.jayapi.Managers.World.Utils;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;


/** @ClassType Util Class */
/** @ClassInfo Teleports a Player to a World */

public class teleportToWorld {


    /** --------------------------------------------------------------------- */
    /** @UtilType       Void Util                                             */
    /** @UtilInfo       Teleports a Player to a World                         */
    /** @ParameterInfo  • world: World to teleport the Player to              */
    /**                 • worldName: Name of the World                        */
    /**                 • player: Player to teleport                          */
    /** --------------------------------------------------------------------- */
    /**                                                                       */
    public static void teleportToWorld(World world, Player player) {

        player.teleport(world.getSpawnLocation());

    }
    /**                                                                       */
    public static void teleportToWorld(String worldName, Player player) {

        player.teleport(Bukkit.getWorld(worldName).getSpawnLocation());

    }
    /**                                                                       */
    /** --------------------------------------------------------------------- */


}
