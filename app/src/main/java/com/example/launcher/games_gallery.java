package com.example.launcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class games_gallery extends AppCompatActivity {

    Button btnAtras1;
    ImageButton ibChrome,ibBike,ibFace,ibSteam,ibHbo,ibIg,ibPou,ibGeometry,ibSpotify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_gallery);

        getSupportActionBar().setTitle("Games");

        btnAtras1=(Button)findViewById(R.id.btnAtras1);

        ibChrome=(ImageButton)findViewById(R.id.ibChrome);
        ibBike=(ImageButton)findViewById(R.id.ibBike);
        ibFace=(ImageButton)findViewById(R.id.ibFace);
        ibSteam=(ImageButton)findViewById(R.id.ibSteam);
        ibHbo=(ImageButton)findViewById(R.id.ibHbo);
        ibIg=(ImageButton)findViewById(R.id.ibIg);
        ibPou=(ImageButton)findViewById(R.id.ibPou);
        ibGeometry=(ImageButton)findViewById(R.id.ibGeometry);
        ibSpotify=(ImageButton)findViewById(R.id.ibSpotify);

        ibChrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri google = Uri.parse("http://www.google.com");
                Intent intent=new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
                Toast.makeText(games_gallery.this,"abriendo navegador",Toast.LENGTH_SHORT).show();
            }
        });
        ibBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bike=getPackageManager().getLaunchIntentForPackage("com.topfreegames.bikeracefreeworld");
                startActivity(bike);
                Toast.makeText(games_gallery.this,"abriendo bike race",Toast.LENGTH_SHORT).show();
            }
        });
        ibFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebook=getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(facebook);
                Toast.makeText(games_gallery.this,"abriendo faceBook",Toast.LENGTH_SHORT).show();
            }
        });
        ibSteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent steam=getPackageManager().getLaunchIntentForPackage("com.valvesoftware.android.steam.community");
                startActivity(steam);
                Toast.makeText(games_gallery.this,"abriendo Steam",Toast.LENGTH_SHORT).show();
            }
        });
        ibHbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hbo=getPackageManager().getLaunchIntentForPackage("com.hbo.broadband");
                startActivity(hbo);
                Toast.makeText(games_gallery.this,"abriendo HBO",Toast.LENGTH_SHORT).show();
            }
        });
        ibIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instagram=getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(instagram);
                Toast.makeText(games_gallery.this,"abriendo Instagram",Toast.LENGTH_SHORT).show();
            }
        });
        ibPou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pou=getPackageManager().getLaunchIntentForPackage("me.pou.app");
                startActivity(pou);
                Toast.makeText(games_gallery.this,"abriendo Pou",Toast.LENGTH_SHORT).show();
            }
        });
        ibGeometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geometry=getPackageManager().getLaunchIntentForPackage("com.robtopx.geometryjumplite");
                startActivity(geometry);
                Toast.makeText(games_gallery.this,"abriendo Geometry Dash Free",Toast.LENGTH_SHORT).show();
            }
        });
        ibSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spotify=getPackageManager().getLaunchIntentForPackage("com.spotify.music");
                startActivity(spotify);
                Toast.makeText(games_gallery.this,"abriendo Spotify",Toast.LENGTH_SHORT).show();
            }
        });
        btnAtras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(games_gallery.this,Menu.class);
                startActivity(intent);
            }
        });
    }
}