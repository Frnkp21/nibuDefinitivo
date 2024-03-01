package com.example.socialpuig.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialpuig.R;
import com.example.socialpuig.databinding.FragmentHomeAllBinding;
import com.example.socialpuig.databinding.FragmentHomeRealBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomeRealFragment extends Fragment {
    private FragmentHomeRealBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeRealBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Configurar BottomNavigationView
        BottomNavigationView navView = view.findViewById(R.id.nav_view); // Cambia a esta línea
        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.socialFragment, R.id.savedFragment, R.id.homeAllFragment, R.id.rankingFragment, R.id.moreFragment
        ).build();
        NavigationUI.setupActionBarWithNavController((AppCompatActivity) requireActivity(), navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }


}