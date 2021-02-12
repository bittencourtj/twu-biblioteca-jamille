package com.twu.biblioteca;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.services.BookService;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class BookTests {
    private BookService books;
    private String availableBookList = "";

    @Before
    public void setUp() {
        //given
        books = new BookService();
        List<Book> bookExamples = List.of(
                new Book(1, "Neuromancer", "William Gibson", true, (short) 1984),
                new Book(2, "V for Vendetta", "Author Two", false, (short) 1997),
                new Book(3, "Harry Potter and the Order of the Phoenix", "J. K. Rowling", true, (short) 2003),
                new Book(4, "Maus", "Art Spiegelman", true, (short) 1980)
        );

        for (Book book : bookExamples) {
            if (book.isAvailable())
                availableBookList += book.toString() + "\n";
        }
    }

    @Test
    public void shouldReturnSuccessMessageWhenUserCheckoutsBook() {
        //when
        String checkoutMessage = books.checkout(1);

        //then
        Assert.assertThat(checkoutMessage, Is.is(Constants.CHECKOUT_SUCCESS_MESSAGE));
    }

    @Test
    public void shouldReturnListOfBooksWithoutCheckedOutBooks() {
        //given
        books.checkout(2);

        //when
        String availableBooks = books.getAllAvailable();

        //then
        Assert.assertThat(availableBooks, Is.is(availableBookList));
    }

    @Test
    public void shouldReturnErrorMessageWhenUserCheckoutsBookUnavailable() {
        //when
        String checkoutMessage = books.checkout(64);

        //then
        Assert.assertThat(checkoutMessage, Is.is(Constants.CHECKOUT_ERROR_MESSAGE));
    }

    @Test
    public void shouldReturnSuccessMessageWhenUserReturnsBook() {
        //when
        books.checkout(1);
        String successMessage = books.returnBook(1);

        //then
        Assert.assertThat(successMessage, Is.is(Constants.RETURN_BOOK_SUCCESS_MESSAGE));
    }

    @Test
    public void shouldReturnErrorMessageWhenUserReturnsWrongBook() {
        //when
        String errorMessage = books.returnBook(1);

        //then
        Assert.assertThat(errorMessage, Is.is(Constants.RETURN_BOOK_ERROR_MESSAGE));
    }
}
