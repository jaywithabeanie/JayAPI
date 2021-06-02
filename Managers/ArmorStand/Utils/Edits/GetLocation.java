package me.jaypeg.jayapi.Managers.ArmorStand.Utils.Edits;

import me.jaypeg.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import org.bukkit.Location;

public class GetLocation {

    public static Location GetLocation(String standID) {
        return ArmorStand_Manager.holograms.get(standID).get(0).getBukkitEntity().getLocation();
    }


}
