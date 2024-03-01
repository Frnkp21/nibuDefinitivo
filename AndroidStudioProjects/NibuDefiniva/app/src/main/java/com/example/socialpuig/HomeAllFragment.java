package com.example.socialpuig;

import static com.example.socialpuig.MovieDataSource.getMovieList;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.socialpuig.databinding.FragmentHomeAllBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;


public class HomeAllFragment extends Fragment {
    private FragmentHomeAllBinding binding;
   // private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeAllBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Configurar BottomNavigationView
        BottomNavigationView navView = binding.navView;
        NavController navController = Navigation.findNavController(requireActivity(), R.id.homeAllFragment);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.socialFragment, R.id.savedFragment, R.id.homeAllFragment, R.id.rankingFragment, R.id.moreFragment
        ).build();
        NavigationUI.setupActionBarWithNavController((AppCompatActivity) requireActivity(), navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
        // Configurar RecyclerView
        //recyclerView = binding.recyclerView;
        //loadMovieList();
    }

   /* private void loadMovieList() {
        List<Movie> movieList = MovieDataSource.getMovieList();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        MovieAdapter adapter = new MovieAdapter(movieList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }*/
}