package me.jaypeg.jayapi.Managers.ArmorStand.Utils;

import me.jaypeg.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import java.util.Set;

public class getArmorStands {

    public static Set<String> getArmorStands() {
        return ArmorStand_Manager.holograms.keySet();
    }

}
