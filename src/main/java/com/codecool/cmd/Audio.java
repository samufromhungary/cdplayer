package com.codecool.cmd;

import java.util.List;

public class Audio extends Cd {

    XMLHandler xmlHandler = new XMLHandler();

    public Audio(List<Song> songs) {
        this.songs = songs;
    }


    public int getIndexOfCurrent(Song currentSong) {
        int currentIndex = 0;
        for(Song song : songs) {
            if(song.getTitle().equals(currentSong.getTitle())) {
                currentIndex = songs.indexOf(song);
            }
        }
        return currentIndex;
    }

    @Override
    public void addTrack(Song song) throws OutOfCapacityException {
        float length = 0;
        for(Song s : songs) {
            length += s.getLength();
        }
        if(length + song.getLength() >= 82){
            throw new OutOfCapacityException("Cd out of capacity");
        }
        songs.add(song);
    }
}
