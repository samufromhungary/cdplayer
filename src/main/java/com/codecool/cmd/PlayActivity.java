package com.codecool.cmd;

public class PlayActivity implements Activity {

    Player player;
    Audio audioCd = new Audio();

    public PlayActivity(Player player){
        this.player = player;
    }

    @Override
    public void activate() {
        player.start(audioCd.getSongs().get(0).getTitle());
    }

}
