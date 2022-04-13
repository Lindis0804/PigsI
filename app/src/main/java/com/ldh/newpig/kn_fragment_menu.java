package com.ldh.newpig;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

public class kn_fragment_menu extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.kn_fragment_menu,container,false);
        view.findViewById(R.id.kn_imageView_dien_dan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                getFragmentManager().beginTransaction().add(R.id.contentFrame,new kn_fragment()).commit();
                startActivity(new Intent(getContext(),kn_dien_dan.class));
            }
        });
        view.findViewById(R.id.kn_imageView_ncc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),kn_nhaCungCap.class));
            }
        });
        view.findViewById(R.id.kn_imageView_doctor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),kn_call_doctor.class));
            }
        });
        view.findViewById(R.id.kn_imageView_cam_nang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),kn_cam_nang.class));
            }
        });
    return view;
    }
}
