package com.twu.biblioteca.services;

import java.util.Scanner;

public class Console {

    private static Scanner sc = new Scanner(System.in);

    public static void print(String message) {
        System.out.println(message);
    }

    public static int readIntInput() {
            return sc.nextInt();
    }
}
