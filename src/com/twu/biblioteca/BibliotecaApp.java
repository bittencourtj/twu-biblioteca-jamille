package com.twu.biblioteca;

import com.twu.biblioteca.services.Menu;

import java.io.IOException;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        Menu menu = new Menu();

        System.out.println(bibliotecaApp.openLibrary());
        System.out.println(menu.show());

        int option = System.in.read();
        System.out.println(menu.chooseOption(Character.getNumericValue(option)));

    }

    public String openLibrary() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

}
