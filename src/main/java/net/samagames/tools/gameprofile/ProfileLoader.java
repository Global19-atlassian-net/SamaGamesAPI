package net.samagames.tools.gameprofile;

/**
 * ╱╲＿＿＿＿＿＿╱╲
 * ▏╭━━╮╭━━╮▕
 * ▏┃＿＿┃┃＿＿┃▕
 * ▏┃＿▉┃┃▉＿┃▕
 * ▏╰━━╯╰━━╯▕
 * ╲╰╰╯╲╱╰╯╯╱  Created by Silvanosky on 21/04/2016
 * ╱╰╯╰╯╰╯╰╯╲
 * ▏▕╰╯╰╯╰╯▏▕
 * ▏▕╯╰╯╰╯╰▏▕
 * ╲╱╲╯╰╯╰╱╲╱
 * ＿＿╱▕▔▔▏╲＿＿
 * ＿＿▔▔＿＿▔▔＿＿
 */

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.minecraft.server.v1_9_R2.MinecraftServer;
import net.samagames.api.SamaGamesAPI;
import net.samagames.tools.Reflection;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.logging.Level;

public class ProfileLoader {
    private final String uuid;
    private final String name;
    private final String skinOwner;

    public ProfileLoader(String uuid, String name) {
        this(uuid, name, name);
    }

    public ProfileLoader(String uuid, String name, String skinOwner) {
        this.uuid = uuid == null ? null : uuid.replaceAll("-", ""); //We add these later
        String displayName = ChatColor.translateAlternateColorCodes('&', name);
        this.name = ChatColor.stripColor(displayName);
        this.skinOwner = getUUID(skinOwner);
    }

    public ProfileLoader(String uuid, String name, UUID skinOwner) {
        this.uuid = uuid == null ? null : uuid.replaceAll("-", ""); //We add these later
        String displayName = ChatColor.translateAlternateColorCodes('&', name);
        this.name = ChatColor.stripColor(displayName);
        this.skinOwner = skinOwner.toString().replaceAll("-", "");
    }

    /**
     Need to be called async
     */
    public GameProfile loadProfile() {
        UUID id = uuid == null ? parseUUID(getUUID(name)) : parseUUID(uuid);
        GameProfile profile = MinecraftServer.getServer().ay().fillProfileProperties(new GameProfile(id, null), false);
        GameProfile skinProfile = MinecraftServer.getServer().ay().fillProfileProperties(new GameProfile(id, null), true);
        if (skinProfile.getProperties().containsKey("textures"))
        {
            List<Property> properties = new ArrayList<>(profile.getProperties().get("textures"));
            profile.getProperties().removeAll("textures");
            Property property = skinProfile.getProperties().get("textures").iterator().next();
            properties.forEach(property2 ->
            {
                try {
                    Reflection.setValue(property, "signature", property2.getSignature());
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
            profile.getProperties().put("textures", property);
        }
        //addProperties(profile);
        return profile;
    }

    private String getData(String uuid) throws IOException {
        // Get the name from SwordPVP
        URL url = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid + "?unsigned=true");
        URLConnection uc = url.openConnection();
        uc.setUseCaches(false);
        uc.setDefaultUseCaches(false);
        uc.addRequestProperty("User-Agent", "Mozilla/5.0");
        uc.addRequestProperty("Cache-Control", "no-cache, no-store, must-revalidate");
        uc.addRequestProperty("Pragma", "no-cache");

        // Parse it
        return new Scanner(uc.getInputStream(), "UTF-8").useDelimiter("\\A").next();
    }

    private void addProperties(GameProfile profile) {
        String uuid = this.skinOwner;
        Jedis jedis = SamaGamesAPI.get().getBungeeResource();
        try {

            String json = jedis == null ? null : jedis.get("cacheSkin:" + uuid);
            if (json == null)
            {
                //Requete
                json = getData(uuid);
                if (jedis != null)
                {
                    jedis.set("cacheSkin:" + uuid, json);
                    jedis.expire("cacheSkin:" + uuid, 172800);//2 jours
                }
            }
            Bukkit.getLogger().info(json);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(json);
            JSONArray properties = (JSONArray) ((JSONObject) obj).get("properties");
            for (int i = 0; i < properties.size(); i++) {
                try {
                    JSONObject property = (JSONObject) properties.get(i);
                    String name = (String) property.get("name");
                    String value = (String) property.get("value");
                    String signature = property.containsKey("signature") ? (String) property.get("signature") : null;
                    if (signature != null) {
                        profile.getProperties().put(name, new Property(name, value, signature));
                    } else {
                        profile.getProperties().put(name, new Property(name, value));
                    }
                } catch (Exception e) {
                    Bukkit.getLogger().log(Level.WARNING, "Failed to apply auth property", e);
                }
            }
        } catch (Exception e) {
            Bukkit.getLogger().log(Level.SEVERE, "Can't load skin for uuid" + uuid, e);
        }finally {
            if (jedis != null)
                jedis.close();
        }
    }

    @SuppressWarnings("deprecation")
    private String getUUID(String name) {
        return Bukkit.getOfflinePlayer(name).getUniqueId().toString().replaceAll("-", "");
    }

    private UUID parseUUID(String uuidStr) {
        // Split uuid in to 5 components
        String[] uuidComponents = new String[] { uuidStr.substring(0, 8),
                uuidStr.substring(8, 12), uuidStr.substring(12, 16),
                uuidStr.substring(16, 20),
                uuidStr.substring(20, uuidStr.length())
        };

        // Combine components with a dash
        StringBuilder builder = new StringBuilder();
        for (String component : uuidComponents) {
            builder.append(component).append('-');
        }

        // Correct uuid length, remove last dash
        builder.setLength(builder.length() - 1);
        return UUID.fromString(builder.toString());
    }
}