package com.twu.biblioteca.services;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.models.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<MenuItem> items;
    private Books books = new Books();
    private Scanner sc = new Scanner(System.in);

    public Menu() {
        this.items = addItems();
    }

    private List<MenuItem> addItems() {
        List<MenuItem> listItems = new ArrayList<>();
        listItems.add(new MenuItem(1, "List of books"));
        listItems.add(new MenuItem(2, "Checkout book"));

        return listItems;
    }

    public String show() {
        String menu = Constants.MENU_TITLE;
        for (MenuItem item : items) {
            menu += item.toString() + "\n";
        }

        return menu;
    }

    public String chooseOption(int option) {
        switch (option) {
            case 1:
                return books.all();
            case 2:
                books.chooseCheckoutBook();
                int bookId = sc.nextInt();
                return books.checkout(bookId);
            default:
                return Constants.INVALID_OPTION_MESSAGE;
        }
    }
}
