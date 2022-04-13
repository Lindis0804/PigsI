package com.ldh.newpig;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class kn_chi_tiet_ncc extends AppCompatActivity {
    private MyGridView gridView;
    private ListView listView;
    ArrayList<ThongTinSLSP> thongTinSLSPSList;
    ArrayList<kn_ctncc_food_item> foodList;
    SLSPAdapter adapter;
    kn_ctncc_food_adapter adapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chi_tiet_ncc);
        gridView = findViewById(R.id.ct_ncc_gridview);
        themSP();
        adapter = new SLSPAdapter(this,R.layout.ct_ncc_number_of_item,thongTinSLSPSList);
        gridView.setAdapter(adapter);
       // Utility_grid_view.setgridViewHeightBasedOnChildren(gridView);

        // set dữ liệu cho list view
        themFood();
        listView = findViewById(R.id.ct_ncc_listView);
        adapter1 = new kn_ctncc_food_adapter(this,R.layout.kn_sanpham_item,foodList);
        listView.setAdapter(adapter1);
        Utility.setListViewHeightBasedOnChildren(listView);
        findViewById(R.id.ct_ncc_button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

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