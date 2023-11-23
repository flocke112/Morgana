package de.morgana.morgana.commands;

import de.morgana.morgana.Morgana;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class Info implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof ConsoleCommandSender){
            sender.sendMessage("hallo Console wie schon gesagt du bis console");
            return true;
        }

        if (sender.hasPermission("info")){
            sender.sendMessage(ChatColor.BLUE + "Wilkommen auf dem server GamingSurvival.eu wir haben auch ein dc server" + ChatColor.AQUA+" " + Morgana.config.getString("Discord.url"));
            return true;
        }

        sender.sendMessage(ChatColor.RED+"Sie sind nicht befugt dafür");
        return true;
    }
}
