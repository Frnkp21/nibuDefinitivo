package com.example.socialpuig.continueW;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.socialpuig.MovieInfoDialog;
import com.example.socialpuig.R;
import com.example.socialpuig.VideoPlayerFragment;

import java.util.List;

public class ContinueWAdapter extends RecyclerView.Adapter<ContinueWAdapter.ViewHolder> {

    private List<ContinueW> continueWList;


    public ContinueWAdapter(List<ContinueW> continueWList) {
        this.continueWList = continueWList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.continue_w_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ContinueW continueW = continueWList.get(position);
        holder.titleContinueWTextView.setText(continueW.getTitle());
        // Cargar la imagen del póster utilizando Glide
        Glide.with(holder.itemView.getContext()).load(continueW.getPosterUrl()).into(holder.posterContinueWImageView);

        // Establecer el OnLongClickListener para mostrar el diálogo de información de la película
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                // Obtener la información de la película
                String imageUrl = continueW.getPosterUrl();
                String title = continueW.getTitle();
                String synopsis = continueW.getSynopsis();

                // Crear y mostrar el diálogo
                showMovieInfoDialog(holder.itemView.getContext(), imageUrl, title, synopsis);

                // Devolver true para indicar que el evento ha sido consumido
                return true;
            }
        });

    }

    private void showMovieInfoDialog(Context context, String imageUrl, String title, String synopsis) {
        // Crear y mostrar el diálogo
        MovieInfoDialog dialog = new MovieInfoDialog(context, imageUrl, title, synopsis);
        dialog.show();
    }

    @Override
    public int getItemCount() {
        return continueWList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView posterContinueWImageView;
        TextView titleContinueWTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            posterContinueWImageView = itemView.findViewById(R.id.posterContinueWImageView);
            titleContinueWTextView = itemView.findViewById(R.id.titleContinueWTextView);
        }
    }
}
