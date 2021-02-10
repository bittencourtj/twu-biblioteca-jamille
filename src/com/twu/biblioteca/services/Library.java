package com.twu.biblioteca.services;

import com.twu.biblioteca.helpers.Constants;

import java.util.Scanner;

public class Library {

    public void execute() {
        System.out.println(openLibrary());

        showMenu();
    }

    private void showMenu() {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            //todo: extract sysout and sysin to ConsoleHelper class
            System.out.println(menu.show());
            option = sc.nextInt();

            System.out.println(menu.chooseOption(option));
        }
        while (isValid(option));
    }

    private boolean isValid(int option) {
        if (option == 99)
            return false;
        return true;
    }

    public String openLibrary() {
        return Constants.WELCOME_MESSAGE;
    }

}
