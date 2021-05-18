package com.example.launcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class library_gallery extends AppCompatActivity {

    ImageButton ibLibro1,ibLibro2,ibLibro3,ibLibro4,ibLibro5;
    Button btnAtras;

    String ibLibro1URL="https://xperimentalhamid.com/es/novel/webnovel/millionaire-son-in-law-complete-chapter-links/?dynamic";
    String ibLibro2URL="http://www.congreso.gob.pe/Docs/files/documentos/constitucionparte1993-12-09-2017.pdf";
    String ibLibro3URL="https://novelasligeras.net/index.php/producto/no-game-no-life-novela-ligera/";
    String ibLibro4URL="https://lectormanga.com/library/manga/5763/nisekoi";
    String ibLibro5URL="http://www.ataun.eus/BIBLIOTECAGRATUITA/Cl%C3%A1sicos%20en%20Espa%C3%B1ol/Dante%20Alighieri/Divina%20Comedia.pdf";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_gallery);

        getSupportActionBar().setTitle("Library");

        ibLibro1=(ImageButton)findViewById(R.id.ibLibro1);
        ibLibro2=(ImageButton)findViewById(R.id.ibLibro2);
        ibLibro3=(ImageButton)findViewById(R.id.ibLibro3);
        ibLibro4=(ImageButton)findViewById(R.id.ibLibro4);
        ibLibro5=(ImageButton)findViewById(R.id.ibLibro5);

        btnAtras=(Button)findViewById(R.id.btnAtras);

        ibLibro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(ibLibro1URL));
                startActivity(intent);
            }
        });
        ibLibro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(ibLibro2URL));
                startActivity(intent);
            }
        });
        ibLibro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(ibLibro3URL));
                startActivity(intent);
            }
        });
        ibLibro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(ibLibro4URL));
                startActivity(intent);
            }
        });
        ibLibro5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(ibLibro5URL));
                startActivity(intent);
            }
        });
        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(library_gallery.this,Menu.class);
                startActivity(intent);
            }
        });
    }
}