package com.buzzyog.hubmenu.visibility;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Visibility implements Listener{
    
     ArrayList<String> players = new ArrayList<String>();

    public static ItemStack enable = new ItemStack(Material.REDSTONE_TORCH_ON, 1);
    public static ItemStack disable = new ItemStack(Material.REDSTONE_TORCH_OFF, 1);
    
    @EventHandler
    public void onPlayerClickEvent(PlayerInteractEvent event) {
 
        Player player = event.getPlayer();
 
        
        ItemMeta enableMeta = (ItemMeta) enable.getItemMeta();
        enableMeta.setDisplayName("§bPlayer Toggle §8\u00bb §aOn");
        List<String> enableList = new ArrayList<String>();
        enableList.add("&7Lag? Toggle players on & off!");
        enableMeta.setLore(enableList);
        enable.setItemMeta(enableMeta);
 
        ItemMeta disableMeta = (ItemMeta) disable.getItemMeta();
        disableMeta.setDisplayName("§bPlayer Toggle §8\u00bb §cOff");
        List<String> disableList = new ArrayList<String>();
        disableList.add("&7Lag? Toggle players on & off!");
        disableMeta.setLore(disableList);
        disable.setItemMeta(disableMeta);
 
        if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§bPlayer Toggle §8\u00bb §aOn")){
            if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)){
                if(!this.players.contains(event.getPlayer().getName())){
                    for(Player targetPlayers : Bukkit.getOnlinePlayers()){
                        if(player.canSee(targetPlayers)){
                            player.hidePlayer(targetPlayers);
                        } else{
                            event.setCancelled(true);                       
                        }
                        this.players.add(event.getPlayer().getName());
                    }
                    player.getInventory().removeItem(enable);
                    player.setItemInHand(disable);
                    player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "Visibility" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_GRAY + "You have toggled player visibility: " + ChatColor.GREEN + "On");
                }
            }
        }
        if(player.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§bPlayer Toggle §8\u00bb §cOff")){
            if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK) || event.getAction().equals(Action.RIGHT_CLICK_AIR)){
                for(Player targetPlayers : Bukkit.getOnlinePlayers()){
                    if(player.canSee(targetPlayers)){
                        event.setCancelled(true);
                    } else {
                        player.showPlayer(targetPlayers);
                    }
                    this.players.remove(event.getPlayer().getName());
                }
                player.getInventory().removeItem(disable);
                player.setItemInHand(enable);
                player.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "Visibility" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_GRAY + "You have toggled player visibility: " + ChatColor.RED + "Off");
            }
        }
    }
}