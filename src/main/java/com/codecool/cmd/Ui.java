package com.codecool.cmd;

import java.util.Scanner;

public class Ui {

    Scanner scanner = new Scanner(System.in);

    public void run() {

        int menuOption;
        do {
            while (true) {

                menuPrinter(new String[]{
                    "CD mode",
                    "Spotify mode"
                });
                System.out.print("Please select an option: ");
                try {
                    menuOption = Integer.parseInt(getUserInput());
                    break;
                } catch (NumberFormatException ne) {
                    System.out.println("Invalid input. Please try again!");
                    continue;
                }
            }
            switch (menuOption) {
                case 1:
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
        }
        while (menuOption != 0);

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
}
