package com.example.socialpuig;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static android.app.Activity.RESULT_OK;

public class profileFragment extends Fragment {

    private static final int PICK_IMAGE = 1;

    ImageView photoImageView;
    TextView displayNameTextView, emailTextView;

    Uri imageUri;

    public profileFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        photoImageView = view.findViewById(R.id.photoImageView);
        displayNameTextView = view.findViewById(R.id.displayNameTextView);
        emailTextView = view.findViewById(R.id.emailTextView);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null) {
            emailTextView.setText(user.getEmail());

            // Obtener la foto y el nombre del usuario desde Firestore
            FirebaseFirestore.getInstance().collection("users").document(user.getUid()).get().addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        String photoUrl = document.getString("photoUrl");
                        String displayName = document.getString("displayName");

                        // Mostrar la foto y el nombre del usuario
                        Glide.with(requireView()).load(photoUrl).into(photoImageView);
                        displayNameTextView.setText(displayName);
                    } else {
                        // El documento no existe
                    }
                } else {
                    // Error al obtener el documento
                }
            });

            photoImageView.setOnClickListener(v -> {
                openGallery();
            });
        }
    }

    private void openGallery() {
        Intent gallery = new Intent();
        gallery.setType("image/*");
        gallery.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(gallery, "Seleccione una imagen"), PICK_IMAGE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK && data != null && data.getData() != null) {
            imageUri = data.getData();
            photoImageView.setImageURI(imageUri);
            uploadImageToFirebase();
        }
    }

    private void uploadImageToFirebase() {
        if (imageUri != null) {
            StorageReference storageReference = FirebaseStorage.getInstance().getReference().child("profile_pictures/" + FirebaseAuth.getInstance().getCurrentUser().getUid());
            storageReference.putFile(imageUri).addOnSuccessListener(taskSnapshot -> {
                // Si la imagen se carga correctamente, actualizamos la URL de la imagen en Firestore
                storageReference.getDownloadUrl().addOnSuccessListener(uri -> {
                    FirebaseFirestore.getInstance().collection("users").document(FirebaseAuth.getInstance().getCurrentUser().getUid()).update("photoUrl", uri.toString());
                    Toast.makeText(getContext(), "Imagen de perfil actualizada", Toast.LENGTH_SHORT).show();
                });
            }).addOnFailureListener(e -> {
                Toast.makeText(getContext(), "Error al cargar la imagen: " + e.getMessage(), Toast.LENGTH_SHORT).show();
            });
        }
    }
}
