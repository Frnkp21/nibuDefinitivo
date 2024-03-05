package com.example.socialpuig;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MovieInfoDialog extends Dialog {

    private String imageUrl;
    private String title;
    private String synopsis;

    public MovieInfoDialog(Context context, String imageUrl, String title, String synopsis) {
        super(context);
        this.imageUrl = imageUrl;
        this.title = title;
        this.synopsis = synopsis;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_movie_info);

        ImageView movieImageView = findViewById(R.id.movieImageView);
        TextView movieTitleTextView = findViewById(R.id.movieTitleTextView);
        TextView movieSynopsisTextView = findViewById(R.id.movieSynopsisTextView);

        movieTitleTextView.setText(title);
        movieSynopsisTextView.setText(synopsis);

        // Cargar la imagen utilizando Glide
        Glide.with(getContext()).load(imageUrl).into(movieImageView);
    }
}
