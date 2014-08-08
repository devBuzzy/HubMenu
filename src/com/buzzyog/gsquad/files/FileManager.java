package com.buzzyog.gsquad.files;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import com.buzzyog.gsquad.hub.Main;

public class FileManager {

    private static Plugin plugin = Main.PLUGIN;

    public static FileConfiguration getConfig()
    {
        return plugin.getConfig();

    }

    public static void loadConfig()
    {
        plugin.saveDefaultConfig();
    }

    public static void saveConfig()
    {
        plugin.saveConfig();
    }

}
