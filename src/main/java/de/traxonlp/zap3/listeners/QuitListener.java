package de.traxonlp.zap3.listeners;

import de.traxonlp.zap3.Main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;


public class QuitListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player p = event.getPlayer();
        event.setQuitMessage(Main.getPrefix() + ChatColor.WHITE + p.getName() + ChatColor.GRAY + "has left the Game");


    }
}