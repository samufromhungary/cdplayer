package com.codecool.cmd;

import java.util.List;

public class NextActivity implements Activity {

    private List<Song> songs;
    private Player player;

    public NextActivity(List<Song> songs, Player player) {
        this.player = player;
    }

    private int getIndexOfCurrent(Song currentSong) {
        int currentIndex = 0;
        for(Song song : songs) {
            if(song.getTitle().equals(currentSong.getTitle())) {
                currentIndex = songs.indexOf(song);
            }
        }
        return currentIndex;
    }

    @Override
    public void activate() { // kiirjuk az átállított current song title-jét
        player.next();
    }
}
