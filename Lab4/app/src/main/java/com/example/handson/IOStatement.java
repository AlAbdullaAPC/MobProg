package com.example.handson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class IOStatement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iostatement);
    }

    public void onClick(View view)
    {
        TextView result = findViewById(R.id.tv);
        EditText input = findViewById(R.id.inputTxt);

        result.setText("Hello! "+input.getText().toString());
    }

    public void clearBtn(View view)
    {
        TextView result = findViewById(R.id.tv);
        EditText input = findViewById(R.id.inputTxt);

        result.setText("Enter your Name");
        input.setText("Name");
    }
}