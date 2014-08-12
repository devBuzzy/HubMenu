package com.buzzyog.hubmenu.pets;

/*
 * Script Forked From GitHub
 *  Creater: janie177/GearUp
 */

import net.minecraft.server.v1_7_R3.Material;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.buzzyog.hubmenu.Prefixes;

public class PetShopSettings {

    private EntityDamageEvent entityDamageEvent;
    private EntityDamageByEntityEvent entityDamageByEntityEvent;
    private EntityDamageByBlockEvent entityDamageByBlockEvent;
    private Entity entity;
    private Villager villager;
    private String name;
    private LivingEntity Villager;
    private PlayerInteractEntityEvent e;
    
    public void ShopInv(PlayerInteractEntityEvent e) {
        this.e = e;

    }

    public PetShopSettings(EntityDamageByBlockEvent e)
    {
        this.entityDamageByBlockEvent = e;
        entity = e.getEntity();

    }

    public PetShopSettings(EntityDamageByEntityEvent e)
    {
        this.entityDamageByEntityEvent = e;
        entity = e.getEntity();

    }

    public PetShopSettings(EntityDamageEvent e)
    {
        this.entityDamageEvent = e;
        entity = e.getEntity();

    }

    public boolean isVillager()
    {
        if(entity instanceof Villager)
        {
            villager = (Villager) entity;
            return true;
        }
        return false;
    }

    public boolean isPetShopOwner()
    {
        return villager.getCustomName() != null && villager.getCustomName().toUpperCase().contains("Pet Shop");
    }

    public void cancel()
    {
        if(entityDamageEvent != null) entityDamageEvent.setCancelled(true);
        if(entityDamageByEntityEvent != null) entityDamageByEntityEvent.setCancelled(true);
        if(entityDamageByBlockEvent != null) entityDamageByBlockEvent.setCancelled(true);
    }
    
    public boolean isLivingEntity() {
        if (e.getRightClicked() instanceof LivingEntity && e.getRightClicked() instanceof Villager) {
            Villager = (LivingEntity) e.getRightClicked();
            name = Villager.getCustomName();
            return true;
        }
        return false;
    }

    public void openShop()
    {
        if (name != null)
        {
            Player p = e.getPlayer();

            if (name.contains("Pet Shop"))
            {
                if (!e.getPlayer().getItemInHand().getType().equals(Material.AIR))
                {
                    e.setCancelled(true);
                    e.getPlayer().sendMessage(ChatColor.RED + "You can only trade with an empty hand!");
                }
                else
                {
                    p.sendMessage(ChatColor.GRAY + " You have " + ChatColor.LIGHT_PURPLE + Prefixes.yourcredits + ChatColor.GRAY + " credits.");
                    e.setCancelled(true);
                    //gui here


                }
            }
        }
    }

}
