package com.buzzyog.gsquad.hub;

 //§

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.buzzyog.gsquad.commands.CreditCommand;
import com.buzzyog.gsquad.commands.NCPSpawnCommand;
import com.buzzyog.gsquad.files.FileManager;

public class Main extends JavaPlugin implements Listener {

	Plugin pl;
	public static Plugin PLUGIN;
	
        @Override
        public void onEnable() {
        	this.pl = this;
            Bukkit.getPluginManager().registerEvents(this, this);
            
            getCommand("credits").setExecutor(new CreditCommand());
            getCommand("addcredits").setExecutor(new CreditCommand());
            getCommand("ncp").setExecutor(new NCPSpawnCommand());
 
        }
        
        @Override
        public void onDisable() {
        	
           FileManager.saveConfig();
           
        }
    }