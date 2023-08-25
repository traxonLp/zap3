package de.traxonlp.zap3.scoreboard;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TestScoreboard extends ScoreboardBuilder{
    public TestScoreboard(Player player) {
        super(player, ChatColor.DARK_PURPLE + " twitch.tv/traxon_lp  ");
    }

    @Override
    public void createScoreboard() {
        setScore("bigcock", 7);
        setScore(ChatColor.GRAY + "Dein Rang: ", 6);

        if(player.isOp()) {
            setScore(ChatColor.RED + "Operator", 5);
        } else {
            setScore(ChatColor.GRAY + "Spieler", 5);
        }
        setScore("bigcock", 4);
        setScore(ChatColor.YELLOW + "SEMEN", 3);
        setScore(player.getAddress().getHostName(), 2);
        setScore("bigcock", 1);
        setScore("bigcock", 0);
    }

    @Override
    public void update() {

    }
}