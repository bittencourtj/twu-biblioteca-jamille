package com.twu.biblioteca;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.services.Library;
import org.hamcrest.core.Is;
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
        Assert.assertThat(welcomeMessage, Is.is(Constants.WELCOME_MESSAGE));
    }

}
