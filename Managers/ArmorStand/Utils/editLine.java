package me.jaypeg.jayapi.Managers.ArmorStand.Utils;

import me.jaypeg.jayapi.Managers.ArmorStand.ArmorStand_Manager;

public class editLine {

    public static void editLine(String armorStandID, int line, String text) {
        ArmorStand_Manager.holograms.get(armorStandID).get(line).getBukkitEntity().setCustomName(text);
    }

}
