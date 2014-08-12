package com.buzzyog.hubmenu.visibility;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class VisibilityChange implements Listener{
    
    Visibility visibility = new Visibility();
    
    @EventHandler
    public void onVisibilityChange(PlayerInteractEvent e){
       Player player = e.getPlayer();
       ItemStack itemClicked = e.getItem();
       Action action = e.getAction();
       
       if(action == Action.RIGHT_CLICK_AIR | action == Action.RIGHT_CLICK_BLOCK | action == Action.LEFT_CLICK_AIR || action == Action.LEFT_CLICK_BLOCK){
           
           if(itemClicked.getTypeId() == 76){
               e.setCancelled(true);
               
           }
       }

    }
    
    public void visibilityChange(Player player){
            for(Player p : Bukkit.getOnlinePlayers()){
                player.hidePlayer(p);
                player.sendMessage("§cAll players have disappeared! Enjoy being lag free... §ofor a while.");
            } 
        }


}
