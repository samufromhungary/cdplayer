package com.codecool.cmd;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {


    Scanner scan = new Scanner(System.in);

    private String title;
    private String[] options;
    private List<MenuItem> items = new ArrayList<>();
    private List<Writer> writers;

    public Menu() {
    }

    public Menu(String title, String[] options){
        this.title = title;
        this.options = options;
    }

    public void addItem(MenuItem item){
        items.add(item);
    }

    public void show(){
        //System.out.print(title + "\n\n");
        int i = 1;
        int answer = -1;
        while(true) {
            for (MenuItem option : this.items) {
                System.out.println(i + option.getTitle());
                i++;
            }
            answer = getAnInteger();
            handleInput(answer);
        }
    }

    public void addWriter(Writer writer){
        writers.add(writer);
    }

    private void handleInput(int num) {
        this.items.get(num).getActivity().activate();
    }

    public int getAnInteger() {
        while (true) {
            try {
                return scan.nextInt();
            } catch (InputMismatchException e) {
                scan.next();
                System.out.print("Give a valid number");
            }
        }
    }
}
