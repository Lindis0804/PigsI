package com.ldh.newpig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import java.util.List;

public class BaiVietAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<kn_BaiViet> baiVietList;
    kn_itemClickListener itemClickListener;
    public BaiVietAdapter(Context context, int layout, List<kn_BaiViet> baiVietList,kn_itemClickListener itemClickListener) {
        this.context = context;
        this.layout = layout;
        this.baiVietList = baiVietList;
        this.itemClickListener = itemClickListener;
    }

    @Override
    public int getCount() {
        return baiVietList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    public class BaiVietHolder{
        ImageView avatar;
        TextView name,newPerson,lastAccess,title,content,like,comment;
        ImageButton iB_like,iB_mark;
        kn_itemClickListener _itemClickListener;
        CardView cardView;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        BaiVietHolder holder;
        if (view==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new BaiVietHolder();
            holder.cardView = view.findViewById(R.id.kn_npi_cardView);
            holder.avatar = view.findViewById(R.id.kn_npi_imageView_avatar);
            holder.name = view.findViewById(R.id.kn_npi_textView_name);
            holder.newPerson = view.findViewById(R.id.kn_npi_textView_isOld);
            holder.lastAccess = view.findViewById(R.id.kn_npi_textView_time_access);
            holder.title = view.findViewById(R.id.kn_npi_textView_title);
            holder.content = view.findViewById(R.id.kn_npi_textView_content);
            holder.like = view.findViewById(R.id.kn_npi_textView_num_like);
            holder.comment = view.findViewById(R.id.kn_npi_textView_num_comment);
            holder.iB_like = view.findViewById(R.id.kn_item_imageButton_like);
            holder.iB_mark = view.findViewById(R.id.kn_item_imageButton_mark);
            holder._itemClickListener = itemClickListener;
            view.setTag(holder);
        }
        else{
            holder =(BaiVietHolder) view.getTag();
        }
        kn_BaiViet baiViet = baiVietList.get(i);
        holder.avatar.setImageResource(baiViet.getAvatar());
        holder.name.setText(baiViet.getName());
        holder.newPerson.setVisibility(baiViet.isOld()? View.GONE : View.VISIBLE);
        holder.lastAccess.setText(baiViet.getTimeLastAccess()+" phút trước");
        holder.title.setText(baiViet.getTitle());
        holder.content.setText(baiViet.getContent());
        holder.like.setText(baiViet.getNumOfLike()+"");
        holder.comment.setText(baiViet.getNumOfComment()+"");
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder._itemClickListener.onItemClick(i);
            }
        });
        return view;
    }
}
