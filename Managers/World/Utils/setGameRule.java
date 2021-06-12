package me.jayy.jayapi.Managers.World.Utils;

import org.bukkit.Bukkit;
import org.bukkit.World;


/** @ClassType Util Class */
/** @ClassInfo Changes a Game Rule for a World */

public class setGameRule {


    /** --------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                         */
    /** @UtilInfo       Changes a Game Rule for a World                                   */
    /** @ParameterInfo  • world: World to change the Game Rule of                         */
    /**                 • worldName: Name of the World                                    */
    /**                 • gameRule: Game Rule to change                                   */
    /**                 • value: Value to change the Game Rule to                         */
    /** --------------------------------------------------------------------------------- */
    /**                                                                                   */
    public static void setGameRule(World world, String gameRule, String value) {

        world.setGameRuleValue(gameRule, value);

    }
    /**                                                                                   */
    public static void setGameRule(String worldName, String gameRule, String value) {

        Bukkit.getWorld(worldName).setGameRuleValue(gameRule, value);

    }
    /**                                                                                   */
    /** --------------------------------------------------------------------------------- */


}
