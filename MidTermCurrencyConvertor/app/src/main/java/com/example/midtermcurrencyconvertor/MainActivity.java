package com.example.midtermcurrencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button convert;
    EditText dollars;
    EditText comorians;
    TextView francs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         convert = findViewById(R.id.convert);
         dollars = findViewById(R.id.dollars);
         comorians = findViewById(R.id.comorian_francs);
         francs = findViewById(R.id.francs_text);
    }

    public void convertCurrency(View view) {

        String money = dollars.getText().toString();
        Double uCurrency = Double.parseDouble(money);
        Double result = (double) uCurrency * 329.36;

        String conResult = result.toString();

        comorians.setText( conResult);
   }
}
