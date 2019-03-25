package com.codecool.cmd;

public class Audio extends Cd {

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
