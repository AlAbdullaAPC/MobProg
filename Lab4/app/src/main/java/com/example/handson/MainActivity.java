package com.example.handson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        EditText x1 = findViewById(R.id.x1);
        EditText x2 = findViewById(R.id.x2);

        double a = Double.parseDouble(x1.getText().toString());
        double b = Double.parseDouble(x2.getText().toString());

        double sum = a + b;
        double diff = a - b;
        double prod = a * b;
        double quot = a / b;

        DecimalFormat format = new DecimalFormat("0.#");

        TextView sumRes = (TextView) findViewById(R.id.SumRes);
        TextView diffRes = (TextView) findViewById(R.id.DifRes);
        TextView prodRes = (TextView) findViewById(R.id.ProdRes);
        TextView quotRes = (TextView) findViewById(R.id.QuoRes);

        sumRes.setText("Sum\n" + format.format(sum));
        diffRes.setText("Difference\n" +format.format(diff));
        prodRes.setText("Product\n" + format.format(prod));
        quotRes.setText("Quotient\n" + format.format(quot));
    }
}