package com.ldh.newpig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;


import java.util.List;

public class SLSPAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<ThongTinSLSP> sqlpList;

    public SLSPAdapter(Context context, int layout, List<ThongTinSLSP> sqlpList) {
        this.context = context;
        this.layout = layout;
        this.sqlpList = sqlpList;
    }

    @Override
    public int getCount() {
        return sqlpList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    public class SLSPViewHolder{
        ImageView imgV_isSelected;
        TextView txtV_sp;
        ConstraintLayout cl;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        SLSPViewHolder viewHolder;
        if (view==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            viewHolder = new SLSPViewHolder() ;
            viewHolder.imgV_isSelected = view.findViewById(R.id.ct_ncc_imgV_isSelected);
            viewHolder.txtV_sp = view.findViewById(R.id.ct_ncc_slsp);
            viewHolder.cl = view.findViewById(R.id.ct_ncc_constraintLayout);
            view.setTag(viewHolder);
        }
        else{
            viewHolder = (SLSPViewHolder) view.getTag();
        }
        ThongTinSLSP sp = sqlpList.get(i);
        viewHolder.txtV_sp.setText(sp.getTenSP()+"("+sp.getSqlp()+")");
        viewHolder.cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqlpList.get(i).setSelected(!sp.isSelected());
            }
        });
        viewHolder.imgV_isSelected.setVisibility(sqlpList.get(i).isSelected()==true ? View.VISIBLE : View.GONE);
        return view;
    }
}
