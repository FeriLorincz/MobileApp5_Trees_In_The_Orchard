package com.example.treesintheorchard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SuperIntensiv extends AppCompatActivity {

    EditText area3;
    TextView title3, result3;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_intensiv);

        area3 = findViewById(R.id.editText_superintensiv);
        title3 = findViewById(R.id.textView6);
        result3 = findViewById(R.id.textView7);
        btn3 = findViewById(R.id.btn3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberTrees3 = area3.getText().toString();
                double numberInteger3 = Double.parseDouble(numberTrees3);
                double numberFinal3 = numberInteger3*0.112;
                int integer3 = (int)Math.round(numberFinal3);

                result3.setText("You can plant the maximum " + integer3 + " trees");
            }
        });

    }
}