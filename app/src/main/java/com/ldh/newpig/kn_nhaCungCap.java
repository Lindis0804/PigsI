package com.ldh.newpig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class kn_nhaCungCap extends AppCompatActivity {
    GridView gridView;
    ArrayList<nhaCungCap> nccList;
    nccItemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nha_cung_cap);
        gridView = findViewById(R.id.gridView_ncc);
        addNcc();
        adapter = new nccItemAdapter(this,
                R.layout.ncc_item,
                nccList
        );
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(kn_nhaCungCap.this,kn_chi_tiet_ncc.class));
            }
        });
        findViewById(R.id.ncc_button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void addNcc(){
        nccList = new ArrayList<>();
        nccList.add(new nhaCungCap(R.drawable.ncc_japfa,"TNHH JAPFA","93382"));
        nccList.add(new nhaCungCap(R.drawable.ncc_gargill,"TNHH Cargill","120942"));
        nccList.add(new nhaCungCap(R.drawable.ncc_proconco,"TNHH PROCONCO","148092"));
        nccList.add(new nhaCungCap(R.drawable.ncc_dabaco,"TNHH DABACO","127991"));

    }
}