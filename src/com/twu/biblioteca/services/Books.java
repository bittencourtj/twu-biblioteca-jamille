package com.twu.biblioteca.services;

import com.twu.biblioteca.models.Book;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<Book> books;

    public Books() {
        this.books = addBooks();
    }

    private List<Book> addBooks() {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book(1, "Example Book", "Author One", (short) 1999));

        return bookList;
    }

    public String all() {
        String bookList = "";
        for (Book book : books){
            bookList += book.toString();
        }
        return bookList;
    }
}
