package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laptop88 on 12/11/2016.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    private int mColorsrcID;
    public WordAdapter(Context context, List<Word> objects,int ColorID){
                 //as this is not a single text . The adapter is not using the second argument
                 //so, it can be any value. Here, I used 0.
                 super(context,0,objects);
                mColorsrcID=ColorID;
             }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
    View listItemView = convertView;

    if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);
    }
    Word local_word = getItem(position);
    TextView miwokTextView = (TextView) listItemView.findViewById(R.id.txtMiwork);
    miwokTextView.setText(local_word.getMiworkTranslation());
    TextView defaultTextView = (TextView) listItemView.findViewById(R.id.txtdefault);
    defaultTextView.setText(local_word.getDefaultTranslation());
        ImageView defaultImage = (ImageView) listItemView.findViewById(R.id.imgshow);

        if(local_word.hasImage())
        {
        defaultImage.setImageResource(local_word.getDefaultImg());
        defaultImage.setVisibility(View.VISIBLE);
        }
     else
        defaultImage.setVisibility(View.GONE);
        View txtContainer =listItemView.findViewById(R.id.textcontainer);
        int color = ContextCompat.getColor(getContext(),mColorsrcID);
        txtContainer.setBackgroundColor(color);

        return listItemView;
    }
}