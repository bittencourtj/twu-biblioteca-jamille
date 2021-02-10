package com.twu.biblioteca.services;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.models.Book;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<Book> books;

    public Books() {
        this.books = addBooks();
    }

    public String all() {
        String bookList = "";

        for (Book book : books) {
            if (book.isAvailable())
                bookList += book.toString() + "\n";
        }
        return bookList;
    }

    public String checkout(int bookId) {
        if (checkoutValidBook(bookId))
            return Constants.CHECKOUT_SUCCESS_MESSAGE;
        return Constants.CHECKOUT_ERROR_MESSAGE;
    }

    public String returnBook(int bookId) {
        if(returnValidBook(bookId))
            return Constants.RETURN_BOOK_SUCCESS_MESSAGE;
        return Constants.RETURN_BOOK_ERROR_MESSAGE;
    }

    public void chooseCheckoutBook() {
        System.out.println("Books available for checkout: ");
        System.out.println(all());
        System.out.println("Choose the book id you wish to checkout.");
    }

    private List<Book> addBooks() {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book(1, "Example Book", "Author One", true, (short) 1999));
        bookList.add(new Book(2, "Book 2", "Author Two", true, (short) 1997));
        bookList.add(new Book(3, "Book 3", "Author Three", true, (short) 2010));
        bookList.add(new Book(4, "Book 4", "Author Four", true, (short) 1968));

        return bookList;
    }

    private Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id)
                return book;
        }
        return null;
    }

    private boolean checkoutValidBook(int bookId) {
        Book book = getBookById(bookId);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    private boolean returnValidBook(int bookId) {
        Book book = getBookById(bookId);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            return true;
        }
        return false;
    }

}
