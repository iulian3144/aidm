package com.example.iulian.testapp;

import java.util.Locale;

/**
 * Created by iulian on 14/03/17.
 */

class Product {
    private String name;
    private String description;
    private float price;
    private static int i = 0;

    public Product() {
        this.name = "item"+i;
        this.description = "desc"+i;
        this.price = 100+i;
        ++i;
    }

    public Product(String name, String description, float price) {
        this.name        = name;
        this.description = description;
        if(price > 0)
            this.price = price;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "%6s | %16s | %4.2f", name, description, price);
    }

    public static void resetIndex() {
        i = 0;
    }
}
