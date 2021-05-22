package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {
int quantity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view){
        String priceMessage="$"+quantity*5;
        displayMessage(priceMessage);
//        display(quantity);
//        displayPrice(quantity*5);

    }
    private void displayPrice(int number){
        TextView priceTextView=(TextView)findViewById(R.id.order_summary_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void display(int number) {
        TextView quantityTextView=(TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(message);
    }
    public void decrement(View view) {
       // int quantity=1;
        if(quantity>0)
        quantity--;
        display(quantity);

    }

    public void increment(View view) {
      //  int quantity=3;
        quantity++;
        display(quantity);


    }
}