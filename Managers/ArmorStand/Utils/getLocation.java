package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import org.bukkit.Location;

public class getLocation {

    public static Location getLocation(String armorStandID) {
        return ArmorStand_Manager.holograms.get(armorStandID).get(0).getBukkitEntity().getLocation();
    }


}
