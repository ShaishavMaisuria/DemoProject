package com.example.demoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("demo","onCreate");


        TextView textView = findViewById(R.id.textViewTop);

        textView.setText("Hello World");

        EditText editText =findViewById(R.id.editTextEntry);
        editText.setText("This is an Example Text");
        Toast.makeText(this, "Testing Toast", Toast.LENGTH_LONG).show();

    }
}