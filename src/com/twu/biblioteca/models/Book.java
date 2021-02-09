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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public short getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(short yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return id + ". " + title + " - " + author + " - " + yearPublished;
    }
}
