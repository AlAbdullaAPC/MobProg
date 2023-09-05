package com.example.handson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        TextView text = (TextView) findViewById(R.id.message);
        EditText inputField = findViewById(R.id.inputText);
        String inputString = inputField.getText().toString();

        text.setText("Welcome! " + inputString);
    }
}