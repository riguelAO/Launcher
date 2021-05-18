package com.example.launcher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class music_gallery extends AppCompatActivity {

    private ImageButton ibPlay,ibNext,ibPrev,ibPause;
    private MediaPlayer mp;
    private double startTime=0;
    private double finalTime=0;
    private SeekBar seekbar;
    private TextView tvName;
    private int canciones[]={R.raw.apiadate,R.raw.blues,R.raw.feels,R.raw.lover,R.raw.stole};
    private String canc[]={"apiadate de mi - Victor Manuelle","the blues - Candyman", "feels - clavin harris","part time lover - stevie wonder","stole the show - kygo"};
    private int index=0;
    public static int oneTimeOnly =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_gallery);

        getSupportActionBar().setTitle("Music");

        ibPlay=(ImageButton)findViewById(R.id.ibPlay);
        ibPause=(ImageButton)findViewById(R.id.ibPause);
        ibNext=(ImageButton)findViewById(R.id.ibNext);
        ibPrev=(ImageButton)findViewById(R.id.ibPrev);
        tvName=(TextView)findViewById(R.id.tvName);

        tvName.setText(canc[index]);
        mp=MediaPlayer.create(this,R.raw.apiadate);
        seekbar =(SeekBar)findViewById(R.id.seekBar);


        ibPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Toast.makeText(music_gallery.this,"reproduciendo",Toast.LENGTH_SHORT).show();
                finalTime=mp.getDuration();
                startTime=mp.getCurrentPosition();
                if(oneTimeOnly==0){
                    seekbar.setMax((int) finalTime);
                    oneTimeOnly=1;
                }
            }
        });
        ibPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                Toast.makeText(music_gallery.this,"pausa",Toast.LENGTH_SHORT).show();
            }
        });
        ibNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index++;
                if (index>4)index=0;
                mp.stop();
                mp=MediaPlayer.create(getApplication(),canciones[index]);
                tvName.setText(canc[index]);
            }
        });
        ibPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index--;
                if (index<0)index=4;
                mp.stop();
                mp=MediaPlayer.create(getApplication(),canciones[index]);
                tvName.setText(canc[index]);
            }
        });


    }
}