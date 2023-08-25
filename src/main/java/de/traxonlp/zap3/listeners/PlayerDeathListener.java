package de.traxonlp.zap3.listeners;

import de.traxonlp.zap3.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

    private static Main plugin;

    public PlayerDeathListener(Main plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);

    }
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {

        if(event.getEntity().getKiller() instanceof Player) {

            Player killer = event.getEntity().getKiller();
            Player p = event.getEntity();

            killer.playSound(killer.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 0);
            killer.sendMessage(Main.getPrefix() + ChatColor.GRAY + "You killed " + ChatColor.BOLD + ChatColor.DARK_AQUA + p.getDisplayName());
            p.sendMessage(Main.getPrefix() + ChatColor.GRAY + "You were killed by  " + ChatColor.BOLD + ChatColor.DARK_AQUA + killer.getDisplayName());
            p.playSound(p.getLocation(), Sound.ENTITY_SILVERFISH_DEATH, 1, 0);
            p.getWorld().strikeLightningEffect(p.getLocation());
            return;
        }

    }
}
