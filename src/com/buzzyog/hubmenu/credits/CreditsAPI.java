package com.buzzyog.hubmenu.credits;

import java.util.HashMap;

import org.bukkit.scheduler.BukkitRunnable;

import com.buzzyog.hubmenu.Main;

public class CreditsAPI {
	
	private static CreditsAPI Credits = new CreditsAPI();
	
	
	public static CreditsAPI getManager(){
		return Credits;
	}
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	 
	 
	 public int getCredits(String name){
		if (map.containsKey(name)) {
            return map.get(name);
        } else {
            return 0;
        }
		
	 }
	 
	 public void addCredits(String name, int amount_to_add) {
	        if (map.containsKey(name)) {
	            map.put(name, map.get(name) + amount_to_add);
	            Main.getPlugin().getConfig().set(name, getCredits(name));
	        } else {
	            map.put(name, amount_to_add);
	            Main.getPlugin().getConfig().set(name, getCredits(name));
	        }
	      
	 }
	 
	 public void setCredits(String name, int amount) {
		 map.put(name,  amount);
		 Main.getPlugin().getConfig().set(name, getCredits(name));
		 
	} 
	 
	 public boolean hasCredits(String name) {
        return map.containsKey(name);
    }

    public void removeCredits(String name, int cost) {
        map.put(name, getCredits(name) - cost);
        Main.getPlugin().getConfig().set(name, getCredits(name));
        
    }
    
	 
	public void loadConfig() {
		for(String keys : Main.getPlugin().getConfig().getKeys(false)){
            int amount = Main.getPlugin().getConfig().getInt(keys);
            map.put(keys, amount);
        }
		System.out.print("[Main] Loaded Credits Configuration File!");
	
	}

    public void startSaveTask(){
        new BukkitRunnable(){
            public void run(){
            	Main.getPlugin().saveConfig();
            }
        }.runTaskTimer(Main.getPlugin(), 20*5, 20);
    }
	



	

}