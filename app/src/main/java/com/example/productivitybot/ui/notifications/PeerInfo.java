package com.example.productivitybot.ui.notifications;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.productivitybot.R;
import com.example.productivitybot.databinding.PeerInfoFragmentBinding;

public class PeerInfo extends Fragment {

    private PeerInfoViewModel peerInfoViewModel;
    private PeerInfoFragmentBinding binding;

    public static PeerInfo newInstance() {
        return new PeerInfo();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        peerInfoViewModel =
                new ViewModelProvider(this).get(PeerInfoViewModel.class);

        binding = PeerInfoFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return inflater.inflate(R.layout.peer_info_fragment, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}