package com.example.iesataulfoargenta;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.iesataulfoargenta.R;
import com.example.iesataulfoargenta.databinding.FragmentEnsenanzasBinding;

public class EnsenanzasFragment extends Fragment {

    private FragmentEnsenanzasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentEnsenanzasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Creación de un objeto TextView, con un listener para detectar cuando lo pulsas y redirigirte a la URL indicada
        // Toast de aviso
        TextView ESO1 = root.findViewById(R.id.textESO1);
        ESO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), getResources().getString(R.string.Redirigiendo), Toast.LENGTH_SHORT).show();
                String url = "http://iesataulfoargenta.es/wp/2020/05/06/curriculo-de-1o-e-s-o/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                getActivity().startActivity(intent);

            }
        });

        // Creación de un objeto TextView, con un listener para detectar cuando lo pulsas y redirigirte a la URL indicada
        // Toast de aviso
        TextView ESO2 = root.findViewById(R.id.textESO2);
        ESO2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), getResources().getString(R.string.Redirigiendo), Toast.LENGTH_SHORT).show();

                String url = "http://iesataulfoargenta.es/wp/2020/05/06/curriculo-de-2o-e-s-o/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                getActivity().startActivity(intent);

            }
        });

        // Creación de un objeto TextView, con un listener para detectar cuando lo pulsas y redirigirte a la URL indicada
        // Toast de aviso
        TextView ESO3 = root.findViewById(R.id.textESO3);
        ESO3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), getResources().getString(R.string.Redirigiendo), Toast.LENGTH_SHORT).show();

                String url = "http://iesataulfoargenta.es/wp/2020/05/06/curriculo-de-3o-e-s-o/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                getActivity().startActivity(intent);

            }
        });

        // Creación de un objeto TextView, con un listener para detectar cuando lo pulsas y redirigirte a la URL indicada
        // Toast de aviso
        TextView ESO4 = root.findViewById(R.id.textESO4);
        ESO4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), getResources().getString(R.string.Redirigiendo), Toast.LENGTH_SHORT).show();

                String url = "http://iesataulfoargenta.es/wp/2020/05/06/curriculo-de-4o-e-s-o/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                getActivity().startActivity(intent);

            }
        });
        // Creación de un objeto TextView, con un listener para detectar cuando lo pulsas y redirigirte a la URL indicada
        // Toast de aviso
        TextView BACH1 = root.findViewById(R.id.textBachiller);
        BACH1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), getResources().getString(R.string.Redirigiendo), Toast.LENGTH_SHORT).show();

                String url = "http://iesataulfoargenta.es/wp/2020/05/06/curriculo-de-1o-bachillerato/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                getActivity().startActivity(intent);

            }
        });

        // Creación de un objeto TextView, con un listener para detectar cuando lo pulsas y redirigirte a la URL indicada
        // Toast de aviso
        TextView BACH2 = root.findViewById(R.id.textBach2);
        BACH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), getResources().getString(R.string.Redirigiendo), Toast.LENGTH_SHORT).show();

                String url = "http://iesataulfoargenta.es/wp/2020/05/06/curriculo-de-2o-bachillerato//";
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