package com.twu.biblioteca;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.services.Console;
import com.twu.biblioteca.services.Library;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ConsoleTests {

    private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    private InputStream byteArrayInputStream;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    public void shouldPrintWelcomeMessageOnConsole() {
        Library library = new Library();
        Console.print(library.openLibrary());

        Assert.assertThat(byteArrayOutputStream.toString(), Is.is(Constants.WELCOME_MESSAGE + "\n"));
    }

    @Test
    public void shouldReadUserInputOnConsole() {
        String input = "11";
        byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);

        Assert.assertThat(Console.readIntInput(), Is.is(Integer.parseInt(input)));
    }
}
