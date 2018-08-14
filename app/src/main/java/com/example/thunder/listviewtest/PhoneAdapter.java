package com.example.thunder.listviewtest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.ViewHolder>{
    private List<Phone> mPhoneList;
    public PhoneAdapter(List<Phone> phoneList){
        mPhoneList=phoneList;
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        View phoneView;
        ImageView phoneImage;
        TextView phoneName;
        public ViewHolder(View view){
            super(view);
            phoneView=view;
            phoneImage=(ImageView)view.findViewById(R.id.phone_image);
            phoneName=(TextView)view.findViewById(R.id.phone_name);
        }
    }

    //加载phone_item子布局，并创建ViewHolder获取该子布局
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.phone_item,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        holder.phoneView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                Phone phone=mPhoneList.get(position);
                Toast.makeText(v.getContext(),"You clicked view"+phone.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        holder.phoneImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position=holder.getAdapterPosition();
                Phone phone=mPhoneList.get(position);
                Toast.makeText(view.getContext(),"You clicked image"+phone.getName(),Toast.LENGTH_SHORT).show();
            }
        });
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


