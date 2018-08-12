package com.example.thunder.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //显示数据
    private String[] data={"小米","魅族","锤子","一加","华为","OPPO","VIVO","HTC","苹果","三星","LG","索尼","夏普"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找到listView实例
        ListView listView=(ListView)findViewById(R.id.list_view);
        //创建适配器
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
    }
}
