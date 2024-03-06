package com.example.socialpuig;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.socialpuig.books.Book;
import com.example.socialpuig.books.BookAdapter;
import com.example.socialpuig.books.BookDataSource;
import com.example.socialpuig.databinding.FragmentHomeAllBinding;
import com.example.socialpuig.databinding.FragmentOnlyBookBinding;

import java.util.List;

public class OnlyBookFragment extends Fragment {

    private FragmentOnlyBookBinding binding;

    private RecyclerView recyclerViewBooks;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOnlyBookBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener una referencia al NavController
        final NavController navController = Navigation.findNavController(view);
        recyclerViewBooks = binding.recyclerViewBook;
        loadBookList();
        // Configurar el clic del botón homeButon
        view.findViewById(R.id.all3Buton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar de vuelta al HomeAllFragment
                navController.navigate(R.id.homeAllFragment);
            }
        });
        view.findViewById(R.id.moviesButon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar de vuelta al HomeAllFragment
                navController.navigate(R.id.onlyMovieFragment);
            }
        });
        view.findViewById(R.id.seriesButon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar de vuelta al HomeAllFragment
                navController.navigate(R.id.onlySeriesFragment);
            }
        });

        ImageView b1images = view.findViewById(R.id.books1);
        b1images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView b2images = view.findViewById(R.id.books2);
        b2images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView b3images = view.findViewById(R.id.books3);
        b3images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView b4images = view.findViewById(R.id.books4);
        b4images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView b5images = view.findViewById(R.id.books5);
        b5images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView bm1images = view.findViewById(R.id.booksM1);
        bm1images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView bm2images = view.findViewById(R.id.booksM2);
        bm2images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView bm3images = view.findViewById(R.id.booksM3);
        bm3images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView bm4images = view.findViewById(R.id.booksM4);
        bm4images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView bm5images = view.findViewById(R.id.booksM5);
        bm5images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });


        ImageView bD1images = view.findViewById(R.id.booksD1);
        bD1images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView bD2images = view.findViewById(R.id.booksD2);
        bD2images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView bD3images = view.findViewById(R.id.booksD3);
        bD3images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView bD4images = view.findViewById(R.id.booksD4);
        bD4images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView bD5images = view.findViewById(R.id.booksD5);
        bD5images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.book_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
    }
    private void loadBookList() {
        List<Book> bookList = BookDataSource.getBookList();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewBooks.setLayoutManager(layoutManager);
        BookAdapter adapter = new BookAdapter(bookList);
        recyclerViewBooks.setAdapter(adapter);
    }
}