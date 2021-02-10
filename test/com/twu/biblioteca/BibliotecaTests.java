package com.twu.biblioteca;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.services.Library;
import com.twu.biblioteca.services.Menu;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaTests {

    private String bookList = "";

    @Before
    public void booksSetup(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Example Book", "Author One", (short) 1999));
        books.add(new Book(2, "Book 2", "Author Two", (short) 1997));
        books.add(new Book(3, "Book 3", "Author Three", (short) 2010));
        books.add(new Book(4, "Book 4", "Author Four", (short) 1968));

        for (Book book : books){
            bookList += book.toString() + "\n";
        }
    }

    @Test
    public void shouldReturnWelcomeMessageWhenAppStarts(){
        //given
        Library library = new Library();

        //when
        String welcomeMessage = library.openLibrary();

        //then
        Assert.assertEquals(Constants.WELCOME_MESSAGE, welcomeMessage);
    }

    @Test
    public void shouldReturnMenuAfterWelcomeMessage() {
        //given
        Menu menu = new Menu();

        //when
        String showMenu = menu.show();

        //then
        Assert.assertEquals("\n========== Menu ==========\n1. List of books", showMenu);
    }

    @Test
    public void shouldReturnListOfBooksWhenUserChooses1OnMenu() {
        //given
        Menu menu = new Menu();

        //when
        String books = menu.chooseOption(1);

        //then
        Assert.assertEquals(bookList, books);
    }

    @Test
    public void shouldReturnErrorMessageWhenUsrSelectsInvalidOption() {
        //given
        Menu menu = new Menu();

        //when
        String errorMessage = menu.chooseOption(98754);

        //then
        Assert.assertEquals(Constants.INVALID_OPTION_MESSAGE, errorMessage);
    }



}
