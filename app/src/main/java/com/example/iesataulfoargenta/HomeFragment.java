package com.example.iesataulfoargenta;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.iesataulfoargenta.Covid;
import com.example.iesataulfoargenta.R;
import com.example.iesataulfoargenta.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        //Añadir root por ser fragment
        // Creación de un objeto Button, con un listener para detectar cuando lo pulsas y llevarte a la activity covid
        // Toast de aviso

        Button covid = root.findViewById(R.id.ButtonCovid);
        covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Covid.class);
                startActivity(intent);
            }
        });

        // Creación de un objeto TextView, con un listener para detectar cuando lo pulsas y redirigirte a la URL indicada
        // Toast de aviso

        Button vermas = root.findViewById(R.id.button2);
        vermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), getResources().getString(R.string.Redirigiendo), Toast.LENGTH_SHORT).show();
                String url = "http://iesataulfoargenta.es/wp/2021/11/08/charlas-y-talleres-online-del-programa-cibercooperantes-de-incibe/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                getActivity().startActivity(intent);
            }
        });

        // Creación de un objeto TextView, con un listener para detectar cuando lo pulsas y redirigirte a la URL indicada
        // Toast de aviso
        Button vermas1 = root.findViewById(R.id.button3);
        vermas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), getResources().getString(R.string.Redirigiendo), Toast.LENGTH_SHORT).show();
                String url = "http://iesataulfoargenta.es/wp/2021/10/28/halloween-en-la-biblioteca-del-ies-ataulfo-argenta/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                getActivity().startActivity(intent);
            }
        });


        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}