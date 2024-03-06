package com.example.socialpuig.books;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.navigation.NavController;

import com.bumptech.glide.Glide;
import com.example.socialpuig.R;

public class BookInfoDialog extends AlertDialog {
    private String imageUrl;
    private String title;
    private int pageCount;
    private NavController navController;

    public BookInfoDialog(Context context, String imageUrl, String title, int pageCount, NavController navController) {
        super(context);
        this.imageUrl = imageUrl;
        this.title = title;
        this.pageCount = pageCount;
        this.navController = navController;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_book_info);

        ImageView bookImageView = findViewById(R.id.bookImageView);
        TextView bookTitleTextView = findViewById(R.id.bookTitleTextView);
        TextView bookPageCountTextView = findViewById(R.id.bookPageCountTextView);
        ImageButton readButton = findViewById(R.id.readButton);


        bookTitleTextView.setText(title);
        bookPageCountTextView.setText(String.valueOf(pageCount));

        // Cargar la imagen utilizando Glide
        Glide.with(getContext()).load(imageUrl).into(bookImageView);
        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.bookPlayerFragment);
                dismiss(); // Cerrar el diálogo después de iniciar la transición al otro fragmento
            }
        });
    }
}
