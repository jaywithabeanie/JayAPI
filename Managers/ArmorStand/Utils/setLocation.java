package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import org.bukkit.Location;

public class setLocation {

    public static void setLocation(String armorStandID, Location location) {
        ArmorStand_Manager.getLocation(armorStandID).setX(location.getX());
        ArmorStand_Manager.getLocation(armorStandID).setY(location.getY());
        ArmorStand_Manager.getLocation(armorStandID).setZ(location.getZ());
    }

}
