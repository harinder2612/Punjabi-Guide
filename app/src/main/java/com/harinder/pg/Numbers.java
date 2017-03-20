package com.harinder.pg;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    ListView l1;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

         final int aud []={R.raw.pgr,R.raw.two,R.raw.tin,R.raw.cha};

        l1= (ListView) findViewById(R.id.numlist);

        ArrayList<word> arr= new ArrayList<>();

        arr.add(new word("੧ - ikk","One",R.drawable.one));
        arr.add(new word("੨ - do","two",R.drawable.two));
        arr.add(new word("੩ - tinn","Three",R.drawable.three));
        arr.add(new word("੪ - chā","Four",R.drawable.four));
        arr.add(new word("੫ - punj","Five",R.drawable.five));
        arr.add(new word("੬ - che","Six",R.drawable.six));
        arr.add(new word("੭ - satt","Seven",R.drawable.seven));
        arr.add(new word("੮ - aṭh","Eight",R.drawable.eight));
        arr.add(new word("੯ - nauṃ","Nine",R.drawable.nine));


        wordadapter adapter= new wordadapter(this,arr,R.color.colornumbers);
        l1.setAdapter(adapter);

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(Numbers.this,aud[i]);
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                       releaseMediaPlayer();
                    }
                });
            }
        });
    }


    private void releaseMediaPlayer() {

        if (mediaPlayer != null)
        {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

  @Override
    protected void onPause ()
  {    super.onPause();
      releaseMediaPlayer();
  }
}
