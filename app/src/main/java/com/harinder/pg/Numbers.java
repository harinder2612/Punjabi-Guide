package com.harinder.pg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    ListView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        l1= (ListView) findViewById(R.id.numlist);

        ArrayList<word> arr= new ArrayList<>();

        arr.add(new word("੧","One"));
        arr.add(new word("੨","Two"));
        arr.add(new word("੩","Three"));
        arr.add(new word("੪","Four"));

        wordadapter adapter= new wordadapter(this,arr);
        l1.setAdapter(adapter);
    }
}
