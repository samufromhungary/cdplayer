package com.codecool.cmd;

import java.util.InputMismatchException;
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
                    int subChoice;
                    do {
                        System.out.println("Select an option!");
                        System.out.println("1. Play");
                        System.out.println("2. Stop");
                        System.out.println("3. Add CD");
                        System.out.println("4. Change track");
                        System.out.println("5. Show information");
                        System.out.println("0. Back");
                        subChoice = getAnInteger();
                    }while(subChoice != 0);
                    break;
                case 2:

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
}
