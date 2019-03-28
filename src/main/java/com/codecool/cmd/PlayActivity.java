package com.codecool.cmd;

import javax.sql.rowset.spi.XmlReader;

public class PlayActivity implements Activity {

    Player player;
    XMLHandler xml = new XMLHandler();
    Audio audioCd = new Audio(xml.readToObjects());

    public PlayActivity(Player player){
        this.player = player;
    }

    @Override
    public void activate() {
        player.start(audioCd.getSongs().get(0).getTitle(), audioCd.getSongs());
    }
}
