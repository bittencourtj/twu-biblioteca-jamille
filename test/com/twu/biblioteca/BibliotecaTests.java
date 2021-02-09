package com.twu.biblioteca;

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
    public void shouldReturnMenuAfterWelcomeMessage() throws IOException {
        //given
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        //when
        String menu = bibliotecaApp.showMenu();

        //then
        Assert.assertEquals("\n========== Menu ==========\n1. List of books", menu);
    }
}
