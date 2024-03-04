package com.example.socialpuig.continueW;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.socialpuig.R;

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
       // holder.synopsisContinueWTextView.setText(continueW.getSynopsis());
        // Cargar la imagen del póster utilizando Glide
        Glide.with(holder.itemView.getContext()).load(continueW.getPosterUrl()).into(holder.posterContinueWImageView);
    }

    @Override
    public int getItemCount() {
        return continueWList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView posterContinueWImageView;
        TextView titleContinueWTextView;
       // TextView synopsisContinueWTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            posterContinueWImageView = itemView.findViewById(R.id.posterContinueWImageView);
            titleContinueWTextView = itemView.findViewById(R.id.titleContinueWTextView);
           // synopsisContinueWTextView = itemView.findViewById(R.id.synopsisContinueWTextView);
        }
    }
}
