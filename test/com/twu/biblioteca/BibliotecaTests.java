package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

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
}
