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
        bookList.add(new Book(2, "Book 2", "Author Two", (short) 1997));
        bookList.add(new Book(3, "Book 3", "Author Three", (short) 2010));
        bookList.add(new Book(4, "Book 4", "Author Four", (short) 1968));

        return bookList;
    }

    public String all() {
        String bookList = "";

        for (Book book : books){
            bookList += book.toString() + "\n";
        }
        return bookList;
    }
}
