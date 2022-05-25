package com.example.appBiaf.Fragments;

import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.appBiaf.Cliente;
import com.example.appBiaf.R;
import com.example.appBiaf.databinding.FragmentDisenadorBinding;

import pojos.Participante;


public class DisenadorFragment extends Fragment {

    View imagen;
    TextView nombre, descripcion;
    Participante p;
    private FragmentDisenadorBinding binding;
    String user;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDisenadorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        nombre =root.findViewById(R.id.textDisenador);
        imagen = root.findViewById(R.id.imageDisenador);
        descripcion = root.findViewById(R.id.textDescDisenador);

        p = new Participante();
        p.setNombreDisenador("kitti");
        Cliente cliente = new Cliente();
        cliente.setOpcion("3");
        cliente.setParticipante(p);
        cliente.start();




        return root;


    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}