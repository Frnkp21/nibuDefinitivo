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

import com.example.socialpuig.databinding.FragmentBookPlayerBinding;
import com.example.socialpuig.databinding.FragmentOnlyMovieBinding;
import com.example.socialpuig.databinding.FragmentPartyChatBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class BookPlayerFragment extends Fragment {
    private FragmentBookPlayerBinding binding;

    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBookPlayerBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        BottomNavigationView bottomNavView = requireActivity().findViewById(R.id.nav_view);
        bottomNavView.setVisibility(View.GONE);

        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ImageButton gotopartychatButton = view.findViewById(R.id.partychat2);
        gotopartychatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.partyChatFragment);
            }
        });
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ImageButton backToHomeButton = view.findViewById(R.id.backtoback);
        backToHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.homeAllFragment);
            }
        });
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ImageButton shareplayButton = view.findViewById(R.id.readpary);
        shareplayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.watchpartyFragment);
            }
        });
    }
}