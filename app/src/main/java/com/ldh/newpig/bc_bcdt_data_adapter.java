package com.ldh.newpig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class bc_bcdt_data_adapter extends BaseAdapter {
    Context context;
    int layout;
    List<bc_bcdt_data_item> dataList;

    public bc_bcdt_data_adapter(Context context, int layout, List<bc_bcdt_data_item> dataList) {
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
        TextView thoi_gian,chi_phi,doanh_thu,loi_nhuan;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.thoi_gian = view.findViewById(R.id.thoi_gian);
            holder.chi_phi = view.findViewById(R.id.chi_phi);
            holder.doanh_thu = view.findViewById(R.id.doanh_thu);
            holder.loi_nhuan = view.findViewById(R.id.loi_nhuan);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }
        bc_bcdt_data_item data = dataList.get(i);
        holder.thoi_gian.setText(data.getThoiGian());
        holder.chi_phi.setText(data.getChiPhi()+"");
        holder.doanh_thu.setText(data.getDoanhThu()+"");
        holder.loi_nhuan.setText(data.getLoiNhuan()+"");
        return view;
    }
}
