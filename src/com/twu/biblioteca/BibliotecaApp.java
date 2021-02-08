package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        System.out.println(bibliotecaApp.openLibrary());
    }

    public String openLibrary(){
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }
}
