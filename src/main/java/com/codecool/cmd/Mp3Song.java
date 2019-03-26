package com.codecool.cmd;

public class Mp3Song extends Song {

    private int size;

    public Mp3Song(String title, int length) {
        super(title, length);
    }

    public int getSize() {
        return size;
    }
}
