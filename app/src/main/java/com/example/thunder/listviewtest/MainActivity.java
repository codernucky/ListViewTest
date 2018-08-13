package com.example.thunder.listviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Phone> phoneList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPhoneList();
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        PhoneAdapter phoneAdapter=new PhoneAdapter(phoneList);
        recyclerView.setAdapter(phoneAdapter);
    }
    private void initPhoneList(){
        Phone xiaomi=new Phone("小米", R.drawable.xiaomi);
        phoneList.add(xiaomi);
        Phone meizu=new Phone("魅族", R.drawable.meizu);
        phoneList.add(meizu);
        Phone chuizi=new Phone("锤子", R.drawable.chuizi);
        phoneList.add(chuizi);
        Phone yijia=new Phone("一加", R.drawable.yijia);
        phoneList.add(yijia);
        Phone huawei=new Phone("华为", R.drawable.huawei);
        phoneList.add(huawei);
        Phone oppo=new Phone("OPPO", R.drawable.oppo);
        phoneList.add(oppo);
        Phone vivo=new Phone("VIVO", R.drawable.vivo);
        phoneList.add(vivo);
        Phone htc=new Phone("HTC", R.drawable.htc);
        phoneList.add(htc);
        Phone apple=new Phone("苹果", R.drawable.apple);
        phoneList.add(apple);
        Phone sanxing=new Phone("三星", R.drawable.sanxing);
        phoneList.add(sanxing);
        Phone lg=new Phone("LG", R.drawable.lg);
        phoneList.add(lg);
        Phone sony=new Phone("索尼", R.drawable.sony);
        phoneList.add(sony);
        Phone sharp=new Phone("夏普", R.drawable.sharp);
        phoneList.add(sharp);
    }
}
