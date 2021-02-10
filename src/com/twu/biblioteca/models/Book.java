package com.twu.biblioteca.models;

import com.twu.biblioteca.helpers.Constants;

public class Book {

    private int id;
    private String title;
    private String author;
    private boolean available;
    private short yearPublished;

    public Book(int id, String title, String author, boolean available, short yearPublished) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
        this.yearPublished = yearPublished;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return id + ". " + title + Constants.SEPARATOR + author + Constants.SEPARATOR + yearPublished;
    }
}
