package com.ldh.newpig;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import androidx.annotation.Nullable;


import java.util.ArrayList;

public class FragmentCTNCC extends Fragment {
    private MyGridView gridView;
    private ListView listView;
    ArrayList<ThongTinSLSP> thongTinSLSPSList;
    ArrayList<kn_ctncc_food_item> foodList;
    SLSPAdapter adapter;
    kn_ctncc_food_adapter adapter1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chi_tiet_ncc,container,false);
        gridView = view.findViewById(R.id.ct_ncc_gridview);
        themSP();
        adapter = new SLSPAdapter(getContext(),R.layout.ct_ncc_number_of_item,thongTinSLSPSList);
        gridView.setAdapter(adapter);
        // Utility_grid_view.setgridViewHeightBasedOnChildren(gridView);

        // set dữ liệu cho list view
        themFood();
        listView = view.findViewById(R.id.ct_ncc_listView);
        adapter1 = new kn_ctncc_food_adapter(getContext(),R.layout.kn_sanpham_item,foodList);
        listView.setAdapter(adapter1);
        Utility.setListViewHeightBasedOnChildren(listView);
        view.findViewById(R.id.ct_ncc_button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getFragmentManager().beginTransaction().remove(FragmentCTNCC.this).commit();
            }
        });
        return view;
    }
    public void themSP(){
        thongTinSLSPSList = new ArrayList<>();
        thongTinSLSPSList.add(new ThongTinSLSP("Thức ăn cho heo ",52,false));
        thongTinSLSPSList.add(new ThongTinSLSP("Thức ăn gia cầm",39,false));
        thongTinSLSPSList.add(new ThongTinSLSP("Thức ăn cho cá",9,true));
        thongTinSLSPSList.add(new ThongTinSLSP("Thức ăn cho tôm",14,false));
    }
    public void themFood(){
        foodList = new ArrayList<>();
        foodList.add(new kn_ctncc_food_item(R.drawable.food_8042,"Thức ăn heo nái - 8042","220.000"));
        foodList.add(new kn_ctncc_food_item(R.drawable.food_1690,"Thức ăn heo thịt - 1600","290.000"));
        foodList.add(new kn_ctncc_food_item(R.drawable.food_1680,"Thức ăn heo thịt - 1680","230.000"));
    }
}
