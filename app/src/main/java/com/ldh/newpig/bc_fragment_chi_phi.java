package com.ldh.newpig;

import android.app.Fragment;
import android.hardware.lights.LightsManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class bc_fragment_chi_phi extends Fragment {
    Spinner spinner;
    ListView listView;
    ArrayList<bc_data> dataList;
    bc_data_adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bc_chi_phi,container,false);
        spinner = view.findViewById(R.id.bc_chi_phi_spinner);
        listView = view.findViewById(R.id.bc_chi_phi_listView);
        themData();
        adapter = new bc_data_adapter(getContext(),R.layout.bc_data_item,dataList);
        listView.setAdapter(adapter);
        Utility.setListViewHeightBasedOnChildren(listView);
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(getContext(),
                        R.array.cac_loai_chi_phi,
                        android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        view.findViewById(R.id.button_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().remove(bc_fragment_chi_phi.this).commit();
            }
        });
        return view;
    }
    public void themData(){
        dataList = new ArrayList<>();
        dataList.add(new bc_data("31/01/21","Chi phí sửa chữa",148983485));
        dataList.add(new bc_data("28/02/21","Chi phí sửa chữa",129000000));
        dataList.add(new bc_data("28/02/21","Chi phí sửa chữa",1050001));
        dataList.add(new bc_data("31/03/21","Chi phí sửa chữa",219702000));
        dataList.add(new bc_data("31/04/21","Chi phí sửa chữa",239917797));
        dataList.add(new bc_data("31/05/21","Chi phí sửa chữa",187259500));
        dataList.add(new bc_data("31/06/21","Chi phí sửa chữa",54478500));
        dataList.add(new bc_data("31/07/21","Chi phí sửa chữa",113112600));

    }
}
