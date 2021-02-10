package com.twu.biblioteca;

import com.twu.biblioteca.services.Library;

import java.io.IOException;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {
        Library library = new Library();
        library.execute();
    }
}
