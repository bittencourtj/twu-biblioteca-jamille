package com.twu.biblioteca.services;

import com.twu.biblioteca.helpers.Constants;
import com.twu.biblioteca.models.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> items;

    public Menu() {
        this.items = addItems();
    }

    private List<MenuItem> addItems() {
        List<MenuItem> listItems = new ArrayList<>();
        listItems.add(new MenuItem(1, "List of books"));

        return listItems;
    }

    public String show() {
        String menu = Constants.MENU_TITLE;
        for (MenuItem item : items) {
            menu += item.toString();
        }

        return menu;
    }

    public String chooseOption(int option) {
        switch (option) {
            case 1:
                Books books = new Books();
                return books.all();
            default:
                return Constants.INVALID_OPTION_MESSAGE;
        }
    }

}
