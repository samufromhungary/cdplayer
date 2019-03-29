package com.codecool.cmd;

public class PreviousActivity implements Activity {

    private Player player;

    public PreviousActivity(Player player) {
        this.player = player;
    }

    @Override
    public void activate() {

        player.prev();
    }
}
