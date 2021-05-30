package me.jaypeg.jayapi.Managers.World.Utils.Settings;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class SettingTickSpeed {

    public static void SettingTickSpeed(World world, String ticks) {

        world.setGameRuleValue("randomTickSpeed", ticks);

    }

    public static void SettingTickSpeed(String WorldName, String ticks) {

        Bukkit.getWorld(WorldName).setGameRuleValue("randomTickSpeed", ticks);

    }

}
