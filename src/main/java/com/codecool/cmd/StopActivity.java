package com.codecool.cmd;

public class StopActivity implements Activity {

    private Player player;

    public StopActivity(Player player) {
        this.player = player;
    }

    @Override
    public void activate() {
        player.stop();
    }
}
