package com.example.socialpuig.social;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.socialpuig.R;
import com.example.socialpuig.databinding.FragmentSocialBinding;


public class SocialFragment extends Fragment {
    private FragmentSocialBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SocialViewModel dashboardViewModel =
                new ViewModelProvider(this).get(SocialViewModel.class);

        binding = FragmentSocialBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSocial;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}