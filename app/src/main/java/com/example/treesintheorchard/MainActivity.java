package com.example.treesintheorchard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1. AdapterView: GridView, in this case
   GridView gridView;

   // 2. Data Source: ArrayList<Orchard>
    ArrayList<Orchard> orchardArrayList;

    // 3. Adapter: MyCustomAdapter

    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       gridView = findViewById(R.id.gridView);
       orchardArrayList = new ArrayList<>();

       Orchard o1 = new Orchard(R.drawable.traditionaltransparent, "Traditional");
       Orchard o2 = new Orchard(R.drawable.intensivtransparent, "Intensive");
       Orchard o3 = new Orchard(R.drawable.superintensivtransparent, "Super Intensive");
       Orchard o4 = new Orchard(R.drawable.personalizattransparent, "Personalized");

       orchardArrayList.add(o1);
       orchardArrayList.add(o2);
       orchardArrayList.add(o3);
       orchardArrayList.add(o4);

       adapter = new MyCustomAdapter(orchardArrayList, getApplicationContext());

       gridView.setAdapter(adapter);
       gridView.setNumColumns(2);

       gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent i = new Intent(getApplicationContext(), Traditional.class);
               startActivity(i);


           }
       });

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), Intensiv.class);
                startActivity(i);


            }
        });

//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent i = new Intent(getApplicationContext(), SuperIntensiv.class);
//                startActivity(i);
//
//
//            }
//        });

//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent i = new Intent(getApplicationContext(), Personalized.class);
//                startActivity(i);
//
//
//            }
//        });


    }
}