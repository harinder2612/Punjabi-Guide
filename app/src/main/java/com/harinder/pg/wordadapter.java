package com.harinder.pg;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class wordadapter extends ArrayAdapter<word>{

    private int colorid;

    public wordadapter(Context context,ArrayList<word> objects, int color) {
        super(context,0, objects);
    colorid=color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

         word currentword = getItem(position);

        TextView numpunjabi = (TextView) listItemView.findViewById(R.id.numpun);
        TextView numenglish = (TextView) listItemView.findViewById(R.id.numeng);
        ImageView img = (ImageView) listItemView.findViewById(R.id.refimg);
        numpunjabi.setText(currentword.getPun());
        numenglish.setText(currentword.getEng());

        if(currentword.hasimage())
        {
            img.setImageResource(currentword.getImgid());
            img.setVisibility(View.VISIBLE);
        }
        else {
            img.setVisibility(View.GONE);
        }

        View textcontainer= listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),colorid);
        textcontainer.setBackgroundColor(color);

        return listItemView;
    }
}
