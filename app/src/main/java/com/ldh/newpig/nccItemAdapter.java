package com.ldh.newpig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class nccItemAdapter  extends BaseAdapter{
    private Context context;
    private int layout;
    private ArrayList<nhaCungCap> nhaCungCapArrayList;

    public nccItemAdapter(Context context, int layout, ArrayList<nhaCungCap> nhaCungCapArrayList) {
        this.context = context;
        this.layout = layout;
        this.nhaCungCapArrayList = nhaCungCapArrayList;
    }

    @Override
    public int getCount() {
        return nhaCungCapArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    public class NCCViewHolder{
        ImageView imageView;
        TextView textView_name,textView_slsp;

    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        NCCViewHolder holder;
        if (view==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new NCCViewHolder();
            holder.imageView = view.findViewById(R.id.ncc_item_imgV);
            holder.textView_name = view.findViewById(R.id.ncc_item_ten_cty);
            holder.textView_slsp = view.findViewById(R.id.ncc_item_so_sp);
            view.setTag(holder);
        }
        else{
            holder = (NCCViewHolder) view.getTag();
        }
        nhaCungCap ncc = nhaCungCapArrayList.get(i);
        holder.imageView.setImageResource(ncc.getImage());
        holder.textView_name.setText(ncc.getTenCongTy());
        holder.textView_slsp.setText("("+ncc.getSoSanPham()+" sản phẩm)");
        return view;
    }
}
