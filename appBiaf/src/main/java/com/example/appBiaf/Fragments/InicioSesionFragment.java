package com.example.appBiaf.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.appBiaf.R;
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

                NavController navController = Navigation.findNavController(view);
                navController.navigate(R.id.action_nav_iniciosesion_to_nav_registro);
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