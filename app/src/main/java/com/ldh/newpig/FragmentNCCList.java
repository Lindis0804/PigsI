package com.ldh.newpig;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.ArrayList;

public class FragmentNCCList extends Fragment {
      GridView gridView;
      ArrayList<nhaCungCap> nccList;
      nccItemAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nha_cung_cap,container,false);
        FragmentCTNCC fragment = new FragmentCTNCC();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        gridView = view.findViewById(R.id.gridView_ncc);
        addNcc();
        adapter = new nccItemAdapter(view.getContext(),
                R.layout.ncc_item,
                nccList
                );
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                fragmentTransaction.add(R.id.contentFrame,fragment);
                fragmentTransaction.commit();
            }
        });
        view.findViewById(R.id.ncc_button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getFragmentManager().beginTransaction().remove(FragmentNCCList.this).commit();
            }
        });
        return view;
    }
    public void addNcc(){
        nccList = new ArrayList<>();
       nccList.add(new nhaCungCap(R.drawable.ncc_japfa,"TNHH JAPFA","93382"));
       nccList.add(new nhaCungCap(R.drawable.ncc_gargill,"TNHH Cargill","120942"));
       nccList.add(new nhaCungCap(R.drawable.ncc_proconco,"TNHH PROCONCO","148092"));
       nccList.add(new nhaCungCap(R.drawable.ncc_dabaco,"TNHH DABACO","127991"));

    }
}
