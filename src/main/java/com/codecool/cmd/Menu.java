package com.codecool.cmd;

import java.util.List;

public class Menu {


    private String title;
    private String[] options;
    private List<MenuItem> items;
    private List<Writer> writers;

    public Menu(String title, String[] options){
        this.title = title;
        this.options = options;
    }

    public void addItem(MenuItem item){
        items.add(item);
    }

    public void show(){
        System.out.print(title + "\n\n");
        int i = 1;
        for (String option:options) {
            if (option.equals(options[options.length-1])) {
                System.out.println("(" + i + ") " + option + "\n\n");
                i++;
            } else {
                System.out.print("(" + i + ") " + option + "\n\n");
                i++;
            }
        }
    }

    public void addWriter(Writer writer){
        writers.add(writer);
    }
}
