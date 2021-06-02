package me.jaypeg.jayapi.Managers.ArmorStand.Utils;

import me.jaypeg.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import org.bukkit.Location;

public class StandSetLocation {

    public static void StandSetLocation(String standID, Location newLocation) {
        ArmorStand_Manager.getStandLocation(standID).setX(newLocation.getX());
        ArmorStand_Manager.getStandLocation(standID).setY(newLocation.getY());
        ArmorStand_Manager.getStandLocation(standID).setZ(newLocation.getZ());
    }

}
