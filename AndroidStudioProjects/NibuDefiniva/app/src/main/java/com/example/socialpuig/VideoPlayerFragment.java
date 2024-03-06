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
import android.widget.ImageButton;

import com.example.socialpuig.databinding.FragmentVideoPlayerBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class VideoPlayerFragment extends Fragment {
    private FragmentVideoPlayerBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentVideoPlayerBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Buscar el BottomNavigationView en la actividad principal
        BottomNavigationView bottomNavView = requireActivity().findViewById(R.id.nav_view);

        // Verificar si el BottomNavigationView no es nulo antes de cambiar la visibilidad
        if (bottomNavView != null) {
            bottomNavView.setVisibility(View.GONE);
        }

        // Encontrar el NavController para la navegación
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        // Configurar el botón para cerrar el video
        ImageButton closevideoButton = view.findViewById(R.id.closeVideo);
        closevideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.homeAllFragment);
            }
        });

        // Configurar el botón para abrir el chat
        ImageButton chatopenButton = view.findViewById(R.id.partychat3);
        chatopenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.partyChat2Fragment);
            }
        });
    }
}
