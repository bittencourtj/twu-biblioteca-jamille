package com.twu.biblioteca.services;

import com.twu.biblioteca.helpers.Constants;

import java.io.IOException;

public class Library {

    public void principal() throws IOException {
        System.out.println(openLibrary());

        menu();
    }

    private void menu() throws IOException {
        Menu menu = new Menu();
        System.out.println(menu.show());

        int option = System.in.read();
        System.out.println(menu.chooseOption(Character.getNumericValue(option)));
    }

    public String openLibrary() {
        return Constants.WELCOME_MESSAGE;
    }

}
