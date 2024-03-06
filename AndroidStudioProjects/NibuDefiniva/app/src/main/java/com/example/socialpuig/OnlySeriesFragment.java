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

import com.example.socialpuig.databinding.FragmentHomeAllBinding;
import com.example.socialpuig.databinding.FragmentOnlySeriesBinding;
import com.example.socialpuig.series.Series;
import com.example.socialpuig.series.SeriesAdapter;
import com.example.socialpuig.series.SeriesDataSource;

import java.util.List;

public class OnlySeriesFragment extends Fragment {

    private FragmentOnlySeriesBinding binding;
    // private RecyclerView recyclerViewMovies;
    private RecyclerView recyclerViewSeries;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOnlySeriesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        recyclerViewSeries = binding.recyclerViewSeries;
        loadSeriesList();

        // Configurar el clic del botón homeButon
        view.findViewById(R.id.all2Buton).setOnClickListener(new View.OnClickListener() {
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
        view.findViewById(R.id.booksButon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar de vuelta al HomeAllFragment
                navController.navigate(R.id.onlyBookFragment);
            }
        });
        ImageView s1images = view.findViewById(R.id.seriesT1);
        s1images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s2images = view.findViewById(R.id.seriesT2);
        s2images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s3images = view.findViewById(R.id.seriesT3);
        s3images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s4images = view.findViewById(R.id.seriesT4);
        s4images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s5images = view.findViewById(R.id.seriesT5);
        s5images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s6images = view.findViewById(R.id.seriesA1);
        s6images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s7images = view.findViewById(R.id.seriesA2);
        s7images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s8images = view.findViewById(R.id.seriesA3);
        s8images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s9images = view.findViewById(R.id.seriesA4);
        s9images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s10images = view.findViewById(R.id.seriesA5);
        s10images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s11images = view.findViewById(R.id.seriesC1);
        s11images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s12images = view.findViewById(R.id.seriesC2);
        s12images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s13images = view.findViewById(R.id.seriesC3);
        s13images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s14images = view.findViewById(R.id.seriesC4);
        s14images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
        ImageView s15images = view.findViewById(R.id.seriesC5);
        s15images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Infla el diseño del diálogo personalizado
                View dialogView = LayoutInflater.from(getContext()).inflate(R.layout.serie_dialog, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setView(dialogView);

                AlertDialog alertDialog = builder.create();

                alertDialog.show();
            }
        });
    }
    private void loadSeriesList() {
        List<Series> seriesList = SeriesDataSource.getSeriesList();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewSeries.setLayoutManager(layoutManager);
        SeriesAdapter adapter = new SeriesAdapter(seriesList, requireContext());
        recyclerViewSeries.setAdapter(adapter);
    }
}