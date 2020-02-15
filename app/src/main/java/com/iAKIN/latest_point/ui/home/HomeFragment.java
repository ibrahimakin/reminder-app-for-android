package com.iAKIN.latest_point.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.navigation.NavigationView;
import com.iAKIN.latest_point.MainActivity;
import com.iAKIN.latest_point.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    NavigationView navView;
    Menu navMenu;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        navView = MainActivity.getNavigationView();
        navMenu = navView.getMenu();

        Button btnKitap = root.findViewById(R.id.btnKitap);
        Button btnVideo = root.findViewById(R.id.btnVideo);
        Button btnBasvuru = root.findViewById(R.id.btnBasvuru);

        btnKitap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapFragment(1);
            }
        });

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapFragment(2);
            }
        });

        btnBasvuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapFragment(3);
            }
        });

        return root;
    }

    private void swapFragment(int id){

        if( id == 1 ){
            navMenu.performIdentifierAction(R.id.nav_kitap, 0);
        }
        else if( id == 2 ) {
            navMenu.performIdentifierAction(R.id.nav_video,0);
        }
        else if( id == 3 ) {
            navMenu.performIdentifierAction(R.id.nav_basvuru,0);
        }
    }
}