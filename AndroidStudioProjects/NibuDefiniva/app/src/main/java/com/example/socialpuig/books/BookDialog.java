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

public class BookDialog extends AlertDialog {
    private String imageUrl;
    private String title;
    private int pageCount;
    private NavController navController;

    public BookDialog(Context context, String imageUrl, String title, int pageCount, NavController navController) {
        super(context);
        this.imageUrl = imageUrl;
        this.title = title;
        this.pageCount = pageCount;
        this.navController = navController;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_dialog);

        // Inicializar vistas
        ImageView img = findViewById(R.id.img);
        TextView titulo = findViewById(R.id.titulo);
        TextView sinopsis = findViewById(R.id.sinopsis);
        ImageButton read2Button = findViewById(R.id.read2Button);

        // Configurar datos en las vistas
        Glide.with(getContext()).load(imageUrl).into(img);
        titulo.setText(title);
        sinopsis.setText("Número de páginas: " + pageCount);

        // Configurar OnClickListener para el botón de lectura
        read2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.bookPlayerFragment);
                dismiss(); // Cerrar el diálogo después de iniciar la transición al otro fragmento
            }
        });
    }
}
