package com.buzzyog.hubmenu.credits;

import net.minecraft.util.org.apache.commons.lang3.math.NumberUtils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CreditsCommand implements CommandExecutor {
	
	@SuppressWarnings("deprecation")
	@Override
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		 if (sender instanceof Player) {
	            if (cmd.getName().equalsIgnoreCase("credits")) {
	                Player player = (Player) sender;
	                if (player.hasPermission("hub.credits.command")) {
	                    if (args.length == 0) {
	                        player.sendMessage("/credits - " + "Displays this screen");
	                        player.sendMessage("/credits add [player] [amount] - " + "Give credits");
	                        player.sendMessage("/credits set [player] [amount] - " +  "Sets specific amount of credits");
	                        player.sendMessage("/credits remove [player] [amount] - " + "Removes credits");
	                        player.sendMessage("/credits reset [player] [amount] - " + "Resets credits");
	                    } else if (args.length == 3) {
	                        if (args[0].equalsIgnoreCase("add")) {
	                            Player target = Bukkit.getPlayerExact(args[1]);
	                            if (target == null) {
	                                player.sendMessage("§4" + args[1] + " §7is offline!");
	                            } else {
	                                if (NumberUtils.isNumber(args[2])) {
	                                    int amount = Integer.parseInt(args[2]);
	                                    CreditsAPI.getManager().addCredits(target.getName(), amount);
	                                    player.sendMessage("§7You have added §2" + args[2] + "§7 credits to §2" + args[1] + "'s §7account.");
	                                } else {
	                                    player.sendMessage("§4" + args[2] + " §7is not a number!");
	                                }
	                            }
	                        }
	                    if(args[0].equalsIgnoreCase("remove")){
	                    		 Player target1 = Bukkit.getPlayerExact(args[1]);
		                            if (target1 == null) {
		                                player.sendMessage("§4" + args[1] + " §7is offline!");
		                            } else {
		                                if (NumberUtils.isNumber(args[2])) {
		                                    int amount = Integer.parseInt(args[2]);
		                                    CreditsAPI.getManager().removeCredits(target1.getName(), amount);
		                                    player.sendMessage("§7You have removed §2" + args[2] + "§7 credits from §2" + args[1] + "'s §7account.");
		                                } else {
		                                    player.sendMessage("§4" + args[2] + " §7is not a number!");
		                                }
		                            }
		                       }
	                    if(args[0].equalsIgnoreCase("set")){
	                    	Player target2 = Bukkit.getPlayerExact(args[1]);
	                    	if(NumberUtils.isNumber(args[2])){
	                    		int amount = Integer.parseInt(args[2]);
	                    		CreditsAPI.getManager().setCredits(target2.getName(), amount);
                                 player.sendMessage("§7You have set §2" + args[2] + "§7 credits to §2" + args[1] + "'s §7account.");
                             } else {
                                 player.sendMessage("§4" + args[2] + " §7is not a number!");
	                    	}
	                    }
	                    	 if(args[0].equalsIgnoreCase("reset")){
	 	                    	Player target3 = Bukkit.getPlayerExact(args[1]);
	 	                    		int amount = 0;
	 	                    		CreditsAPI.getManager().setCredits(target3.getName(), amount);
	                                  player.sendMessage("§7You have reset " + "%PLAYER%" + " credits");
	                              }
	                    }
	                }
	                else {
	                	
	                	  player.sendMessage("You do not have permission to use this command!");
	                }
	            }
		 }
		return false;
	}
}
