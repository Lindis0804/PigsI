package com.ldh.newpig;

import android.app.Fragment;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class bc_fragment_quan_ly_dan_heo extends Fragment {
    ListView listView;
    bc_qldt_data_adapter adapter;
    ArrayList<bc_qldh_data_item> dataList;
    boolean nhap = true, xuat = false;
    Button button_nhap, button_xuat;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bc_fragment_quan_ly_dan_heo, container, false);
        listView = view.findViewById(R.id.bc_qldh_listView);
        themDuLieu();
        adapter = new bc_qldt_data_adapter(getContext(), R.layout.bc_qldh_data_item, dataList);
        listView.setAdapter(adapter);
        Utility.setListViewHeightBasedOnChildren(listView);

        button_nhap = view.findViewById(R.id.button_nhap);
        button_xuat = view.findViewById(R.id.button_xuat);
        button_nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nhap = !nhap;
                if (nhap) xuat = false;
                changeColor();
            }
        });
        button_xuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuat = !xuat;
                if (xuat) nhap = false;
                changeColor();
            }
        });
        view.findViewById(R.id.button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().remove(bc_fragment_quan_ly_dan_heo.this).commit();
            }
        });

        // set dữ liệu cho spinner
        Spinner spinner = view.findViewById(R.id.bc_qldh_spinner);
        ArrayAdapter<CharSequence> adapter_spinner = ArrayAdapter.createFromResource(getContext(),R.array.giong, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter_spinner);
        return view;
    }

    public void themDuLieu() {
        dataList = new ArrayList<>();
        dataList.add(new bc_qldh_data_item("1", "3/2/21", "Nhập", "Đực"));
        dataList.add(new bc_qldh_data_item("2", "3/4/21", "Xuất", "Cái"));
        dataList.add(new bc_qldh_data_item("3", "3/5/21", "Nhập", "Cái"));
        dataList.add(new bc_qldh_data_item("4", "3/6/21", "Nhập", "Đực"));
        dataList.add(new bc_qldh_data_item("5", "3/7/21", "Xuất", "Cái"));
        dataList.add(new bc_qldh_data_item("6", "3/8/21", "Nhập", "Đực"));
    }

    public void changeColor() {
        button_nhap.setBackgroundTintList(nhap ? ColorStateList.valueOf(getResources().getColor(R.color.bold_orange)) : ColorStateList.valueOf(getResources().getColor(R.color.light_gray)));
        button_nhap.setTextColor(nhap ? getResources().getColor(R.color.white) : getResources().getColor(R.color.black));
        button_xuat.setBackgroundTintList(xuat ? ColorStateList.valueOf(getResources().getColor(R.color.bold_orange)) : ColorStateList.valueOf(getResources().getColor(R.color.light_gray)));
        button_xuat.setTextColor(xuat ? getResources().getColor(R.color.white) : getResources().getColor(R.color.black));
    }
}
