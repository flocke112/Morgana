package de.morgana.morgana.Welcome;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Welcome implements Listener {
    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent event){
        if(event.getPlayer().hasPermission("joint.slilent"))
            event.setJoinMessage("");
        event.getPlayer().sendMessage(ChatColor.AQUA + "Welcome " + event.getPlayer().getName() + " to server");
    }
}
