package com.codecool.cmd;

import javax.sql.rowset.spi.XmlReader;

public class PlayActivity implements Activity {

    Player player;

    public PlayActivity(Player player){
        this.player = player;
    }

    @Override
    public void activate() {
        player.play();
    }
}
