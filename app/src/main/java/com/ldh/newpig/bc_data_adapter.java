package com.ldh.newpig;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class bc_data_adapter extends BaseAdapter {
    Context context;
    int layout;
    List<bc_data> dataList;

    public bc_data_adapter(Context context, int layout, List<bc_data> dataList) {
        this.context = context;
        this.layout = layout;
        this.dataList = dataList;
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    public class ViewHolder{
        TextView ngayhoadon,tenchiphi,tongtien;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.ngayhoadon = view.findViewById(R.id.ngay_hoa_don);
            holder.tenchiphi = view.findViewById(R.id.ten_chi_phi);
            holder.tongtien = view.findViewById(R.id.tong_tien);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }
        bc_data data = dataList.get(i);
        holder.ngayhoadon.setText(data.getNgay_hoa_don());
        holder.tenchiphi.setText(data.getTen_chi_phi());
        holder.tongtien.setText(data.getTong_tien()+"");
        return view;
    }
}
