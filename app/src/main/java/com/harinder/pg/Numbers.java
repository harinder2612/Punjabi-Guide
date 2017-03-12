package com.harinder.pg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    ListView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        l1= (ListView) findViewById(R.id.numlist);


        ArrayList<word> arr= new ArrayList<>();

        arr.add(new word("੧ - ikk","One",R.drawable.one));
        arr.add(new word("੨ - do","Two",R.drawable.two));
        arr.add(new word("੩ - tinn","Three",R.drawable.three));
        arr.add(new word("੪ - chā","Four",R.drawable.four));
        arr.add(new word("੫ - punj","Five",R.drawable.five));
        arr.add(new word("੬ - che","Six",R.drawable.six));
        arr.add(new word("੭ - satt","Seven",R.drawable.seven));
        arr.add(new word("੮ - aṭh","Eight",R.drawable.eight));
        arr.add(new word("੯ - nauṃ","Nine",R.drawable.nine));


        wordadapter adapter= new wordadapter(this,arr,R.color.colornumbers);
        l1.setAdapter(adapter);
    }
}
