package com.iAKIN.latest_point.ui.kitap;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.iAKIN.latest_point.R;

public class KitapFragment extends Fragment {

    private KitapViewModel kitapViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kitapViewModel = ViewModelProviders.of(this).get(KitapViewModel.class);
        View root = inflater.inflate(R.layout.fragment_kitap, container, false);

        return root;
    }
}