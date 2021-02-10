package com.twu.biblioteca.services;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.models.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> items;
    private Books books = new Books();

    public Menu() {
        this.items = addItems();
    }

    private List<MenuItem> addItems() {
        List<MenuItem> listItems = new ArrayList<>();
        listItems.add(new MenuItem(1, "List of books"));
        listItems.add(new MenuItem(2, "Checkout book"));
        listItems.add(new MenuItem(3, "Return book"));
        listItems.add(new MenuItem(4, "Quit application"));

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
        int bookId = 0;
        switch (option) {
            case 1:
                return books.all();
            case 2:
                books.chooseCheckoutBook();
                bookId = Console.readIntInput();
                return books.checkout(bookId);
            case 3:
                Console.print("Type the book id you wish to return.");
                bookId = Console.readIntInput();
                return books.returnBook(bookId);
            case 4:
                return "";
            default:
                return Constants.INVALID_OPTION_MESSAGE;
        }
    }
}
