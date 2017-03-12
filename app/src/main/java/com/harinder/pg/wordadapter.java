package com.harinder.pg;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class wordadapter extends ArrayAdapter<word>{

    public wordadapter(Context context,ArrayList<word> objects) {
        super(context,0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.numbersample, parent, false);
        }

         word currentword = getItem(position);

        TextView numpunjabi = (TextView) listItemView.findViewById(R.id.numpun);
        TextView numenglish = (TextView) listItemView.findViewById(R.id.numeng);

        numpunjabi.setText(currentword.getPun());
        numenglish.setText(currentword.getEng());

        return listItemView;
    }
}
