package com.ldh.newpig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class bc_pig_data_adapter extends BaseAdapter {
    Context context;
    int layout;
    List<bc_pig_data> dataList;

    public bc_pig_data_adapter(Context context, int layout, List<bc_pig_data> dataList) {
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
        TextView ngay_hoa_don,tong_tl,tong_xc,tong_chet,doanh_thu;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new ViewHolder();
            holder.ngay_hoa_don = view.findViewById(R.id.ngay_hoa_don);
            holder.tong_tl = view.findViewById(R.id.tong_tl);
            holder.tong_xc = view.findViewById(R.id.tong_xc);
            holder.tong_chet = view.findViewById(R.id.tong_chet);
            holder.doanh_thu = view.findViewById(R.id.doanh_thu);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }
        bc_pig_data data = dataList.get(i);
        holder.ngay_hoa_don.setText(data.getNgayhoadon());
        holder.tong_tl.setText(data.getTongTL()+"");
        holder.tong_xc.setText(data.getTongXC()+"");
        holder.tong_chet.setText(data.getTongchet()+"");
        holder.doanh_thu.setText(data.getTongTL()*200000+"");
        return view;
    }
}
