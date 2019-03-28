package com.codecool.cmd;

import java.sql.SQLOutput;
import java.util.List;

public class Player {

    private List<MenuItem> items;
    private List<Writer> writers;
    ConsoleWriter consoleWriter = new ConsoleWriter();
    private Song currentSong;
    private List<Song> songs;
    Audio audioCd = new Audio();
    ChangeTrackActivity activity = new ChangeTrackActivity(currentSong);


    public void setMode(PlayerMode mode){

    }

    public void setCd(Cd cd){

    }

    public void setWriter(Writer writer){

    }

    public void start(String title){ //console: title + playing + ...
        consoleWriter.whatsPlaying(title);
        for (Song s : songs){
            if (s.getTitle().equals(title)){
                this.currentSong = s;
            }
        }
    }

    public void stop(){
        if (currentSong.equals(null)){
            System.out.println("No tracks playing");
        }else {
            currentSong = songs.get(0);
            System.out.println("Stopped");
        }

    }

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

    public Song next(int currentIndex){

        consoleWriter.writemsg("Changing to next track");
        if(currentIndex + 1 > songs.size() - 1){
            currentSong = songs.get(0);
        }else{
            currentSong = songs.get(currentIndex + 1);
        }
        return currentSong;
    }


}
