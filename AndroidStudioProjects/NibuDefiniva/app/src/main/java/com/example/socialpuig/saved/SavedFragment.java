package com.example.socialpuig.saved;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.socialpuig.R;


public class SavedFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saved, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView savedimages = view.findViewById(R.id.saved1);
        savedimages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.movie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView saved2images = view.findViewById(R.id.saved2);
        saved2images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.movie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView saved3images = view.findViewById(R.id.saved3);
        saved3images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.movie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView saved4images = view.findViewById(R.id.saved4);
        saved4images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.movie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView saved5images = view.findViewById(R.id.saved5);
        saved5images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.movie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView saved6images = view.findViewById(R.id.saved6);
        saved6images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.movie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView saved7images = view.findViewById(R.id.saved7);
        saved7images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.movie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView saved8images = view.findViewById(R.id.saved8);
        saved8images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.movie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView saved9images = view.findViewById(R.id.saved9);
        saved9images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.movie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
    }
}