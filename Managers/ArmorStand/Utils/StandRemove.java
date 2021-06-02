package me.jaypeg.jayapi.Managers.ArmorStand.Utils;

import me.jaypeg.jayapi.Managers.ArmorStand.ArmorStand_Manager;

public class StandRemove {

    public static void ArmorStandRemove(String standID) {
        ArmorStand_Manager.getArmorStands().remove(standID);
    }

}
