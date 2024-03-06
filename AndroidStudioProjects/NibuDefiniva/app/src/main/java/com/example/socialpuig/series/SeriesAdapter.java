package com.example.socialpuig.series;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.socialpuig.R;
import com.example.socialpuig.movies.MovieInfoDialog;

import java.util.List;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.ViewHolder> {

    private List<Series> seriesList;
    private Context context;

    public SeriesAdapter(List<Series> seriesList, Context context) {
        this.seriesList = seriesList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.series_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Series series = seriesList.get(position);
        holder.titleTextView.setText(series.getTitle());
        Glide.with(context).load(series.getPosterUrl()).into(holder.posterImageView);
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                // Obtener la información de la película
                String imageUrl = series.getPosterUrl();
                String title = series.getTitle();
                String synopsis = series.getSynopsis();

                // Crear y mostrar el diálogo
                showMovieInfoDialog(imageUrl, title, synopsis);

                // Devolver true para indicar que el evento ha sido consumido
                return true;
            }
        });
    }
    private void showMovieInfoDialog(String imageUrl, String title, String synopsis) {
        NavController navController = Navigation.findNavController((FragmentActivity) context, R.id.nav_host_fragment_activity_main);
        // Crear y mostrar el diálogo
        MovieInfoDialog dialog = new MovieInfoDialog(context, imageUrl, title, synopsis,navController);
        dialog.show();
    }
    @Override
    public int getItemCount() {
        return seriesList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView posterImageView;
        TextView titleTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            posterImageView = itemView.findViewById(R.id.seriesPosterImageView);
            titleTextView = itemView.findViewById(R.id.seriesTitleTextView);
        }
    }
}
