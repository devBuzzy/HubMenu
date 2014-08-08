package com.buzzyog.gsquad.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.buzzyog.gsquad.files.Config;

public class CreditCommand implements CommandExecutor{


    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args)
    {

        //Check how many credits you have.
        if(cmd.getName().equalsIgnoreCase("credits") && s instanceof Player)
        {
            Config config = new Config();
            Player p = (Player) s;
            p.sendMessage(ChatColor.GOLD + "[MG] " + ChatColor.YELLOW + "You have " + ChatColor.AQUA + config.getCredits(p.getUniqueId()) + ChatColor.YELLOW + " Credits.");
            return true;
        }

        //Command to give credits from console.
        if(cmd.getName().equalsIgnoreCase("addcredits") && s.isOp() && args.length > 1)
        {
            try
            {
                Player p = Bukkit.getOfflinePlayer(args[0]).getPlayer();
                int amount = Integer.parseInt(args[1]);

                Config config = new Config();
                config.addCredits(p.getUniqueId(), amount);

            } catch (Exception ignored)
            {

            }
        }
        return true;
    }
}