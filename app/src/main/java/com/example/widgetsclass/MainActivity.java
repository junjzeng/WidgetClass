package com.example.widgetsclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text1);
        EditText userNameInput = findViewById(R.id.userName);
        EditText passWordInput = findViewById(R.id.passWord);

        // Getting input from typing
        String userName = userNameInput.getText().toString();
        String passWord = passWordInput.getText().toString();

        //Log.v("Test1", "The User enters: " + userName);

        // Button
        Button ClickMeButton = findViewById(R.id.button);




        // Event
    }
}