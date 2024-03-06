package com.example.socialpuig.movies;

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
import java.util.List;
import com.bumptech.glide.Glide;
import com.example.socialpuig.R;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private List<Movie> movieList;
    private Context context;

    public MovieAdapter(List<Movie> movieList, Context context) {
        this.movieList = movieList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.movieTitle.setText(movie.getTitle());
        // Cargar la imagen del póster de la película utilizando Glide
        Glide.with(context).load(movie.getPosterUrl()).into(holder.moviePoster);
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                // Obtener la información de la película
                String imageUrl = movie.getPosterUrl();
                String title = movie.getTitle();
                String synopsis = movie.getSynopsis();

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
        return movieList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView moviePoster;
        TextView movieTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            moviePoster = itemView.findViewById(R.id.moviePoster);
            movieTitle = itemView.findViewById(R.id.movieTitle);
        }
    }
}
