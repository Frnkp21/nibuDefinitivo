package com.example.socialpuig.social;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.socialpuig.R;
import com.example.socialpuig.databinding.FragmentSocialBinding;


public class SocialFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_social, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

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

    }
}