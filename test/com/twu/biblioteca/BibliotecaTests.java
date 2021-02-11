package com.twu.biblioteca;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.services.Library;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


public class BibliotecaTests {

    @Test
    public void shouldReturnWelcomeMessageWhenAppStarts() {
        Library library = new Library();

        String welcomeMessage = library.openLibrary();

        Assert.assertThat(welcomeMessage, Is.is(Constants.WELCOME_MESSAGE));
    }

}
