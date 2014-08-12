package com.buzzyog.hubmenu.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.buzzyog.hubmenu.credits.CreditsAPI;
import com.vexsoftware.votifier.model.Vote;
import com.vexsoftware.votifier.model.VotifierEvent;

public class VoteEvent extends JavaPlugin implements Listener {
	
	  @EventHandler
	    public void onPlayerVote(VotifierEvent e) {
	            Vote v = e.getVote();
	            Bukkit.getServer().broadcastMessage(ChatColor.GREEN + v.getUsername() + " voted on " + v.getServiceName() + "! For Insert Amount of Tokens Here");
	           
	            Player p = Bukkit.getServer().getPlayer(v.getUsername());
	            if (p == null) {
	                    return;
	            }
	            CreditsAPI.getManager().addCredits(p.getName(), 10);
	            saveConfig();
	    }
}