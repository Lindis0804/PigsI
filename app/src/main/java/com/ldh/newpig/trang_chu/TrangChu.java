package com.ldh.newpig.trang_chu;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.ldh.newpig.FragmentToi;
import com.ldh.newpig.R;
import com.ldh.newpig.kn_fragment;
import com.ldh.newpig.*;
public class TrangChu extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.contentFrame, new FragmentTrangChu());
        fragmentTransaction.commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.bot_nav_trang_chu:
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        FragmentTrangChu fragmentTrangChu = new FragmentTrangChu();
                        fragmentTransaction.replace(R.id.contentFrame, fragmentTrangChu);
                        fragmentTransaction.commit();
                        break;
                    case R.id.bot_nav_ket_noi:
                        // FragmentNCCList fragment = new FragmentNCCList();
                        FragmentTransaction fragmentTransaction1 = getFragmentManager().beginTransaction();
                        kn_fragment_menu fragment = new kn_fragment_menu();
                        fragmentTransaction1.replace(R.id.contentFrame, fragment);
                        fragmentTransaction1.commit();
                        break;
                    case R.id.bot_nav_toi:
                        FragmentTransaction fragmentTransaction2 = getFragmentManager().beginTransaction();
                        fragmentTransaction2.replace(R.id.contentFrame, new FragmentToi());
                        fragmentTransaction2.commit();
                        break;
                    case R.id.bot_nav_nhac_nho:
                        FragmentTransaction fragmentTransaction3 = getFragmentManager().beginTransaction();
                        fragmentTransaction3.replace(R.id.contentFrame, new nn_fragment());
                        fragmentTransaction3.commit();
                        break;
                    case R.id.bot_nav_theo_doi:
                        FragmentTransaction fragmentTransaction4 = getFragmentManager().beginTransaction();
                        fragmentTransaction4.replace(R.id.contentFrame, new bc_fragment());
                        fragmentTransaction4.commit();
                        break;
                }
                return true;
            }
        });
    }
}