package com.codecool.cmd;

public class Mp3Song extends Song {


    private int size;

    public Mp3Song(String title, int length) {
        super(title, length);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        size = 5;
        this.size = size;
    }

}
