package de.traxonlp.zap3.listeners;

import org.bukkit.event.Listener;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {

        Player p = event.getPlayer();

        if(!p.isOp()) {
            event.setFormat(ChatColor.DARK_AQUA + "%1$s" + ChatColor.DARK_GRAY + ": " );
        } else if(p.isOp()) {
            event.setFormat(ChatColor.GREEN + "%1$s" + ChatColor.WHITE + ": ");
        }


        event.setMessage((p.isOp() ? ChatColor.translateAlternateColorCodes( '&', event.getMessage()) : event.getMessage()));
    }


}