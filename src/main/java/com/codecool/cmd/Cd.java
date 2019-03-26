package com.codecool.cmd;

import java.util.List;

public abstract class Cd {

    private int limit;
    protected List<Song> songs;

    public int getLimit() {
        return limit;
    }

    public abstract void addTrack(Song song) throws OutOfCapacityException;

    public Cd(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Cd() {
    }
}
