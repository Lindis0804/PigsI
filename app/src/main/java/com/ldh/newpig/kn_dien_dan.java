package com.ldh.newpig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class kn_dien_dan extends AppCompatActivity implements kn_itemClickListener {
    private RecyclerView recyclerView;
    private ArrayList<kn_doctor> kn_doctorArrayList;
    private kn_doctorAdapter adapter;
    private ListView listView;
    private ArrayList<kn_BaiViet> baiVietList;
    private BaiVietAdapter bvAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_ket_noi);
        themBacSi();
        recyclerView = findViewById(R.id.kn_recyclerView);
        recyclerView.setHasFixedSize(true);
        kn_doctorAdapter adapter = new kn_doctorAdapter(kn_doctorArrayList, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL,
                false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

// list bai viet
        themBaiViet();
        listView = findViewById(R.id.kn_item_listView_baiVietMoi);
        bvAdapter = new BaiVietAdapter(this, R.layout.kn_new_paper_item, baiVietList, this);
        listView.setAdapter(bvAdapter);
        //set chiều cao listview vừa với item
        Utility.setListViewHeightBasedOnChildren(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(kn_dien_dan.this, kn_chi_tiet_bai_viet.class));

            }
        });
        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(kn_dien_dan.this, kn_chi_tiet_bai_viet.class));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        findViewById(R.id.kn_button_hambugur).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void themBacSi() {
        kn_doctorArrayList = new ArrayList<>();
        kn_doctorArrayList.add(new kn_doctor("Lê Hữu Tuấn", 43610, R.drawable.kn_avatar_1, R.drawable.kn_cover_image_1));
        kn_doctorArrayList.add(new kn_doctor("Lê Lan Nhi", 12330, R.drawable.kn_avatar_2, R.drawable.kn_cover_image_2));
        kn_doctorArrayList.add(new kn_doctor("Nguyễn Ngọc Ngạn", 23550, R.drawable.kn_avatar_3, R.drawable.kn_cover_image_3));
    }

    public void themBaiViet() {
        baiVietList = new ArrayList<>();
        baiVietList.add(new kn_BaiViet(R.drawable.alice, "Alice", "Nhờ hỗ trợ về bệnh viêm màng phổi ở heo", "Hôm nay mình nhờ mọi người tư vấn giúp mình cách chữa đàn heo bị viêm...", 25, 104, 12, true, false));
        baiVietList.add(new kn_BaiViet(R.drawable.kn_lindis, "Lindis", "Bênh tai xanh ở heo", "Hôm nay mình nhờ mọi người tư vấn giúp mình cách chữa đàn heo bị tai xanh...", 100, 204, 5, true, false));
        baiVietList.add(new kn_BaiViet(R.drawable.kn_bright, "Bright", "Heo uống thuốc", "Hôm nay mình nhờ mọi người tư vấn giúp mình cách cho heo uống thuốc...", 60, 300, 30, false, false));
    }

    @Override
    public void onItemClick(int position) {
       startActivity(new Intent(this,kn_chi_tiet_bai_viet.class));
        //  startActivity(new Intent(getActivity(),kn_chi_tiet_bai_viet.class));
    }
}