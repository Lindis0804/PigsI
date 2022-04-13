package com.ldh.newpig;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class test extends AppCompatActivity implements kn_itemClickListener {
    ListView listView;
    ArrayList<kn_BaiViet> baiVietList;
    BaiVietAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        themBaiViet();
        listView = findViewById(R.id.textListView);
        adapter = new BaiVietAdapter(this,R.layout.kn_new_paper_item,baiVietList,this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(test.this,kn_chi_tiet_bai_viet.class));
            }
        });
    }
    public void themBaiViet() {
        baiVietList = new ArrayList<>();
        baiVietList.add(new kn_BaiViet(R.drawable.alice, "Alice", "Nhờ hỗ trợ về bệnh viêm màng phổi ở heo", "Hôm nay mình nhờ mọi người tư vấn giúp mình cách chữa đàn heo bị viêm...", 25, 104, 12, true, false));
        baiVietList.add(new kn_BaiViet(R.drawable.kn_lindis, "Lindis", "Bênh tai xanh ở heo", "Hôm nay mình nhờ mọi người tư vấn giúp mình cách chữa đàn heo bị tai xanh...", 100, 204, 5, true, false));
        baiVietList.add(new kn_BaiViet(R.drawable.kn_bright, "Bright", "Heo uống thuốc", "Hôm nay mình nhờ mọi người tư vấn giúp mình cách cho heo uống thuốc...", 60, 300, 30, false, false));
    }

    @Override
    public void onItemClick(int position) {

    }
}