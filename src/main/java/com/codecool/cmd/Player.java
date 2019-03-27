package com.codecool.cmd;

import java.util.List;

public class Player {

    private List<MenuItem> items;
    private List<Writer> writers;
    ConsoleWriter consoleWriter = new ConsoleWriter();
    private Song currentSong;
    private List<Song> songs;
    Audio audioCd = new Audio();
    ChangeTrackActivity activity = new ChangeTrackActivity();


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

    public Song prev(int i){
        consoleWriter.writemsg("Changing to previous track");
        if(i - 1 < 0){
            currentSong = songs.get(songs.size() - 1);
        }else{
            currentSong = songs.get(i - 1);
        }
        return currentSong;
    }

    public Song next(int i){
        consoleWriter.writemsg("Changing to next track");
        if(i + 1 > songs.size() - 1){
            currentSong = songs.get(0);
        }else{
            currentSong = songs.get(i + 1);
        }
        return currentSong;


    }


}
