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

    private int getIndexOfCurrent(Song tempSong) {
        int i = 0;
        for(Song song : songs) {
            if(song.getTitle().equals(tempSong.getTitle())) {
                i = songs.indexOf(song);
            }
        }
        return i;
    }

    @Override
    public void activate() {



    }
}
