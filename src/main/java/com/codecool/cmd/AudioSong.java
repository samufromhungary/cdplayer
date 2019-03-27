package com.codecool.cmd;

import java.util.Random;

public class AudioSong extends Song {


    private float samplingFrequency;

    public AudioSong(String title, int length) {
        super(title, length);
    }

    public float getSamplingFrequency() {
        return samplingFrequency;
    }

    public void setSamplingFrequency(float samplingFrequency) {
        Random rnd = new Random();
        boolean freq1 = rnd.nextBoolean();
        if(freq1){
            samplingFrequency = 44;
        }else{
            samplingFrequency = 46;
        }
        this.samplingFrequency = samplingFrequency;
    }
}
