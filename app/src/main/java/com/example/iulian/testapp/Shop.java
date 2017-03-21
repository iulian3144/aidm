package com.example.iulian.testapp;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by iulian on 13/03/17.
 */

public class Shop {
    private String name = null;
    private ArrayList<Product> products;
    /**
     * TODO: add parameters for connection details
     * Shop class constructor
     * Instantiate a new shop
     * @params name shop name
     */
    public Shop(String name, int capacity) {
        this.products = new ArrayList<>(capacity);
        this.name = name;
    }

    public void addProduct(Product p)
    {
        products.add(p);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append(String.format(Locale.ENGLISH, "%6s | %16s | %6s\n", "Name", "Description", "Price"));
        for(Product p:products)
            sb.append(p.toString()+'\n');

        return sb.toString();
    }
}
