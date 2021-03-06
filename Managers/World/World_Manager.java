package net.perforce.jayapi.Managers.World;

import net.perforce.jayapi.Managers.World.Utils.*;
import org.bukkit.Difficulty;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;


/** @ClassType Manager Class */
/** @ClassInfo Manages Worlds */

public class World_Manager {


    /** ----------------------------------------------------------------------- */
    /** @UtilType       Void Util                                               */
    /** @UtilInfo       Loads a World                                           */
    /** @ParameterInfo  • worldName: Name of the World to load                  */
    /** ----------------------------------------------------------------------- */
    /**                                                                         */
    public void loadWorld(String worldName) {
        loadWorld.loadWorld(worldName);
    }
    /**                                                                         */
    /** ----------------------------------------------------------------------- */


    /** ---------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                  */
    /** @UtilInfo       Sets the Border of a World                                                                 */
    /** @ParameterInfo  • world: World to set the Border of                                                        */
    /**                 • worldName: Name of the World                                                             */
    /**                 • center: Center of the Border                                                             */
    /**                 • size: Size of the Border                                                                 */
    /** ---------------------------------------------------------------------------------------------------------- */
    /**                                                                                                            */
    public void setBorder(World world, Location center, Double size) {
        setBorder.setBorder(world, center, size);
    }
    /**                                                                                                            */
    public void setBorder(String worldName, Location center, Double size) {
        setBorder.setBorder(worldName, center, size);
    }
    /**                                                                                                            */
    /** ---------------------------------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                     */
    /** @UtilInfo       Sets the Difficulty of a World                                                                */
    /** @ParameterInfo  • world: World to set the Difficulty of                                                       */
    /**                 • worldName: Name of the World                                                                */
    /**                 • difficulty: Difficulty to set the World to                                                  */
    /** ------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                               */
    public void setDifficulty(World world, Difficulty difficulty) {
        setDifficulty.setDifficulty(world, difficulty);
    }
    /**                                                                                                               */
    public void setDifficulty(String worldName, Difficulty difficulty) {
        setDifficulty.setDifficulty(worldName, difficulty);
    }
    /**                                                                                                               */
    /** ------------------------------------------------------------------------------------------------------------- */


    /** -------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                  */
    /** @UtilInfo       Changes a Game Rule for a World                            */
    /** @ParameterInfo  • world: World to change the Game Rule of                  */
    /**                 • worldName: Name of the World                             */
    /**                 • gameRule: Game Rule to change                            */
    /**                 • value: Value to change the Game Rule to                  */
    /** -------------------------------------------------------------------------- */
    /**                                                                            */
    public void setGameRule(World world, String gameRule, String value) {
        setGameRule.setGameRule(world, gameRule, value);
    }
    /**                                                                            */
    public void setGameRule(String worldName, String gameRule, String value) {
        setGameRule.setGameRule(worldName, gameRule, value);
    }
    /**                                                                            */
    /** -------------------------------------------------------------------------- */


    /** -------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                      */
    /** @UtilInfo       Sets the Spawn of a World                                                                      */
    /** @ParameterInfo  • world: World to set the Spawn of                                                             */
    /**                 • worldName: Name of the World                                                                 */
    /**                 • x, y, z: X, Y and Z values for the Spawn Location                                            */
    /** -------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                */
    public void setSpawn(World world, Integer x, Integer y, Integer z) {
        setSpawn.setSpawn(world, x, y, z);
    }
    /**                                                                                                                */
    public void setSpawn(String worldName, Integer x, Integer y, Integer z) {
        setSpawn.setSpawn(worldName, x, y, z);
    }
    /**                                                                                                                */
    /** -------------------------------------------------------------------------------------------------------------- */


    /** ---------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                          */
    /** @UtilInfo       Sets the Time of a World                                           */
    /** @ParameterInfo  • world: World to set the Time of                                  */
    /**                 • worldName: Name of the World                                     */
    /**                 • time: Time to set the World's Time to                            */
    /** ---------------------------------------------------------------------------------- */
    /**                                                                                    */
    public void setTime(World world, Long time) {
        setTime.setTime(world, time);
    }
    /**                                                                                    */
    public void setTime(String worldName, Long time) {
        setTime.setTime(worldName, time);
    }
    /**                                                                                    */
    /** ---------------------------------------------------------------------------------- */


    /** -------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                  */
    /** @UtilInfo       Sets the Weather of a World                                */
    /** @ParameterInfo  • world: World to set the Weather of                       */
    /**                 • worldName: Name of the World                             */
    /**                 • thunder: Whether it should be Thundering                 */
    /**                 • storm: Whether it should be Storming                     */
    /** -------------------------------------------------------------------------- */
    /**                                                                            */
    public void setWeather(World world, Boolean thunder, Boolean storm) {
        setWeather.setWeather(world, thunder, storm);
    }
    /**                                                                            */
    public void setWeather(String worldName, Boolean thunder, Boolean storm) {
        setWeather.setWeather(worldName, thunder, storm);
    }
    /**                                                                            */
    /** -------------------------------------------------------------------------- */


    /** ---------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                        */
    /** @UtilInfo       Teleports a Player to a World                                                                    */
    /** @ParameterInfo  • world: World to teleport the Player to                                                         */
    /**                 • worldName: Name of the World                                                                   */
    /**                 • player: Player to teleport                                                                     */
    /** ---------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                                  */
    public void teleportToWorld(World world, Player player) {
        teleportToWorld.teleportToWorld(world, player);
    }
    /**                                                                                                                  */
    public void teleportToWorld(String worldName, Player player) {
        teleportToWorld.teleportToWorld(worldName, player);
    }
    /**                                                                                                                  */
    /** ---------------------------------------------------------------------------------------------------------------- */


    /** ------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                         */
    /** @UtilInfo       Unloads a World                                                                   */
    /** @ParameterInfo  • world: World to unload                                                          */
    /**                 • worldName: Name of the World                                                    */
    /**                 • save: Whether or not to save the World                                          */
    /** ------------------------------------------------------------------------------------------------- */
    /**                                                                                                   */
    public void unloadWorld(World world, Boolean save) {
        unloadWorld.unloadWorld(world, save);
    }
    /**                                                                                                   */
    public void unloadWorld(String worldName, Boolean save) {
        unloadWorld.unloadWorld(worldName, save);
    }
    /**                                                                                                   */
    /** ------------------------------------------------------------------------------------------------- */


}
