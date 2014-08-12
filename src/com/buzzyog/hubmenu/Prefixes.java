package com.buzzyog.hubmenu;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.buzzyog.hubmenu.credits.CreditsAPI;

public class Prefixes {
	
	private static PlayerInteractEntityEvent e;
	
	static Player p = e.getPlayer();
	
	//ChatPrefixes
	public static String CREDITS = "§6Credits §9> ";
	public static String PETS = "§4Pets §9> ";
	public static String HATS = "§2Hats §9> ";
	public static String TRAILS = "§5Trails §9> ";
	public static String PERKS = "§dPerks §9> ";
	public static String HUB = "§aHub §9> ";
	public static String COOLDOWN = "§cWait 2 Seconds Before Performing that action again.";
	public static String VOTEING = "§1Voteing §9> ";
	public static String ERROR = "§cAn Error Has Happened?!? Contact Adminstration Please :)";
	public static String NOPERMS = "§4You have no permissions.";
	
	//CreditPrefixes
	public static int yourcredits  = CreditsAPI.getManager().getCredits(p.getName());
	
	public static String Vars(String s, Player p){
		String r = s;

		r = r.replace("%PLAYER%", p.getName());
		r = r.replace("%PLAYERNICK%", p.getDisplayName());
		
		return r;

	}

}
