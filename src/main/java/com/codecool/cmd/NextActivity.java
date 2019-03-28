package com.codecool.cmd;

import java.util.List;

public class NextActivity implements Activity {

    private Song currentSong;
    private List<Song> songs;
    Audio audioCd = new Audio();
    Player player = new Player();

    public NextActivity(Song currentSong, List<Song> songs) {
        this.currentSong = currentSong;
        this.songs = audioCd.getSongs();
    }

    @Override
    public void activate() { // kiirjuk az átállított current song title-jét

        player.start(player.next(songs.indexOf(currentSong)).getTitle());

    }
}
