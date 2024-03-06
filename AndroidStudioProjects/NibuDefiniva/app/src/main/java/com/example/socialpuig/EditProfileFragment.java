package com.example.socialpuig;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.socialpuig.databinding.FragmentBookPlayerBinding;
import com.example.socialpuig.databinding.FragmentEditProfileBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class EditProfileFragment extends Fragment {
    private FragmentEditProfileBinding binding;

    private NavController navController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEditProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        BottomNavigationView bottomNavView = requireActivity().findViewById(R.id.nav_view);
        bottomNavView.setVisibility(View.GONE);

        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        Button confirmButton = view.findViewById(R.id.confirmar);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navega al fragmento deseado cuando se presiona el botón
                navController.navigate(R.id.moreFragment);
            }
        });

        ImageButton salirButton = view.findViewById(R.id.patras);
        salirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navega al fragmento deseado cuando se presiona el botón
                navController.navigate(R.id.moreFragment);
            }
        });
    }
}