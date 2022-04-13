package com.ldh.newpig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class kn_ctncc_food_adapter extends BaseAdapter {
    Context context;
    int layout;
    List<kn_ctncc_food_item> foodList;

    public kn_ctncc_food_adapter(Context context, int layout, List<kn_ctncc_food_item> foodList) {
        this.context = context;
        this.layout = layout;
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    public class FoodViewHolder{
        ImageView imageView;
        TextView txt_name,txt_price;
        ImageButton tim,cart;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        FoodViewHolder holder;
        if (view==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder = new FoodViewHolder();
            holder.imageView = view.findViewById(R.id.imageView_food);
            holder.txt_name = view.findViewById(R.id.textView_name);
            holder.txt_price = view.findViewById(R.id.textView_price);
            holder.tim = view.findViewById(R.id.button_tim);
            holder.cart = view.findViewById(R.id.button_cart);
            view.setTag(holder);
        }
        else{
            holder = (FoodViewHolder) view.getTag();
        }
        kn_ctncc_food_item item = foodList.get(i);
        holder.imageView.setImageResource(item.getImage());
        holder.txt_name.setText(item.getName());
        String s = item.getPrice()+" VNĐ/BAO";
        holder.txt_price.setText(s);
        return view;
    }
}
