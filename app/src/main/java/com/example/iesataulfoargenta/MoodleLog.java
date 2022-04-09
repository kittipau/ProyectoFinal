package com.example.iesataulfoargenta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MoodleLog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodle_log);


        // pone el logo en el icono del toolbar
        setSupportActionBar(findViewById(R.id.toolbar));
        getSupportActionBar().setIcon(R.drawable.logo);

        //Creo un toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        //Creo un escuchador en la imágen del logo (objeto 1 de ese toolbar)
        toolbar.getChildAt(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //te lleva a la main activity ( inicio)
                startActivity(intent);
            }
        });
        ;
    }
}