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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.socialpuig.chat.ChatAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class FriendChatFragment extends Fragment {

    private RecyclerView recyclerView;
    private ChatAdapter adapter;
    private List<String> chatMessages;
    private NavController navController;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friend_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        BottomNavigationView bottomNavView = requireActivity().findViewById(R.id.nav_view);
        bottomNavView.setVisibility(View.GONE);

        chatMessages = new ArrayList<>();
        chatMessages.add("Hola");
        chatMessages.add("claro!");

        // Configurar el RecyclerView con un LinearLayoutManager y el adaptador
        recyclerView = view.findViewById(R.id.recyclerViewChat);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        adapter = new ChatAdapter(chatMessages);
        recyclerView.setAdapter(adapter);

        Button sendButton = view.findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ImageButton backtoFriendsButton = view.findViewById(R.id.backtofriends);
        backtoFriendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.socialFragment);
            }
        });
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);

        ImageButton settingsFriendsButton = view.findViewById(R.id.settingsProfile);
        settingsFriendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar a otro Fragmento
                navController.navigate(R.id.settingsFriendFragment);
            }
        });
    }

    private void sendMessage() {
        // Obtener el texto del mensaje ingresado por el usuario
        String message = ((TextInputEditText) requireView().findViewById(R.id.messageInputEditText)).getText().toString().trim();

        // Verificar si el mensaje no está vacío
        if (!message.isEmpty()) {
            // Agregar el mensaje a la lista de mensajes del chat
            chatMessages.add(message);
            // Notificar al adaptador que se ha agregado un nuevo mensaje
            adapter.notifyItemInserted(chatMessages.size() - 1);
            // Limpiar el campo de entrada de texto
            ((TextInputEditText) requireView().findViewById(R.id.messageInputEditText)).setText("");
        } else {
            // Mostrar un mensaje de error si el campo de entrada de texto está vacío
            Toast.makeText(requireContext(), "Please enter a message", Toast.LENGTH_SHORT).show();
        }
    }
}

