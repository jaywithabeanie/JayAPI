package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;

public class removeLine {

    public static void removeLine(String armorStandID, int line) {
        ArmorStand_Manager.holograms.get(armorStandID).remove(line);
    }

}
