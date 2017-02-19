package com.harinder.pg;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void numbers (View view)
  {
      Intent intent= new Intent(this,Numbers.class);
     intent.putExtra("key","Numbers Activity");
      startActivity(intent);

  }

    public void family (View view)
    {
        Intent intent= new Intent(this,Numbers.class);
        startActivity(intent);

    }

    public void colors (View view)
    {
        Intent intent= new Intent(this,Numbers.class);
        startActivity(intent);

    }

    public void phrases (View view)
    {
        Intent intent= new Intent(this,Numbers.class);
        startActivity(intent);

    }
}
