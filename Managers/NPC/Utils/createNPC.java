package me.jaypeg.jayapi.Managers.NPC.Utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import me.jaypeg.jayapi.JayAPI;
import me.jaypeg.jayapi.Managers.NPC.NPC_Manager;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import net.minecraft.server.v1_8_R3.MinecraftServer;
import net.minecraft.server.v1_8_R3.PlayerInteractManager;
import net.minecraft.server.v1_8_R3.WorldServer;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;


/** @ClassType Util Class */
/** @ClassInfo Creates an NPC with given data */

public class createNPC {


    /** ------------------------------------------------------------------------------------------------------------- */
    /** @UtilType       Void Util                                                                                     */
    /** @UtilInfo       Creates an NPC with given data                                                                */
    /** @ParameterInfo  • location: Location of the NPC                                                               */
    /**                 • skinPlayer: OfflinePlayer whose skin is used for the NPC                                    */
    /**                 • name: Name of the NPC                                                                       */
    /**                 • linkedPlayer: Player who the NPC is linked to                                               */
    /** ------------------------------------------------------------------------------------------------------------- */
    /**                                                                                                               */
    public static void createNPC(Location location, OfflinePlayer skinPlayer, String name) {

        // Initiate Variables
        World world = location.getWorld();
        MinecraftServer minecraftServer = ((CraftServer) Bukkit.getServer()).getServer();
        WorldServer worldServer = ((CraftWorld) Bukkit.getWorld(world.getName())).getHandle();
        GameProfile gameprofile = new GameProfile(UUID.randomUUID(), name);

        // Create NPC
        EntityPlayer npc = new EntityPlayer(minecraftServer, worldServer, gameprofile, new PlayerInteractManager(worldServer));
        npc.setLocation(location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());

        // Change NPC Skin
        {
            final String NPCName = skinPlayer.getName();

            new BukkitRunnable() {
                public void run () {

                    String[] skinName;

                    try {
                        URL url = new URL("https://api.mojang.com/users/profiles/minecraft/" + NPCName);
                        InputStreamReader reader = new InputStreamReader(url.openStream());
                        String uuid = new JsonParser().parse(reader).getAsJsonObject().get("id").getAsString();

                        URL url2 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid + "?unsigned=false");
                        InputStreamReader reader2 = new InputStreamReader(url2.openStream());
                        JsonObject property = new JsonParser().parse(reader2).getAsJsonObject().get("properties").getAsJsonArray().get(0).getAsJsonObject();
                        String texture = property.get("value").getAsString();
                        String signature = property.get("signature").getAsString();
                        skinName = new String[] {texture, signature};

                    } catch (Exception e) {
                        EntityPlayer p = ((CraftPlayer) skinPlayer).getHandle();
                        GameProfile profile = p.getProfile();
                        Property property = profile.getProperties().get("texture").iterator().next();
                        String texture = property.getValue();
                        String signature = property.getSignature();
                        skinName =  new String[] {texture, signature};
                    }

                    gameprofile.getProperties().put("textures", new Property("textures", skinName[0], skinName[1]));

                }
            }.runTaskLater(JayAPI.getInstance(), 1L);
        }

        // Save NPC
        NPC_Manager.NPCs.put(npc, location);

    }
    /**                                                                                                               */
    public static void createNPC(Location location, OfflinePlayer skinPlayer, String name, Player linkedPlayer) {

        // Initiate Variables
        World world = location.getWorld();
        MinecraftServer minecraftServer = ((CraftServer) Bukkit.getServer()).getServer();
        WorldServer worldServer = ((CraftWorld) Bukkit.getWorld(world.getName())).getHandle();
        GameProfile gameprofile = new GameProfile(UUID.randomUUID(), name);

        // Create NPC
        EntityPlayer npc = new EntityPlayer(minecraftServer, worldServer, gameprofile, new PlayerInteractManager(worldServer));
        npc.setLocation(location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());

        // Change NPC Skin
        {
            final String NPCName = skinPlayer.getName();

            new BukkitRunnable() {
                public void run () {

                    String[] skinName;

                    try {
                        URL url = new URL("https://api.mojang.com/users/profiles/minecraft/" + NPCName);
                        InputStreamReader reader = new InputStreamReader(url.openStream());
                        String uuid = new JsonParser().parse(reader).getAsJsonObject().get("id").getAsString();

                        URL url2 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid + "?unsigned=false");
                        InputStreamReader reader2 = new InputStreamReader(url2.openStream());
                        JsonObject property = new JsonParser().parse(reader2).getAsJsonObject().get("properties").getAsJsonArray().get(0).getAsJsonObject();
                        String texture = property.get("value").getAsString();
                        String signature = property.get("signature").getAsString();
                        skinName = new String[] {texture, signature};

                    } catch (Exception e) {
                        EntityPlayer p = ((CraftPlayer) skinPlayer).getHandle();
                        GameProfile profile = p.getProfile();
                        Property property = profile.getProperties().get("texture").iterator().next();
                        String texture = property.getValue();
                        String signature = property.getSignature();
                        skinName =  new String[] {texture, signature};
                    }

                    gameprofile.getProperties().put("textures", new Property("textures", skinName[0], skinName[1]));

                }
            }.runTaskLater(JayAPI.getInstance(), 1L);
        }

        // Save NPC
        NPC_Manager.NPCs.put(npc, location);
        {
            Set<EntityPlayer> npcList = NPC_Manager.getNPCs(linkedPlayer);
            if (npcList == null) npcList = Collections.emptySet();

            npcList.add(npc);

            NPC_Manager.linkedNPCs.put(linkedPlayer, npcList);
        }

    }
    /**                                                                                                               */
    /** ------------------------------------------------------------------------------------------------------------- */


}
