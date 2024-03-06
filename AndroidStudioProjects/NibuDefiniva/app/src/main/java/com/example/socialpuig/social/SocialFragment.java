package com.example.socialpuig.social;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.socialpuig.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SocialFragment extends Fragment {
    private NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_social, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        BottomNavigationView bottomNavView = requireActivity().findViewById(R.id.nav_view);
        bottomNavView.setVisibility(View.VISIBLE);

        ImageButton notificationFriend = view.findViewById(R.id.notificationFriend);

        notificationFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.friend_noti_dialog, null);

                // Construye el AlertDialog con el diseño personalizado
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                // Crea el AlertDialog
                AlertDialog alertDialog = builder.create();

                // Muestra el diálogo
                alertDialog.show();
            }
        });

        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ConstraintLayout friend1Layout = view.findViewById(R.id.friend1);

        // Configurar OnClickListener para el ConstraintLayout friend1
        friend1Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragmento FriendChatFragment
                navController.navigate(R.id.friendChatFragment);
            }
        });
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ConstraintLayout friend2Layout = view.findViewById(R.id.friend2);

        // Configurar OnClickListener para el ConstraintLayout friend1
        friend2Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragmento FriendChatFragment
                navController.navigate(R.id.friendChatFragment);
            }
        });
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ConstraintLayout friend3Layout = view.findViewById(R.id.friend3);

        // Configurar OnClickListener para el ConstraintLayout friend1
        friend3Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragmento FriendChatFragment
                navController.navigate(R.id.friendChatFragment);
            }
        });
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ConstraintLayout friend4Layout = view.findViewById(R.id.friend4);

        // Configurar OnClickListener para el ConstraintLayout friend1
        friend4Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragmento FriendChatFragment
                navController.navigate(R.id.friendChatFragment);
            }
        });
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ConstraintLayout friend5Layout = view.findViewById(R.id.friend5);

        // Configurar OnClickListener para el ConstraintLayout friend1
        friend5Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragmento FriendChatFragment
                navController.navigate(R.id.friendChatFragment);
            }
        });
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ConstraintLayout friend6Layout = view.findViewById(R.id.friend6);

        // Configurar OnClickListener para el ConstraintLayout friend1
        friend6Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragmento FriendChatFragment
                navController.navigate(R.id.friendChatFragment);
            }
        });
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ConstraintLayout friend7Layout = view.findViewById(R.id.friend7);

        // Configurar OnClickListener para el ConstraintLayout friend1
        friend7Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragmento FriendChatFragment
                navController.navigate(R.id.friendChatFragment);
            }
        });
    }
}
