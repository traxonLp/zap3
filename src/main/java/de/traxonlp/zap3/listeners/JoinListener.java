package de.traxonlp.zap3.listeners;

import de.traxonlp.zap3.Main;
import de.traxonlp.zap3.scoreboard.TestScoreboard;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();

        event.setJoinMessage(Main.getPrefix() + ChatColor.WHITE + p.getName() + ChatColor.GRAY + "has joined the game");

        new TestScoreboard(p);
    }
}

