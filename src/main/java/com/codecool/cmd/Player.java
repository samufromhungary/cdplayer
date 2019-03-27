package com.codecool.cmd;

import java.util.List;

public class Player {

    private List<MenuItem> items;
    private List<Writer> writers;
    ConsoleWriter consoleWriter = new ConsoleWriter();


    public void setMode(PlayerMode mode){

    }

    public void setCd(Cd cd){

    }

    public void setWriter(Writer writer){

    }

    public void start(String title){ //console: title + playing + ...
        consoleWriter.whatsPlaying(title);
    }

    public void stop(){}

    public void show(){}

    public void prev(){}

    public void next(){}


}
