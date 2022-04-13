package com.ldh.newpig;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class kn_fragment extends Fragment implements kn_itemClickListener {

    private RecyclerView recyclerView;
    private ArrayList<kn_doctor> kn_doctorArrayList;
    private kn_doctorAdapter adapter;
    private ListView listView;
    private ArrayList<kn_BaiViet> baiVietList;
    private BaiVietAdapter bvAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ket_noi, container, false);
        themBacSi();
        recyclerView = view.findViewById(R.id.kn_recyclerView);
        recyclerView.setHasFixedSize(true);
        kn_doctorAdapter adapter = new kn_doctorAdapter(kn_doctorArrayList, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext(),
                RecyclerView.HORIZONTAL,
                false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

// list bai viet
        themBaiViet();
        listView = view.findViewById(R.id.kn_item_listView_baiVietMoi);
        bvAdapter = new BaiVietAdapter(view.getContext(), R.layout.kn_new_paper_item, baiVietList, this);
        listView.setAdapter(bvAdapter);
        //set chiều cao listview vừa với item
        Utility.setListViewHeightBasedOnChildren(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(getActivity(), kn_chi_tiet_bai_viet.class));
                Toast.makeText(getActivity(), "listView", Toast.LENGTH_SHORT).show();
            }
        });
        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(getActivity(), kn_chi_tiet_bai_viet.class));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        // bấm nút để mở navigation
        NavigationView navigationView = view.findViewById(R.id.kn_navigationView);
        DrawerLayout drawerLayout = view.findViewById(R.id.kn_drawerLayout);
        ImageButton button = view.findViewById(R.id.kn_button_hambugur);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawerLayout.openDrawer(navigationView);
            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_call_doctor:
                        startActivity(new Intent(getContext(), kn_call_doctor.class));
                        drawerLayout.closeDrawer(navigationView);
                        return true;
                    case R.id.nav_ncc:
//                        startActivity(new Intent(getContext(),kn_nhaCungCap.class));
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        FragmentNCCList fragmentNCCList = new FragmentNCCList();
                        fragmentTransaction.add(R.id.contentFrame, fragmentNCCList);
                        fragmentTransaction.commit();
                        drawerLayout.closeDrawer(navigationView);
                        return true;
                }
                return true;
            }
        });
        return view;
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
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.contentFrame, new kn_fragment_chi_tiet_bai_viet());
        fragmentTransaction.commit();
        //  startActivity(new Intent(getActivity(),kn_chi_tiet_bai_viet.class));
    }
}
