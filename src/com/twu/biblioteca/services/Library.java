package com.twu.biblioteca.services;

import com.twu.biblioteca.helpers.Constants;

import java.io.IOException;

public class Library {

    public void execute() throws IOException {
        System.out.println(openLibrary());

        showMenu();
    }

    private void showMenu() throws IOException {
        Menu menu = new Menu();
        //todo: extract sysout and sysin
        System.out.println(menu.show());

        int option = System.in.read();
        System.out.println(menu.chooseOption(Character.getNumericValue(option)));
    }

    public String openLibrary() {
        return Constants.WELCOME_MESSAGE;
    }

}
