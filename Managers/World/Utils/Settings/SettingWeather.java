package me.jaypeg.jayapi.Managers.World.Utils.Settings;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.WeatherType;
import org.bukkit.World;

public class SettingWeather {

    public static void SettingWeather(World world, Boolean thunder, Boolean storm) {

        world.setThundering(thunder);
        world.setStorm(storm);

    }

    public static void SettingWeather(String worldName, Boolean thunder, Boolean storm) {

        Bukkit.getWorld(worldName).setThundering(thunder);
        Bukkit.getWorld(worldName).setStorm(storm);;

    }


}
