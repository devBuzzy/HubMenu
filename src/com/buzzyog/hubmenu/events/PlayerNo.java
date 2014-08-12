package com.buzzyog.hubmenu.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerNo implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.MONITOR)
	public void onMove(InventoryClickEvent event) {
		Player p = (Player) event.getWhoClicked();
		if (!p.hasPermission("hub.admin")) {
			if (event.getInventory().getHolder() == p) {
				event.setCancelled(true);
				event.setCursor(new ItemStack(Material.AIR));
				event.getWhoClicked().closeInventory();
			}
		}
	}
	
	@EventHandler
	public void onDrop(PlayerDropItemEvent event){
		Player p = event.getPlayer();
		if(!p.hasPermission("hub.admin")){
			event.setCancelled(true);
		}
	}

	@EventHandler
	public void onPickUp(PlayerPickupItemEvent event){
		Player p = event.getPlayer();
		if(!p.hasPermission("hub.admin")){
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onMobSpawn(CreatureSpawnEvent e){
		if(e.getSpawnReason() == SpawnReason.CUSTOM)
			return;
		
		e.setCancelled(true);
	}
	
	@EventHandler
	public void onFoodChange(FoodLevelChangeEvent e){
		e.setFoodLevel(20);
		e.setCancelled(true);
	}
	
}