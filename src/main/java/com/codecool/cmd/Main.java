package com.codecool.cmd;

import com.codecool.cmd.rmiInterface.RMIInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class Main {


    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        RMIInterface rmi = (RMIInterface) Naming.lookup("//localhost/MyServer");
        Player player = new Player(rmi);
        XMLHandler xmlH = new XMLHandler();
        List<Song> songs = xmlH.readToObjects();
        Audio audioCd = new Audio(songs);
        Song currentSong;


        Menu menu = new Menu();
        audioCd.getSongs();
        menu.addItem(new MenuItem("play", new PlayActivity(player)));
        menu.addItem(new MenuItem("next", new NextActivity(songs, player)));
        menu.addItem(new MenuItem("previous", new PreviousActivity(player)));
        menu.addItem(new MenuItem("stop", new StopActivity(player)));
        menu.show(); // basic menu
    }
}
