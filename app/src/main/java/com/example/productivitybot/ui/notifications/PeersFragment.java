package com.example.productivitybot.ui.notifications;

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

import com.example.productivitybot.R;
import com.example.productivitybot.databinding.FragmentPeersBinding;

public class PeersFragment extends Fragment {

    private PeersViewModel peersViewModel;
    private FragmentPeersBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        peersViewModel =
                new ViewModelProvider(this).get(PeersViewModel.class);

        binding = FragmentPeersBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPeers;
        peersViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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