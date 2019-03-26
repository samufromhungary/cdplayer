package com.codecool.cmd;

import java.util.List;

public class Audio extends Cd {

    public Audio(List<Song> songs) {
        super(songs);
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



    public Audio() {
    }
}
