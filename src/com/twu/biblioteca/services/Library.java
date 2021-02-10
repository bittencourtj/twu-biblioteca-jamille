package com.twu.biblioteca.services;

import com.twu.biblioteca.helpers.Constants;

import static com.twu.biblioteca.services.Console.print;

public class Library {

    //private Console console = new Console();
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
        while (isValid(option));
    }

    private boolean isValid(int option) {
        if (option == 4){
            Console.print(Constants.GOODBYE_MESSAGE);
            return false;
        }
        return true;
    }

    public String openLibrary() {
        return Constants.WELCOME_MESSAGE;
    }

}
