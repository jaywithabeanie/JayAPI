package me.jaypeg.jayapi.Managers.World;

import me.jaypeg.jayapi.Managers.World.Utils.LoadWorld;
import me.jaypeg.jayapi.Managers.World.Utils.Settings.*;
import me.jaypeg.jayapi.Managers.World.Utils.TeleportWorld;
import me.jaypeg.jayapi.Managers.World.Utils.UnloadWorld;
import org.bukkit.Difficulty;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;


/** @ClassType Manager Class */
/** @ClassInfo Manages Worlds */

public class World_Manager {

    public static void worldLoad(String worldName) {
        new LoadWorld(worldName);
    }

    public static void worldUnload(World world, Boolean saveWorld) {
        UnloadWorld.UnloadWorld(world, saveWorld);
    }

    public static void worldUnload(String worldName, Boolean saveWorld) {
        UnloadWorld.UnloadWorld(worldName, saveWorld);
    }

    public static void worldSetDifficulty(World world, Difficulty type) {
        SettingDifficulty.SettingDifficulty(world, type);
    }

    public static void worldSetDifficulty(String worldName, Difficulty type) {
        SettingDifficulty.SettingDifficulty(worldName, type);
    }

    public static void worldTime(World world, Long time) {
        SettingTime.SettingTime(world, time);
    }

    public static void worldTime(String worldName, Long time) {
        SettingTime.SettingTime(worldName, time);
    }

    public static void worldWeather(World world, Boolean thunder, Boolean storm) {
        SettingWeather.SettingWeather(world, thunder, storm);
    }

    public static void worldWeather(String worldName, Boolean thunder, Boolean storm) {
        SettingWeather.SettingWeather(worldName, thunder, storm);
    }

    public static void worldBorderCenter(World world, Location center) {
        SettingBorderCenter.SettingBorderCenter(world, center);
    }

    public static void worldBorderCenter(String worldName, Location center) {
        SettingBorderCenter.SettingBorderCenter(worldName, center);
    }

    public static void worldBorderSize(World world, Double size) {
        SettingBorderSize.SettingBorderSize(world, size);
    }

    public static void worldBorderSize(String worldName, Double size) {
        SettingBorderSize.SettingBorderSize(worldName, size);
    }

    public static void worldSpawn(World world, Integer X, Integer Y, Integer Z) {
        SettingSpawn.SettingSpawn(world, X, Y, Z);
    }

    public static void worldSpawn(String worldName, Integer X, Integer Y, Integer Z) {
        SettingSpawn.SettingSpawn(worldName, X, Y, Z);
    }

    public static void worldTeleport(World world, Player player) {
        TeleportWorld.TeleportWorld(world, player);
    }

    public static void worldTeleport(String worldName, Player player) {
        TeleportWorld.TeleportWorld(worldName, player);
    }

    public static void worldTickSpeed(World world, String ticks) {
        SettingTickSpeed.SettingTickSpeed(world, ticks);
    }

    public static void worldTickSpeed(String worldName, String ticks) {
        SettingTickSpeed.SettingTickSpeed(worldName, ticks);
    }

    public static void worldGameRule(World world, String GameRule, String value) {
        SettingGameRule.SettingGameRule(world, GameRule, value);
    }

    public static void worldGameRule(String worldName, String GameRule, String value) {
        SettingGameRule.SettingGameRule(worldName, GameRule, value);
    }

}
