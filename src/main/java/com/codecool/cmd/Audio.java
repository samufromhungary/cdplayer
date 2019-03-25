package com.codecool.cmd;

public class Audio extends Cd {

    @Override
    public void addTrack(Song song) {
        songs.add(song);
    }
}
