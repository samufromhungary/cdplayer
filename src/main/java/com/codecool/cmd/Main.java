package com.codecool.cmd;

public class Main {


    public static void main(String[] args) {
        Player player = new Player();

        Menu menu = new Menu();
        menu.addItem(new MenuItem("play", new PlayActivity(null)));


        menu.show(); // basic menu
    }
}
