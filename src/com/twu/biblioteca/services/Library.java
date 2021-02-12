package com.twu.biblioteca.services;

import com.twu.biblioteca.helpers.Constants;

import static com.twu.biblioteca.services.Console.print;

public class Library {

    public void execute() {
        print(openLibrary());

        showMenu();
    }

    private void showMenu() {
        Menu menu = new Menu();
        int option = 0;

        do {
            Console.print(menu.show());
            option = Console.readIntInput();

            Console.print(menu.chooseOption(option));
        }
        while (isQuit(option));
    }

    private boolean isQuit(int option) {
        if (option != 4) {
            return true;
        }

        Console.print(Constants.GOODBYE_MESSAGE);
        return false;
    }

    public String openLibrary() {
        return Constants.WELCOME_MESSAGE;
    }

}
