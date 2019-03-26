package com.codecool.cmd;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ui {

    Player player = new Player();
    Song song1 = new Song("picsafej", 15);
    Song song2 = new Song("sunaszaft", 20);
    List<Song> probaSongs = new ArrayList<>();

    Cd[] cdStrorage = new Cd[1];

    Scanner scanner = new Scanner(System.in);

    public void run() {
        probaSongs.add(song1);
        probaSongs.add(song2);
        Audio audio = new Audio(probaSongs);
        int menuOption = 0;
        int subChoice;
        do {
            System.out.println("Please select an option: ");
            System.out.println("1. Cd ");
            System.out.println("2. Spotify");
            menuOption = getAnInteger();
            switch (menuOption) {
                case 1:
                    do {
                        player.setMode(PlayerMode.CD);
                        System.out.println("Select an option!");
                        System.out.println("1. Play");
                        System.out.println("2. Stop");
                        System.out.println("3. Add CD");
                        System.out.println("4. Change track");
                        System.out.println("5. Show information");
                        System.out.println("0. Back");
                        subChoice = getAnInteger();
                        switch(subChoice){
                            case 1:
                                if(cdStrorage == null){
                                break;
                            case 2:

                                break;
                            case 3:
                                cdStrorage[0] = audio;
                                System.out.println("proba audio cd added.");

                                break;
                        }
                    } while (subChoice != 0);
                    break;
                case 2:
                    do {
                        player.setMode(PlayerMode.SPOTIFY);
                        System.out.println("Select an option!");
                        System.out.println("1. Play");
                        System.out.println("2. Stop");
                        System.out.println("3. Add CD");
                        System.out.println("4. Change track");
                        System.out.println("5. Show information");
                        System.out.println("0. Back");
                        subChoice = getAnInteger();
                    } while (subChoice != 0);
                    break;

            }

        } while (menuOption != 0);
    }

    private void menuPrinter(String[] options) {
        int counter = 1;
        for (String option : options) {
            System.out.println(counter + ". " + option);
            counter++;
        }
        System.out.println("0. Exit\n");
    }

    public String getUserInput() {
        String input = scanner.nextLine();
        System.out.println();
        return input;
    }

    public int getAnInteger() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.print("Give a valid number");
            }
        }
    }

    public static void main(String[] args) {
        Ui ui = new Ui();
        ui.run();
    }
}
