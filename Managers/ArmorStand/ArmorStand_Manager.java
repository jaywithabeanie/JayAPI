package me.jaypeg.jayapi.Managers.ArmorStand;

import me.jaypeg.jayapi.Managers.ArmorStand.Utils.StandCreate;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.StandList;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.StandRemove;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.Edits.AddLine;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.Edits.EditLine;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.Edits.GetLocation;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.Edits.RemoveLine;
import me.jaypeg.jayapi.Managers.ArmorStand.Utils.StandSetLocation;
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
        return StandList.ArmorStandList();
    }

    public static void CreateStand(Location location, Player player, String standID, String message) {
        StandCreate.ArmorStandSend(location, player, standID, message);
    }

    public static void RemoveStand(String standID) {
        StandRemove.ArmorStandRemove(standID);
    }

    public static Location getStandLocation(String standID) {
        return GetLocation.GetLocation(standID);
    }

    public static void AddStandLine(String standID, Player player, String newLine) {
        AddLine.AddLine(standID, player, newLine);
    }

    public static void EditStand(String standID, int line, String message) {
        EditLine.EditLine(standID, line, message);
    }

    public static void RemoveStandLine(String standID, int Line) {
        RemoveLine.RemoveLine(standID, Line);
    }

    public static void SetStandLocation(String standID, Location newLocation) {
        StandSetLocation.StandSetLocation(standID, newLocation);
    }

}
