package com.codecool.cmd;

import java.util.List;

public class Mp3 extends Cd {

    @Override
    public void addTrack(Song song) throws OutOfCapacityException{
        if((songs.size() * 20) >= 700){
            throw new OutOfCapacityException("Cd out of capacity");
        }
        songs.add(song);
    }

    public Mp3(List<Song> songs) {
        super(songs);
    }
}
