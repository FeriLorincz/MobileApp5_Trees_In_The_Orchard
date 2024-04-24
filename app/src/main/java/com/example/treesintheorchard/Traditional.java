package com.example.treesintheorchard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Traditional extends AppCompatActivity {

EditText area;
TextView title, result;
Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traditional);

    area = findViewById(R.id.editText_traditional);
    title = findViewById(R.id.textView2);
    result = findViewById(R.id.textView3);
    btn = findViewById(R.id.btn1);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String numberTrees = area.getText().toString();
            int numberInteger = Integer.parseInt(numberTrees);
            int numberFinal = numberInteger/100;
            result.setText("You can plant the maximum " + numberFinal + " trees");
        }
    });

    }
}