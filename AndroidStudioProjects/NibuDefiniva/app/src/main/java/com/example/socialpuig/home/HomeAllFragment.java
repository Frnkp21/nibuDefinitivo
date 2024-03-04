package com.example.socialpuig.home;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import java.util.List;

public class HomeAllFragment extends Fragment {

    private FragmentHomeAllBinding binding;
    private RecyclerView recyclerViewMovies;
    private RecyclerView recyclerViewBooks;
    private RecyclerView recyclerViewContinueW;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeAllBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewMovies = binding.recyclerViewMovie;
        recyclerViewBooks = binding.recyclerViewBook;
        recyclerViewContinueW = binding.recyclerViewContinueW;
        loadMovieList();
        loadBookList();
        loadContinueWList();
    }

    private void loadMovieList() {
        List<Movie> movieList = MovieDataSource.getMovieList();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewMovies.setLayoutManager(layoutManager);
        MovieAdapter adapter = new MovieAdapter(movieList);
        recyclerViewMovies.setAdapter(adapter);
    }

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
