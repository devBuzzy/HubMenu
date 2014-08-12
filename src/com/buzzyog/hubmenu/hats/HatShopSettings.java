package com.buzzyog.hubmenu.hats;

/*
 * Script Forked From GitHub
 *  Creater: janie177/GearUp
 */

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
import com.buzzyog.hubmenu.credits.CreditsAPI;

public class HatShopSettings {

    private EntityDamageEvent entityDamageEvent;
    private EntityDamageByEntityEvent entityDamageByEntityEvent;
    private EntityDamageByBlockEvent entityDamageByBlockEvent;
    private Entity entity;
    private Villager hatvillager;
    private String name;
    private LivingEntity HatVillager;
    private PlayerInteractEntityEvent e;
    
    public void ShopInv(PlayerInteractEntityEvent e) {
        this.e = e;

    }

    public HatShopSettings(EntityDamageByBlockEvent e)
    {
        this.entityDamageByBlockEvent = e;
        entity = e.getEntity();

    }

    public HatShopSettings(EntityDamageByEntityEvent e)
    {
        this.entityDamageByEntityEvent = e;
        entity = e.getEntity();

    }

    public HatShopSettings(EntityDamageEvent e)
    {
        this.entityDamageEvent = e;
        entity = e.getEntity();

    }

    public boolean isVillager()
    {
        if(entity instanceof Villager)
        {
            hatvillager = (Villager) entity;
            return true;
        }
        return false;
    }

    public boolean isPetShopOwner()
    {
        return hatvillager.getCustomName() != null && hatvillager.getCustomName().toUpperCase().contains("Pet Shop");
    }

    public void cancel()
    {
        if(entityDamageEvent != null) entityDamageEvent.setCancelled(true);
        if(entityDamageByEntityEvent != null) entityDamageByEntityEvent.setCancelled(true);
        if(entityDamageByBlockEvent != null) entityDamageByBlockEvent.setCancelled(true);
    }
    
    public boolean isLivingEntity() {
        if (e.getRightClicked() instanceof LivingEntity && e.getRightClicked() instanceof Villager) {
            HatVillager = (LivingEntity) e.getRightClicked();
            name = HatVillager.getCustomName();
            return true;
        }
        return false;
    }

    public void openShop()
    {
        if (name != null)
        {
            Player p = e.getPlayer();

            if (name.contains("§2§lHat Shop"))
            {
                    p.sendMessage(ChatColor.GRAY + " You have " + ChatColor.LIGHT_PURPLE + Prefixes.yourcredits + ChatColor.GRAY + " credits.");
                    e.setCancelled(true);
                    //gui menu


                }
            }
        }
}
