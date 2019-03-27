package com.codecool.cmd;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class Writer {


    public void writemsg(String msg){
        System.out.println(msg);
    }

    public void writeinfo(String title, String length){
        System.out.println("Title: " + title + " | Length: " + TimeUnit.MINUTES.toSeconds(Long.parseLong(length)));
    }

    public void whatsPlaying(String title){
        System.out.println("Playing " + title + "...");
    }

    public void randomAds(){}
}
