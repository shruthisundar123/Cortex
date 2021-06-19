package com.example.productivitybot;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.productivitybot.databinding.FragmentProgressBinding;

public class ProgressFragment extends Fragment {

    private ProgressViewModel progressViewModel;
    private FragmentProgressBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        progressViewModel =
                new ViewModelProvider(this).get(ProgressViewModel.class);

        binding = FragmentProgressBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textProgress;
        progressViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
