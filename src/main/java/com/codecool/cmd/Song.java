package com.codecool.cmd;

public class Song {


    private String title;
    private int length;

    public Song(String title, int length){
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
