package me.jaypeg.jayapi.Managers.ArmorStand.Utils;

import me.jaypeg.jayapi.Managers.ArmorStand.ArmorStand_Manager;
import java.util.Set;

public class StandList {

    public static Set<String> ArmorStandList() {
        return ArmorStand_Manager.holograms.keySet();
    }

}
