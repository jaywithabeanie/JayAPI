package me.jaypeg.jayapi.Managers.ArmorStand;

import me.jaypeg.jayapi.Managers.ArmorStand.Utils.createArmorStand;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.getArmorStands;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.removeArmorStand;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.addLine;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.editLine;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.getLocation;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.removeLine;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.setLocation;
import net.minecraft.server.v1_8_R3.EntityArmorStand;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArmorStand_Manager {

    public static Map<String, List<EntityArmorStand>> holograms = new HashMap<>();

    public static Set<String> getArmorStands() {
        return getArmorStands.getArmorStands();
    }

    public static void createArmorStand(Location location, Player player, String armorStandID, String text) {
        createArmorStand.createArmorStand(location, player, armorStandID, text);
    }

    public static void removeArmorStand(String armorStandID) {
        removeArmorStand.removeArmorStand(armorStandID);
    }

    public static Location getLocation(String armorStandID) {
        return getLocation.getLocation(armorStandID);
    }

    public static void addLine(String armorStandID, Player player, String text) {
        addLine.addLine(armorStandID, player, text);
    }

    public static void editLine(String armorStandID, int line, String message) {
        editLine.editLine(armorStandID, line, message);
    }

    public static void removeLine(String armorStandID, int line) {
        removeLine.removeLine(armorStandID, line);
    }

    public static void setLocation(String armorStandID, Location location) {
        setLocation.setLocation(armorStandID, location);
    }

}
