package me.jayy.jayapi.Managers.Bossbar.Assists;

import net.minecraft.server.v1_8_R3.*;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;


/** @ClassType Assists Class */
/** @ClassInfo Assists with the creation and removal of Boss Bars */

public class Bar {

    private final Player player;
    private final String message;
    private EntityWither wither;

    public Bar(Player player, String message) {
        this.player = player;
        this.message = message;
        update();
    }

    public void update() {
        Vector vector = player.getLocation().getDirection();
        Location location = player.getLocation().add(vector.multiply(20));
        removeWither();
        WorldServer world = ((CraftWorld)location.getWorld()).getHandle();
        wither = new EntityWither(world);
        wither.setLocation(location.getX(), player.getLocation().getY(), location.getZ(), location.getPitch(), location.getYaw());
        wither.setCustomName(this.message);
        wither.setInvisible(true);
        PacketPlayOutSpawnEntityLiving packet = new PacketPlayOutSpawnEntityLiving(wither);
        (((CraftPlayer)player).getHandle()).playerConnection.sendPacket(packet);
    }

    private void removeWither() {
        if (wither != null) {
            PacketPlayOutEntityDestroy packet = new PacketPlayOutEntityDestroy(wither.getId());
            (((CraftPlayer)player).getHandle()).playerConnection.sendPacket(packet);
        }
    }

    public void end() {
        removeWither();
    }

}
