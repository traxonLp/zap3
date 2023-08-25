package de.traxonlp.zap3;

import de.traxonlp.zap3.listeners.ChatListener;
import de.traxonlp.zap3.listeners.JoinListener;
import de.traxonlp.zap3.listeners.PlayerDeathListener;
import de.traxonlp.zap3.listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().fine("I'm gonna shock you! #Zap");

        new PlayerDeathListener(this);

        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        getServer().getPluginManager().registerEvents(new QuitListener(), this);
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().fine("Ok, I'm gonna wait for you! #Zap");
    }

    public static String getPrefix() {
        return ChatColor.WHITE + "[" + ChatColor.YELLOW + ChatColor.BOLD + "Zap" + ChatColor.WHITE + "]" + ">> ";

    }
}
