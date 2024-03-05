package com.example.socialpuig.home;

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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.socialpuig.R;
import com.example.socialpuig.books.Book;
import com.example.socialpuig.books.BookAdapter;
import com.example.socialpuig.books.BookDataSource;
import com.example.socialpuig.continueW.ContinueW;
import com.example.socialpuig.continueW.ContinueWAdapter;
import com.example.socialpuig.continueW.ContinueWDataSource;
import com.example.socialpuig.databinding.FragmentHomeAllBinding;
import com.example.socialpuig.movies.Movie;
import com.example.socialpuig.movies.MovieAdapter;
import com.example.socialpuig.movies.MovieDataSource;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class HomeAllFragment extends Fragment {

    private FragmentHomeAllBinding binding;
   // private RecyclerView recyclerViewMovies;
    private RecyclerView recyclerViewBooks;
    private RecyclerView recyclerViewContinueW;
   NavController navController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeAllBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        // Oculta el BottomNavigationView
        BottomNavigationView bottomNavView = requireActivity().findViewById(R.id.nav_view);
        bottomNavView.setVisibility(View.VISIBLE);

       // recyclerViewMovies = binding.recyclerViewMovie;
        recyclerViewBooks = binding.recyclerViewBook;
        recyclerViewContinueW = binding.recyclerViewContinueW;
        //loadMovieList();
        loadBookList();
        loadContinueWList();
        Button moviesButton = view.findViewById(R.id.moviesButon);
        // Dentro del método onViewCreated del fragmento HomeAllFragment
        moviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navega al fragmento deseado cuando se presiona el botón
                navController.navigate(R.id.onlyMovieFragment);
            }
        });
        Button seriesButton = view.findViewById(R.id.seriesButon);
        seriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navega al fragmento deseado cuando se presiona el botón
                navController.navigate(R.id.onlySeriesFragment);
            }
        });
        Button booksButton = view.findViewById(R.id.booksButon);
        booksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navega al fragmento deseado cuando se presiona el botón
                navController.navigate(R.id.onlyBookFragment);
            }
        });

    }

    /*private void loadMovieList() {
        List<Movie> movieList = MovieDataSource.getMovieList();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewMovies.setLayoutManager(layoutManager);
        MovieAdapter adapter = new MovieAdapter(movieList);
        recyclerViewMovies.setAdapter(adapter);
    }*/

    private void loadBookList() {
        List<Book> bookList = BookDataSource.getBookList();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewBooks.setLayoutManager(layoutManager);
        BookAdapter adapter = new BookAdapter(bookList);
        recyclerViewBooks.setAdapter(adapter);
    }

    private void loadContinueWList() {
        List<ContinueW> continueWList = ContinueWDataSource.getContinueWList();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewContinueW.setLayoutManager(layoutManager);
        ContinueWAdapter adapter = new ContinueWAdapter(continueWList);
        recyclerViewContinueW.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
