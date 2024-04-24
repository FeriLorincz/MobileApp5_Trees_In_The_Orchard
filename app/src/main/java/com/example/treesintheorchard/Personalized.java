package com.example.treesintheorchard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Personalized extends AppCompatActivity {

    TextView title4, textDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalized);


        title4 = findViewById(R.id.textView10);
        textDescription = findViewById(R.id.textView11);


    }
}