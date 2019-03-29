package com.codecool.cmd;

import java.util.List;

public class NextActivity implements Activity {

    private List<Song> songs;
    private Player player;

    public NextActivity(List<Song> songs, Player player) {
        this.player = player;
    }


    @Override
    public void activate() { // kiirjuk az átállított current song title-jét
        player.next();
    }
}
