package com.example.iesataulfoargenta;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.iesataulfoargenta.R;
import com.example.iesataulfoargenta.databinding.FragmentContactoBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ContactoFragment extends Fragment implements OnMapReadyCallback {



    private FragmentContactoBinding binding;
    private GoogleMap mapa;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        binding = FragmentContactoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        //Crea el mapFragment y notifica cuando ésta listo para usar el mapa.
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);

        // Creación de un objeto ImageButton, con un listener para detectar cuando lo pulsas y preparar una llamada
        ImageButton llamar = root.findViewById(R.id.llamar);
        llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL); //ACTION_DIAL(abre la app de llamadas)
                intent.setData(Uri.parse("tel:942860637")); //indico el tlfn que tiene que marcar
                getActivity().startActivity(intent); //lanza la actividad
            }
        });

        // Creacion de un objeto ImageButton, con un listener para detectar cuando lo pulsas y preparar un mail
        //
        ImageButton email = root.findViewById(R.id.mandaremail);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO); //ACTION_SENDTO(abre la app de emails)
                intent.setData(Uri.parse("mailto:ies.ataulfo.argenta@educantabria.es")); //indico el mail de destino
                getActivity().startActivity(intent); //lanza la actividad
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    //Mapa: poner el marcador con la direccion
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapa = googleMap;

        // Add a marker in Castro Urdiales and move the camera
        LatLng iES = new LatLng(43.379, -3.217);
        mapa.addMarker(new MarkerOptions().position(iES).title("IES Ataulfo Argenta"));
        mapa.moveCamera(CameraUpdateFactory.newLatLng(iES));
        mapa.setMinZoomPreference(13);

    }
}