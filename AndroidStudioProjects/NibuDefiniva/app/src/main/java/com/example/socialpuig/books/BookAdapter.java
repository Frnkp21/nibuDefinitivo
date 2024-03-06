package com.example.socialpuig.books;

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

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {

    private List<Book> bookList;

    public BookAdapter(List<Book> bookList) {
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Book book = bookList.get(position);
        holder.titleTextView.setText(book.getTitle());
        holder.pageCountTextView.setText(String.valueOf(book.getPageCount()));
        // Cargar la imagen de la portada del libro utilizando Glide
        Glide.with(holder.itemView.getContext()).load(book.getPosterUrl()).into(holder.posterImageView);
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                // Obtener la información del libro
                String imageUrl = book.getPosterUrl();
                String title = book.getTitle();
                int pageCount = book.getPageCount();

                // Crear y mostrar el diálogo
                showBookInfoDialog(holder.itemView.getContext(), imageUrl, title, pageCount);

                // Devolver true para indicar que el evento ha sido consumido
                return true;
            }
        });
    }

    private void showBookInfoDialog(Context context, String imageUrl, String title, int pageCount) {
        NavController navController = Navigation.findNavController((FragmentActivity) context, R.id.nav_host_fragment_activity_main);

        // Crear y mostrar el diálogo
        BookInfoDialog dialog = new BookInfoDialog(context, imageUrl, title, pageCount, navController);
        dialog.show();
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView posterImageView;
        TextView titleTextView;
        TextView pageCountTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            posterImageView = itemView.findViewById(R.id.posterImageView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            pageCountTextView = itemView.findViewById(R.id.pageCountTextView);
        }
    }
}
