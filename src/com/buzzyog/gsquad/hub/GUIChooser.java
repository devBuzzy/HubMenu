package com.buzzyog.gsquad.hub;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIChooser {
    
    public static ItemStack petShop = new ItemStack(Material.BONE, 1);
   //public static ItemStack hatShop = new ItemStack(Material.LEATHER_HELMET, 1);
   // public static ItemStack trailShop = new ItemStack(Material.ENDER_PEARL, 1);  
  //  public static ItemStack perkShop = new ItemStack(Material.NETHER_STAR, 1); 
   
    public static List<String> petShopLore = new ArrayList<String>();
    
    public static void openPetGUI(Player player){
        Inventory inv = Bukkit.createInventory(null, 18, "§4Pet Menu");
        
        ItemMeta petShopMeta = petShop.getItemMeta();
        petShopMeta.setDisplayName("§4§lPet Shop");
        petShopMeta.setLore(petShopLore);
        petShop.setItemMeta(petShopMeta);
        
        inv.setItem(1, petShop);
        
        player.openInventory(inv);
    }
}
