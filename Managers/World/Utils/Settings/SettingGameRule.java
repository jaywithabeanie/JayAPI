package me.jaypeg.jayapi.Managers.World.Utils.Settings;

import org.bukkit.Bukkit;
import org.bukkit.World;

public class SettingGameRule {

    public static void SettingGameRule(World world, String GameRule, String value) {

        world.setGameRuleValue(GameRule, value);

    }

    public static void SettingGameRule(String WorldName, String GameRule, String value) {

        Bukkit.getWorld(WorldName).setGameRuleValue(GameRule, value);

    }

}
