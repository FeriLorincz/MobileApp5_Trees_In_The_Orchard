package com.example.treesintheorchard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

//This class will be responsible for creating the view for each item and binding data to it

public class MyCustomAdapter extends ArrayAdapter<Orchard> {

    private ArrayList<Orchard> orchardsArrayList;
    Context context;

    //create constructor:
    public MyCustomAdapter(ArrayList<Orchard> orchardsArrayList, Context context) {
        super(context, R.layout.grid_item_layout, orchardsArrayList);
        this.orchardsArrayList = orchardsArrayList;
        this.context = context;
    }

    // create the View Holder: Used to cache references to the views within an item layout
    private static class MyViewHolder{
        TextView orchardName;
        ImageView orchardImg;
    }

    // create the GetView(): Used to create and return a view for a specific item in Grid.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // 1 Get the orchard object for the current position
        Orchard orchards = getItem(position);

        // 2 Inflating the Layout: check if the convertView is not null it means there is a view
        // that went off the screen and can be re-used = hept performance, avoiding unnecessary of
        // use inflations
        // If it is null, I need to inflate a new Layout for the item

        MyViewHolder myViewHolder;

        if (convertView == null) {

            // no view went off-screen --> Create a new view

            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.grid_item_layout, //the resourse of the XML layout file I want to inflate
                    parent,
                    false   // for False I can manually add later. If it is True,
                    // the inflate View becomes a part of the UI
            );

            // Finding the Views
            myViewHolder.orchardName = (TextView) convertView.findViewById(R.id.textView);
            myViewHolder.orchardImg = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(myViewHolder);

        } else {
            // a view went off-screen --> re-use it
            myViewHolder = (MyViewHolder) convertView.getTag();
        }

        // Getting the data from the model class (Orchard)

        myViewHolder.orchardName.setText(orchards.getOrchardName());
        myViewHolder.orchardImg.setImageResource(orchards.getOrchardImg());

        return convertView;
    }
}
