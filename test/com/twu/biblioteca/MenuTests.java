package com.twu.biblioteca;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.services.Menu;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MenuTests {
    private Menu menu;

    @Before
    public void setup()
    {
        //given
        menu = new Menu();
    }

    @Test
    public void shouldReturnMenuAfterWelcomeMessage() {
        //when
        String showMenu = menu.show();

        //then
        Assert.assertEquals("\n========== Menu ==========\n1. List of books\n2. Checkout book\n3. Return book\n4. Quit application\n", showMenu);
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
        Assert.assertEquals(Constants.INVALID_OPTION_MESSAGE, errorMessage);
    }

}
