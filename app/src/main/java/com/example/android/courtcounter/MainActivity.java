package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int ptCounterA = 0;
    int ptCounterB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void threePointerA(View view) {
        /*String priceMsg = "Total: " + (quantity*5) + "$" + "\n" + "Thank you!";*/
        ptCounterA = ptCounterA + 3;
        displayA(ptCounterA);
    }

    public void twoPointerA(View view) {
        ptCounterA = ptCounterA + 2;
        displayA(ptCounterA);
    }

    public void foulCounterA(View view) {
        ptCounterA=ptCounterA+1;
        displayA(ptCounterA);
    }

    public void threePointerB(View view) {
        /*String priceMsg = "Total: " + (quantity*5) + "$" + "\n" + "Thank you!";*/
        ptCounterB = ptCounterB + 3;
        displayB(ptCounterB);
    }

    public void twoPointerB(View view) {
        ptCounterB = ptCounterB + 2;
        displayB(ptCounterB);
    }

    public void foulCounterB(View view) {
        ptCounterB=ptCounterB+1;
        displayB(ptCounterB);
    }

    public void reset(View view) {
        ptCounterA=0;
        ptCounterB=0;
        displayA(ptCounterA);
        displayB(ptCounterB);
    }

    /**
     * This method displays the given price on the screen.

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
     */

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.ptCounterA);
        quantityTextView.setText("" + number);
    }

    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.ptCounterB);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
     */

}
