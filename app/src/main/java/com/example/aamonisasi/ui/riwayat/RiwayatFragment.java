package com.example.aamonisasi.ui.riwayat;

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

import com.example.aamonisasi.R;

public class RiwayatFragment extends Fragment {
    private RiwayatViewModel riwayatViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        riwayatViewModel =
                new ViewModelProvider(this).get(RiwayatViewModel.class);
        View root = inflater.inflate(R.layout.fragment_riwayat, container, false);
        final TextView textView = root.findViewById(R.id.text_riwayat);
        riwayatViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
