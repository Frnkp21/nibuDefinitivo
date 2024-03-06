package com.example.socialpuig.movies;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.bumptech.glide.Glide;
import com.example.socialpuig.R;

public class MovieInfoDialog extends Dialog {

    private String imageUrl;
    private String title;
    private String synopsis;
    private NavController navController;

    public MovieInfoDialog(Context context, String imageUrl, String title, String synopsis, NavController navController) {
        super(context);
        this.imageUrl = imageUrl;
        this.title = title;
        this.synopsis = synopsis;
        this.navController = navController;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_movie_info);

        ImageView movieImageView = findViewById(R.id.movieImageView);
        TextView movieTitleTextView = findViewById(R.id.movieTitleTextView);
        TextView movieSynopsisTextView = findViewById(R.id.movieSynopsisTextView);
        ImageButton playButton = findViewById(R.id.playButton);

        movieTitleTextView.setText(title);
        movieSynopsisTextView.setText(synopsis);

        // Cargar la imagen utilizando Glide
        Glide.with(getContext()).load(imageUrl).into(movieImageView);

        // Configurar OnClickListener para el botón
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.videoPlayerFragment);
                dismiss(); // Cerrar el diálogo después de iniciar la transición al otro fragmento
            }
        });
    }
}
