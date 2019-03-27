package com.codecool.cmd;

import java.util.Random;

public class ConsoleWriter extends Writer {
    public void randomAds(){
        String[] list = new String[]{"Random ad1", "Random ad2", "Random ad3", "Random ad4", "Random ad5", "Random ad6", "Random ad7", "Random ad8", "Random ad9", "Random ad10"};
        Random rnd = new Random();
        System.out.println(list[rnd.nextInt(list.length - 0 + 1) + 0]);
    }


    public void writemsg(String msg) {
        System.out.println(msg);
    }

    public void whatsPlaying(String title){
        System.out.println("Playing " + title + "...");
    }

    public void writeinfo(String title, String length){
        
    }


}
