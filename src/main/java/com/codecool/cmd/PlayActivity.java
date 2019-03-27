package com.codecool.cmd;

public class PlayActivity implements Activity {

    Player player;

    public PlayActivity(Player player){
        this.player = player;
    }

    @Override
    public void activate() {
        player.start();

    }
}
