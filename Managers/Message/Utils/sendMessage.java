package me.jaypeg.jayapi.Managers.Message.Utils;

import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.ArrayList;


public class sendMessage {


    public static void sendMessage(ArrayList<World> worlds, String message) {

        for (World world : worlds) {

            for (Player player : world.getPlayers()) {

                player.sendMessage(message);

            }

        }

    }


}
