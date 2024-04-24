package com.example.treesintheorchard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Intensiv extends AppCompatActivity {
    EditText area2;
    TextView title2, result2;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intensiv);

        area2 = findViewById(R.id.editText_intensiv);
        title2 = findViewById(R.id.textView4);
        result2 = findViewById(R.id.textView5);
        btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberTrees2 = area2.getText().toString();
                double numberInteger2 = Double.parseDouble(numberTrees2);
                double numberFinal2 = numberInteger2*0.0233;
                int integer2 = (int)Math.round(numberFinal2);


                result2.setText("You can plant the maximum " + integer2 + " trees");
            }
        });

    }

}