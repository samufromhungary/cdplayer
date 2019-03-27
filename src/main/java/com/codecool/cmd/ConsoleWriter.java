package com.codecool.cmd;

import java.util.concurrent.TimeUnit;

public class ConsoleWriter extends Writer {

    public ConsoleWriter() {
    }

    public void writeMsg(String msg){
        System.out.println(msg);
    }

    public void writeInfo(String title, String length){
        System.out.println("Title: " + title + " | Length: " + TimeUnit.MINUTES.toSeconds(Long.parseLong(length)));
    }

    public void whatsPlaying(String title){
        System.out.println("Playing " + title + "...");
    }

}
