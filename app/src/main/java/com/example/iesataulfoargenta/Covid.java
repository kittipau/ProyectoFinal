package com.example.iesataulfoargenta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Covid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid);

        // pone el logo en el icono del toolbar
        setSupportActionBar(findViewById(R.id.toolbar));
        getSupportActionBar().setIcon(R.drawable.logo);

        //Creo un toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        //Creo un escuchador en la imágen del lógo (objeto 1 de ese toolbar)
        toolbar.getChildAt(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //te lleva a la main activity (inicio)
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        // Creación de un objeto Button, con un listener para detectar cuando lo pulsas y redirigirte a la URL indicada
        // Toast de aviso
        Button vermas3 = findViewById(R.id.vermas3);
        vermas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.Redirigiendo), Toast.LENGTH_SHORT).show();
                String url = "http://iesataulfoargenta.es/wp/wp-content/uploads/2021/09/PLAN-DE-CONTINGENCIA-ANTE-LA-SITUACION-DE-ALERTA-SANITARIA-POR-LA-COVID-19.pdf";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        // Creación de un objeto Button, con un listener para detectar cuando lo pulsas y redirigirte a la URL indicada
        // Toast de aviso
        Button vermas4 = findViewById(R.id.vermas4);
        vermas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.Redirigiendo), Toast.LENGTH_SHORT).show();
                String url = "http://iesataulfoargenta.es/wp/2020/03/18/iniciativas/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}