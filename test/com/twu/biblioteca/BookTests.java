package com.twu.biblioteca;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.services.Books;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookTests {
    private Books books = new Books();
    private String availableBookList = "";

    @Before
    public void setup() {
        //given
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Example Book", "Author One", true, (short) 1999));
        books.add(new Book(2, "Book 2", "Author Two", false, (short) 1997));
        books.add(new Book(3, "Book 3", "Author Three", true, (short) 2010));
        books.add(new Book(4, "Book 4", "Author Four", true, (short) 1968));

        for (Book book : books) {
            if (book.isAvailable())
                availableBookList += book.toString() + "\n";
        }
    }

    @Test
    public void shouldReturnSuccessMessageWhenUserCheckoutsBook2() {
        //when
        String checkoutMessage = books.checkout(2);

        //then
        Assert.assertEquals(Constants.CHECKOUT_SUCCESS_MESSAGE, checkoutMessage);
    }

    @Test
    public void shouldReturnListOfBooksWithoutCheckedOutBooks() {
        //given
        books.checkout(2);

        //when
        String availableBooks = books.all();

        //then
        Assert.assertEquals(availableBookList, availableBooks);
    }

    @Test
    public void shouldReturnErrorMessageWhenUserCheckoutsBookUnavailable() {
        //when
        String checkoutMessage = books.checkout(64);

        //then
        Assert.assertEquals(Constants.CHECKOUT_ERROR_MESSAGE, checkoutMessage);
    }

    @Test
    public void shouldReturnSuccessMessageWhenUserReturnsBook2() {
        //when
        books.checkout(2);
        String successMessage = books.returnBook(2);

        //then
        Assert.assertEquals(Constants.RETURN_BOOK_SUCCESS_MESSAGE, successMessage);
    }

    @Test
    public void shouldReturnErrorMessageWhenUserReturnsWrongBook() {
        //when
        String errorMessage = books.returnBook(2);

        //then
        Assert.assertEquals(Constants.RETURN_BOOK_ERROR_MESSAGE, errorMessage);
    }
}
