package com.example.thunder.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PhoneAdapter extends ArrayAdapter<Phone>{
    private int resourceID;
    public PhoneAdapter(Context context, int textViewResourceId, List<Phone> objects){
        super(context,textViewResourceId,objects);
        resourceID=textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Phone phone=getItem(position);//获取当前项的Phone实例
        View view= LayoutInflater.from(getContext()).inflate(resourceID,parent,false);
        ImageView phoneImage=(ImageView)view.findViewById(R.id.phone_image);
        TextView phoneName=(TextView)view.findViewById(R.id.phone_name);
        phoneImage.setImageResource(phone.getImageID());
        phoneName.setText(phone.getName());
        return view;
    }
}
