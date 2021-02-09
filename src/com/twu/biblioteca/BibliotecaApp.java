package com.twu.biblioteca;

import java.io.IOException;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        System.out.println(bibliotecaApp.openLibrary());

        System.out.println(bibliotecaApp.showMenu());
    }


    public String openLibrary() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public String showMenu() {
        return "\n========== Menu ==========\n1. List of books";
    }

}
