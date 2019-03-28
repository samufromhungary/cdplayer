/*
package com.codecool.cmd;

import java.util.List;

public class ChangeTrackActivity implements Activity{

    private Song currentSong;
    private List<Song> songs;
    Audio audioCd = new Audio();


    public ChangeTrackActivity(Song currentSong) {

        this.currentSong = currentSong;
        this.songs = audioCd.getSongs();
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
    public void activate() {
        player.next(audioCd.getSongs().get(i).getTitle());


    }
}
*/
