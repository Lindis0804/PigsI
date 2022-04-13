package com.ldh.newpig;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class bc_fragment extends Fragment {
    ConstraintLayout c1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_bao_cao,container,false);
        c1 = view.findViewById(R.id.bao_cao_chi_phi);
        view.findViewById(R.id.imageView_bao_cao_chi_phi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.contentFrame,new bc_fragment_chi_phi());
                fragmentTransaction.commit();
            }
        });
        view.findViewById(R.id.imageView_bao_cao_doanh_thu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().add(R.id.contentFrame,new bc_fragment_ket_qua_san_xuat()).commit();
            }
        });
        view.findViewById(R.id.imageView_ql_danheo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().add(R.id.contentFrame,new bc_fragment_quan_ly_dan_heo()).commit();
            }
        });
        view.findViewById(R.id.imageView_kq_sx).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().add(R.id.contentFrame,new bc_fragment_bao_cao_doanh_thu()).commit();
            }
        });
        return view;

    }
}
