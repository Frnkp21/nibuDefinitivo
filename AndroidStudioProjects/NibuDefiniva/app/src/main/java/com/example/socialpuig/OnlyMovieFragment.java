package com.example.socialpuig;

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

import com.example.socialpuig.databinding.FragmentHomeAllBinding;
import com.example.socialpuig.databinding.FragmentOnlyMovieBinding;
import com.example.socialpuig.movies.Movie;
import com.example.socialpuig.movies.MovieAdapter;
import com.example.socialpuig.movies.MovieDataSource;

import java.util.List;

public class OnlyMovieFragment extends Fragment {
    private FragmentOnlyMovieBinding binding;

    private RecyclerView recyclerViewMovies;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOnlyMovieBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerViewMovies = binding.recyclerViewMovie;
        loadMovieList();
        // Obtener una referencia al NavController
        final NavController navController = Navigation.findNavController(view);

        // Configurar el clic del botón homeButon
        view.findViewById(R.id.all1Buton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar de vuelta al HomeAllFragment
                navController.navigate(R.id.homeAllFragment);
            }
        });
        view.findViewById(R.id.seriesButon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar de vuelta al HomeAllFragment
                navController.navigate(R.id.onlySeriesFragment);
            }
        });
        view.findViewById(R.id.booksButon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar de vuelta al HomeAllFragment
                navController.navigate(R.id.onlyBookFragment);
            }
        });

    }
    private void loadMovieList() {
        List<Movie> movieList = MovieDataSource.getMovieList();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewMovies.setLayoutManager(layoutManager);
        MovieAdapter adapter = new MovieAdapter(movieList);
        recyclerViewMovies.setAdapter(adapter);
    }
}