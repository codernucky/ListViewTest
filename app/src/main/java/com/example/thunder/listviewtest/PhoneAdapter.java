package com.example.thunder.listviewtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.ViewHolder>{
    private List<Phone> mPhoneList;
    public PhoneAdapter(List<Phone> phoneList){
        mPhoneList=phoneList;
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView phoneImage;
        TextView phoneName;
        public ViewHolder(View view){
            super(view);
            phoneImage=(ImageView)view.findViewById(R.id.phone_image);
            phoneName=(TextView)view.findViewById(R.id.phone_name);
        }
    }

    //加载phone_item子布局，并创建ViewHolder获取该子布局
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.phone_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }
    //为子布局赋值，在子项被滚动到屏幕内的时候执行
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Phone phone=mPhoneList.get(position);
        holder.phoneName.setText(phone.getName());
        holder.phoneImage.setImageResource(phone.getImageID());
    }
    //获取子项数目
    @Override
    public int getItemCount() {
        return mPhoneList.size();
    }
}


