package com.codecool.cmd;

import com.codecool.cmd.rmiInterface.RMIInterface;

import java.rmi.RemoteException;
import java.util.List;

public class Player {

    private boolean playing;
    private Writer writer;
    private RMIInterface spotifyServer;
    private Song currentSong;
    private int lastCdSongIndex;
    private int lastSpotifyTrackIndex;
    private PlayerMode mode = PlayerMode.CD;
    private Cd cd;

    public Player(Writer writer, RMIInterface spotifyServer) {
        this.writer = writer;
        this.spotifyServer = spotifyServer;
    }

    public void setMode(PlayerMode mode){
        this.mode = mode;
    }

    public void setCd(Cd cd){
        if (playing) {
            throw new IllegalStateException();
        }
        this.cd = cd;
    }

    public void setWriter(Writer writer){
        this.writer = writer;
    }

    public void start() {
        if (mode == PlayerMode.CD) {
            if (cd == null) {
                throw new IllegalStateException();
            }
            if (currentSong == null) {
                currentSong = cd.getSongs().get(0);
            }
            writer.writemsg("Started playing: " + currentSong.getTitle());
        } else {
            try {
                String trackList = spotifyServer.getTrackList();
                currentSong = new Song("asdasd", -1);
                writer.writemsg("playing that other shit");
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public void stop(){
        if (cd == null) {
            return;
        }

        if (currentSong == null) {
            return;
        }

        currentSong = null;
        writer.writemsg("Stopped playing.");
    }

    public void show(){
        writer.writemsg("Playing currently: " + currentSong.getTitle());
    }

    public Song prev(int i){
        writer.writemsg("Changing to previous track");
        if(i - 1 < 0){
            currentSong = songs.get(songs.size() - 1);
        }else{
            currentSong = songs.get(i - 1);
        }
        return currentSong;
    }

    public void next(){

        writer.writemsg("Changing to next track");
        if(currentIndex + 1 > songs.size() - 1){
            currentSong = songs.get(0);
        }else{
            currentSong = songs.get(currentIndex + 1);
        }
    }


}
