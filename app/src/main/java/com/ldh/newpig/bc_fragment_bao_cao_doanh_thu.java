package com.ldh.newpig;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class bc_fragment_bao_cao_doanh_thu extends Fragment {
    ArrayList<bc_bcdt_data_item> dataList;
    ListView listView;
    bc_bcdt_data_adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bc_fragment_bao_cao_doanh_thu,container,false);
        listView = view.findViewById(R.id.bc_bcdt_listView);
        themDuLieu();
        adapter = new bc_bcdt_data_adapter(getContext(),R.layout.bc_bcdt_data_item,dataList);
        listView.setAdapter(adapter);
       // Utility.setListViewHeightBasedOnChildren(listView);
        view.findViewById(R.id.button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().remove(bc_fragment_bao_cao_doanh_thu.this).commit();
            }
        });
        return view;
    }
    public void themDuLieu(){
        dataList = new ArrayList<>();
        dataList.add(new bc_bcdt_data_item("3/2/21",2000000,5000000,3000000));
        dataList.add(new bc_bcdt_data_item("3/3/21",2000000,6000000,4000000));
        dataList.add(new bc_bcdt_data_item("3/4/21",4000000,10000000,6000000));
        dataList.add(new bc_bcdt_data_item("3/5/21",1000000,5000000,4000000));
        dataList.add(new bc_bcdt_data_item("3/6/21",2000000,5000000,3000000));
        dataList.add(new bc_bcdt_data_item("3/7/21",2000000,8000000,6000000));
        dataList.add(new bc_bcdt_data_item("3/8/21",1000000,10000000,9000000));
        dataList.add(new bc_bcdt_data_item("3/9/21",500000,6000000,4500000));
        dataList.add(new bc_bcdt_data_item("3/10/21",1000000,10000000,9000000));
        dataList.add(new bc_bcdt_data_item("3/11/21",2000000,6000000,4000000));
        dataList.add(new bc_bcdt_data_item("3/12/21",4000000,10000000,6000000));
    }
}
