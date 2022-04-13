package com.ldh.newpig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class bc_qldt_data_adapter extends BaseAdapter {
    Context context;
    int layout;
    List<bc_qldh_data_item> dataList;

    public bc_qldt_data_adapter(Context context, int layout, List<bc_qldh_data_item> dataList) {
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
        TextView maso,ngayNX,nhapXuat,giong;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.maso = view.findViewById(R.id.ma_so);
            holder.ngayNX = view.findViewById(R.id.ngayNX);
            holder.nhapXuat = view.findViewById(R.id.nhap_xuat);
            holder.giong = view.findViewById(R.id.giong);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }
        bc_qldh_data_item data = dataList.get(i);
        holder.maso.setText(data.getMaSo());
        holder.ngayNX.setText(data.getNgayNX());
        holder.nhapXuat.setText(data.getNhapXuat());
        holder.giong.setText(data.getGiong());
        return view;
    }
}
