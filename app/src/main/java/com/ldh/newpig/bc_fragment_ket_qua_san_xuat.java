package com.ldh.newpig;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class bc_fragment_ket_qua_san_xuat extends Fragment {
    ListView listView;
    ArrayList<bc_pig_data> dataList;
    bc_pig_data_adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bc_fragment_ket_qua_san_xuat,container,false);
        themDuLieu();
        listView = view.findViewById(R.id.listView);
        adapter = new bc_pig_data_adapter(getContext(),R.layout.bc_pig_data_item,dataList);
        listView.setAdapter(adapter);
        Utility.setListViewHeightBasedOnChildren(listView);
        view.findViewById(R.id.button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().remove(bc_fragment_ket_qua_san_xuat.this).commit();
            }
        });
        return view;
    }
    public void themDuLieu(){
        dataList = new ArrayList<>();
        dataList.add(new bc_pig_data("2/3/21",20,10,3));
        dataList.add(new bc_pig_data("2/4/21",100,20,10));
        dataList.add(new bc_pig_data("2/5/21",70,20,10));
        dataList.add(new bc_pig_data("2/6/21",80,5,5));
    }
}
