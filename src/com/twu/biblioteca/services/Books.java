package com.twu.biblioteca.services;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.models.Book;

import java.util.List;

public class Books {

    private List<Book> books;

    public Books() {
        this.books = addBooks();
    }

    private List<Book> addBooks() {
        List<Book> bookList = List.of(
                new Book(1, "Neuromancer", "William Gibson", true, (short) 1984),
                new Book(2, "V for Vendetta", "Author Two", false, (short) 1997),
                new Book(3, "Harry Potter and the Order of the Phoenix", "J. K. Rowling", true, (short) 2003),
                new Book(4, "Maus", "Art Spiegelman", true, (short) 1980)
        );

        return bookList;
    }

    public String getAll() {
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
        if (returnValidBook(bookId))
            return Constants.RETURN_BOOK_SUCCESS_MESSAGE;
        return Constants.RETURN_BOOK_ERROR_MESSAGE;
    }

    public void chooseCheckoutBook() {
        Console.print("Books available for checkout: \n" + getAll() + "Choose the book id you wish to checkout.");
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
