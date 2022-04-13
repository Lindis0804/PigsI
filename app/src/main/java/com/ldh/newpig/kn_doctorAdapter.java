package com.ldh.newpig;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class kn_doctorAdapter  extends RecyclerView.Adapter<kn_doctorAdapter.ItemViewHolder>{
    List<kn_doctor> doctorList;
    private kn_itemClickListener itemClickListener;

    public kn_doctorAdapter(List<kn_doctor> doctorList, kn_itemClickListener itemClickListener) {
        this.doctorList = doctorList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.kn_doctor_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
         kn_doctor doctor = doctorList.get(position);
         holder.kn_item_imageView_coverImage.setImageResource(doctor.getCoverImage());
         holder.kn_item_imageView_avatar.setImageResource(doctor.getAvatar());
         holder.kn_item_textView_name.setText(doctor.getName());
         holder.kn_item_textView_like.setText(doctor.getLike()+" lượt thích");
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private ImageView kn_item_imageView_coverImage,kn_item_imageView_avatar;
        private TextView kn_item_textView_name,kn_item_textView_like;
        private Button kn_item_button;
        private kn_itemClickListener _itemClickListener;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            kn_item_imageView_coverImage = itemView.findViewById(R.id.kn_item_imageView_coverImage);
            kn_item_imageView_avatar = itemView.findViewById(R.id.kn_item_imageView_avatar);
            kn_item_textView_name = itemView.findViewById(R.id.kn_item_textView_name);
            kn_item_textView_like = itemView.findViewById(R.id.kn_item_textView_like);
            kn_item_button = itemView.findViewById(R.id.kn_item_button_ketnoi);
            _itemClickListener = itemClickListener;
            kn_item_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    _itemClickListener.onItemClick(getAdapterPosition());
                }
            });
        }
    }

}
