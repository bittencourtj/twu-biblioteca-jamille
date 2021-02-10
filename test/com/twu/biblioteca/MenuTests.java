package com.twu.biblioteca;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.services.Menu;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MenuTests {
    private Menu menu;
    String menuText;

    @Before
    public void setup() {
        //given
        menu = new Menu();
        menuText = "========== Menu ==========\n" +
                "1. List of books\n" +
                "2. Checkout book\n" +
                "3. Return book\n" +
                "4. Quit application\n";
    }

    @Test
    public void shouldReturnMenuAfterWelcomeMessage() {
        //when
        String showMenu = menu.show();

        //then
        Assert.assertThat(showMenu, Is.is(menuText));
    }

    @Test
    public void shouldReturnListOfBooksWhenUserChooses1OnMenu() {
        //when
        String books = menu.chooseOption(1);

        //then
        Assert.assertThat(books, Is.isA(String.class));
    }

    @Test
    public void shouldReturnErrorMessageWhenUsrSelectsInvalidOption() {
        //when
        String errorMessage = menu.chooseOption(98754);

        //then
        Assert.assertThat(errorMessage, Is.is(Constants.INVALID_OPTION_MESSAGE));
    }

}
