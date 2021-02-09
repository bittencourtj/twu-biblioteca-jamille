package com.twu.biblioteca;

import com.twu.biblioteca.services.Menu;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class BibliotecaTests {

    @Test
    public void shouldReturnWelcomeMessageWhenAppStarts(){
        //given
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        //when
        String welcomeMessage = bibliotecaApp.openLibrary();

        //then
        Assert.assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!", welcomeMessage);
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
        Assert.assertEquals("Example Book - Author One", books);
    }

    @Test
    public void shouldReturnErrorMessageWhenUsrSelectsInvalidOption() {
        //given
        Menu menu = new Menu();

        //when
        String errorMessage = menu.chooseOption(98754);

        //then
        Assert.assertEquals("Please select a valid option!", errorMessage);
    }

}
