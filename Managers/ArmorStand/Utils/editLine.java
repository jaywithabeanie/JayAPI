package net.perforce.jayapi.Managers.ArmorStand.Utils;

import net.perforce.jayapi.Managers.ArmorStand.ArmorStand_Manager;

public class editLine {

    public static void editLine(String armorStandID, int line, String text) {
        ArmorStand_Manager.holograms.get(armorStandID).get(line).getBukkitEntity().setCustomName(text);
    }

}
