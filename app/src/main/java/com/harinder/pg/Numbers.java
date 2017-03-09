package com.harinder.pg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Numbers extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        t1= (TextView) findViewById(R.id.number);

        Bundle extras=getIntent().getExtras();
        t1.setText(extras.getString("key"));

        //added a comment

    }
}
