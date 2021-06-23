package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;

public class removeArmorStand {

    public static void removeArmorStand(String armorStandID) {
        ArmorStand_Manager.getArmorStands().remove(armorStandID);
    }

}
