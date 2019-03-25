package com.codecool.cmd;

import java.util.List;

public class Menu {

    private List<MenuItem> items;
    private List<Writer> writers;

    public void addItem(MenuItem item){
        items.add(item);
    }

    public void show(){}

    public void addWriter(Writer writer){
        writers.add(writer);
    }
}
