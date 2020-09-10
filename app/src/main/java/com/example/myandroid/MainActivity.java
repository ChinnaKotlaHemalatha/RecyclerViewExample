package com.example.myandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recycler;
int[] img;
String[] title;
String[] api;
String[] date;
MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.recyclerview);
        title=getResources().getStringArray(R.array.image_title);
        api=getResources().getStringArray(R.array.api);
        date=getResources().getStringArray(R.array.date);
        img=new int[]{
                R.drawable.alpha,R.drawable.beta1,R.drawable.cupcake,
                R.drawable.donut,R.drawable.eclair,R.drawable.froyo,
                R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecream,
                R.drawable.jelly,R.drawable.kitkat,R.drawable.lollipop,
                R.drawable.marshmallow,R.drawable.nougat7,R.drawable.nougat71,
                R.drawable.oreo8,R.drawable.oreo81,R.drawable.pie,R.drawable.android10
        };
        adapter=new MyAdapter(this,title,api,date,img);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);
    }
}