package com.iAKIN.latest_point.ui.basvuru;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.iAKIN.latest_point.R;

public class BasvuruFragment extends Fragment {

    private BasvuruViewModel basvuruViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        basvuruViewModel = ViewModelProviders.of(this).get(BasvuruViewModel.class);
        View root = inflater.inflate(R.layout.fragment_basvuru, container, false);

        return root;
    }
}