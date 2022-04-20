package com.example.appBiaf;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.appBiaf.databinding.FragmentHomeBinding;
import com.example.appBiaf.databinding.FragmentInicioSesionBinding;

import org.w3c.dom.Text;

public class InicioSesionFragment extends Fragment {





    private FragmentInicioSesionBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentInicioSesionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        TextView text = root.findViewById(R.id.textView2);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Crear fragmento de tu clase
                Fragment fragment = (InicioSesionFragment) getParentFragmentManager().findFragmentById(R.id.fragment_container_view_tag);
                // Obtener el administrador de fragmentos a través de la actividad
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                // Definir una transacción
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                // Remplazar el contenido principal por el fragmento
                fragmentTransaction.replace(R.id.fragment_container_view_tag, fragment);
                fragmentTransaction.addToBackStack(null);
                // Cambiar
                fragmentTransaction.commit();
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