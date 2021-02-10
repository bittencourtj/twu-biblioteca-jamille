package com.twu.biblioteca;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.services.Library;
import com.twu.biblioteca.services.Menu;
import org.junit.Assert;
import org.junit.Test;

public class BibliotecaTests {

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
        Assert.assertEquals("1. Example Book | Author One | 1999", books);
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
