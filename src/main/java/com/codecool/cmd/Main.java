package com.codecool.cmd;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        Player player = new Player();
        XMLHandler xmlH = new XMLHandler();
        List<Song> songs = xmlH.readToObjects();
        Audio audioCd = new Audio(songs);
        Song currentSong;


        Menu menu = new Menu();
        menu.addItem(new MenuItem("play", new PlayActivity(player)));
        audioCd.getIndexOfCurrent();
        menu.addItem(new MenuItem("next track", new NextActivity(songs.indexOf(currentSong))));

        menu.show(); // basic menu
    }
}
