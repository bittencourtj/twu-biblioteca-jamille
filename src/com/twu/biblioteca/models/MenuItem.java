package com.twu.biblioteca.models;

public class MenuItem {
    private int id;
    private String description;

    public MenuItem(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return id + ". " + description;
    }

}
