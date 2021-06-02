package me.jaypeg.jayapi.Managers.ArmorStand.Utils.Edits;

import me.jaypeg.jayapi.Managers.ArmorStand.ArmorStand_Manager;

public class RemoveLine {

    public static void RemoveLine(String standID, int line) {
        ArmorStand_Manager.holograms.get(standID).remove(line);
    }

}
