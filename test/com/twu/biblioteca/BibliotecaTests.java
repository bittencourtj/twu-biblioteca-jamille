package com.twu.biblioteca;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.services.Library;
import org.junit.Assert;
import org.junit.Test;


public class BibliotecaTests {

    @Test
    public void shouldReturnWelcomeMessageWhenAppStarts() {
        //given
        Library library = new Library();

        //when
        String welcomeMessage = library.openLibrary();

        //then
        Assert.assertEquals(Constants.WELCOME_MESSAGE, welcomeMessage);
    }

}
