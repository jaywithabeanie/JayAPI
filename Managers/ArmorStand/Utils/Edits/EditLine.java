package me.jaypeg.jayapi.Managers.ArmorStand.Utils.Edits;

import me.jaypeg.jayapi.Managers.ArmorStand.ArmorStand_Manager;

public class EditLine {

    public static void EditLine(String standID, int Line, String message) {
        ArmorStand_Manager.holograms.get(standID).get(Line).getBukkitEntity().setCustomName(message);

    }

}
