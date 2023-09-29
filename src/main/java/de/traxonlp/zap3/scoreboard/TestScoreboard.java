package de.traxonlp.zap3.scoreboard;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TestScoreboard extends ScoreboardBuilder{
    public TestScoreboard(Player player) {
        super(player, ChatColor.DARK_PURPLE + " twitch.tv/traxon_lp  ");
    }

    @Override
    public void createScoreboard() {
        setScore("test1", 7);
        setScore(ChatColor.GRAY + "Dein Rang: ", 6);

        if(player.isOp()) {
            setScore(ChatColor.RED + "Operator", 5);
        } else {
            setScore(ChatColor.GRAY + "Spieler", 5);
        }
        setScore("test2", 4);
        setScore(ChatColor.YELLOW + "Text", 3);
        setScore(player.getAddress().getHostName(), 2);
        setScore("test3", 1);
        setScore("test4", 0);
    }

    @Override
    public void update() {

    }
}