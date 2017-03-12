package com.harinder.pg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {


    ListView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        l1= (ListView) findViewById(R.id.numlist);

        ArrayList<word> arr= new ArrayList<>();

        arr.add(new word("Family Members","Zero"));
        arr.add(new word("੧ - ikk","One"));
        arr.add(new word("੨ - do","Two"));
        arr.add(new word("੩ - tinn","Three"));
        arr.add(new word("੪ - chā","Four"));
        arr.add(new word("੫ - punj","Five"));
        arr.add(new word("੬ - che","Six"));
        arr.add(new word("੭ - satt","Seven"));
        arr.add(new word("੮ - aṭh","Eight"));
        arr.add(new word("੯ - nauṃ","Nine"));


        wordadapter adapter= new wordadapter(this,arr,R.color.colorfamily);
        l1.setAdapter(adapter);
    }
}
