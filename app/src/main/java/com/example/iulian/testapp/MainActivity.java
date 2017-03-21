/**
 * @author  Iulian PAUN
 * @version 0.1
 */
package com.example.iulian.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String debugTag = "TestApp";
    private TextView prod_list;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(debugTag, "[onCreate]");

        Product.resetIndex();
        Shop kaufland = new Shop("Kaufland", 100);
        ArrayList<Product> products = new ArrayList<>();

        for(int i = 0; i < 100; ++i)
            products.add(new Product());

        for(Product p:products)
            kaufland.addProduct(p);

        prod_list = (TextView)findViewById(R.id.prod_list);
        prod_list.setText(kaufland.toString());
    }

    /**
     * this method runs when the application starts
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(debugTag, "[onStart]");
    }

    /**
     * This method is called when the application is resumed (brought back from background)
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(debugTag, "[onResume]");

    }

    /**
     * This method is called when the application is paused (put in background)
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(debugTag, "[onPause]");
    }

    /**
     * This method is called when the activity is destroyed
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(debugTag, "[onDestroy]");
    }

    public void displayItems(View view) {
        if(prod_list.getVisibility() == View.VISIBLE)
            prod_list.setVisibility(View.INVISIBLE);
        else
            prod_list.setVisibility(View.VISIBLE);

    }
}
