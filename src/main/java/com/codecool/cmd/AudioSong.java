package com.codecool.cmd;

public class AudioSong extends Song {

    private float samplingFrequency;

    public AudioSong(String title, int length) {
        super(title, length);
    }

    public float getSamplingFrequency() {
        return samplingFrequency;
    }
}
