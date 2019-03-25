package com.codecool.cmd;

public class MenuItem {
    private String title;
    private Activity activity;

    public MenuItem(String title, Activity activity) {
        this.title = title;
        this.activity = activity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

}
