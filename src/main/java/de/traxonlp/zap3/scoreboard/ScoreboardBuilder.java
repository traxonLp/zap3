package de.traxonlp.zap3.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public abstract class ScoreboardBuilder {

    protected final Scoreboard scorebloard;
    protected Objective objective ;

    protected final Player player;

    public ScoreboardBuilder(Player player, String displayName) {
        this.player = player;

        if(player.getScoreboard().equals(Bukkit.getScoreboardManager().getMainScoreboard())) {
            player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
        }
        this.scorebloard = player.getScoreboard();

        if(this.scorebloard.getObjective("display") !=null) {
            this.scorebloard.getObjective("display").unregister();
        }
        this.objective = this.scorebloard.registerNewObjective("display","dummy", displayName);
        this.objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        createScoreboard();
    }

    public abstract void createScoreboard();

    public abstract void update();

    public void setDisplayName(String displayName) {
        this.objective.setDisplayName(displayName);
    }
    public void setScore(String content, int score) {
        this.objective.getScore(content).setScore(score);
    }
    public void removeScore(String content) {
        this.scorebloard.resetScores(content);
    }
}
