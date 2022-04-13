package com.ldh.newpig;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class td_fragment_trang_chu extends Fragment {
    ImageButton imageButton;
    NavigationView navigationView;
    DrawerLayout drawerLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_theo_doi_trang_chu, container, false);
        imageButton = view.findViewById(R.id.button_menu_hambugur);
        navigationView = view.findViewById(R.id.navigationView);
        drawerLayout = view.findViewById(R.id.drawerLayout);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(navigationView);


            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_mua_thuc_an:
                        changeFragment(new td_fragment_trang_chu());
                        drawerLayout.closeDrawer(navigationView);
                        return true;
                    case R.id.nav_qldt:
                        changeFragment(new td_fragment_qldt());
                        drawerLayout.closeDrawer(navigationView);
                        return true;
                    case R.id.nav_sl_heo_tiem_vaccine:
                        changeFragment(new td_frament_sl_heo_tiem_vaccine());
                        drawerLayout.closeDrawer(navigationView);
                        return true;
                    case R.id.nav_bao_cao_theo_tuan:
                        changeFragment(new td_fragment_bao_cao_theo_tuan());
                        drawerLayout.closeDrawer(navigationView);
                        return true;
                }
                return true;
            }
        });

        changeFragment(new td_fragment());
        return view;
    }

    public void changeFragment(Fragment f) {
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.td_frameLayout, f);
        fragmentTransaction.commit();
    }
}
