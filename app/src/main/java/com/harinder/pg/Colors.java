package com.harinder.pg;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {


    ListView l1;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        l1= (ListView) findViewById(R.id.numlist);
        final int aud []={R.raw.hara,R.raw.lal,R.raw.nila};

        ArrayList<word> arr= new ArrayList<>();

        arr.add(new word("Hara","Green",R.drawable.color_green));
        arr.add(new word("Lal","Red",R.drawable.color_red));
        arr.add(new word("Nila","Blue",R.drawable.color_black));
        arr.add(new word("੩ - tinn","Three"));
        arr.add(new word("੪ - chā","Four"));
        arr.add(new word("੫ - punj","Five"));
        arr.add(new word("੬ - che","Six"));
        arr.add(new word("੭ - satt","Seven"));
        arr.add(new word("੮ - aṭh","Eight"));
        arr.add(new word("੯ - nauṃ","Nine"));


        wordadapter adapter= new wordadapter(this,arr,R.color.colorcolor);
        l1.setAdapter(adapter);

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(Colors.this,aud[i]);
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

}
