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
import androidx.navigation.fragment.NavHostFragment;

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

        binding.spikeTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Navigation.findNavController(view).navigate(R.id.action_peersFragment_to_peerInfo)
                NavHostFragment.findNavController(PeersFragment.this)
                       .navigate(R.id.action_peersFragment_to_peerInfo);
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