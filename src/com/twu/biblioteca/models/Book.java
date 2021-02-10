package com.twu.biblioteca.models;

public class Book {

    private int id;
    private String title;
    private String author;
    private short yearPublished;

    public Book(int id, String title, String author, short yearPublished) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return id + ". " + title + " - " + author + " - " + yearPublished;
    }
}
