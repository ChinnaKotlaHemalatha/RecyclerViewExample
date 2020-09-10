package com.example.myandroid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context ctx;
    int[] images;
    String[] names;
    String[] api;
    String[] date;

    public MyAdapter(Context ctx,String[] names,String[] api,String[] date,int[] images) {
        this.ctx = ctx;
        this.names = names;
        this.api = api;
        this.date = date;
        this.images = images;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(ctx).inflate(R.layout.every_row_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.img.setImageResource(images[position]);
    holder.name.setText(names[position]);
    holder.ap.setText(api[position]);
    holder.dat.setText(date[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name,ap,dat;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img_view);
            name=itemView.findViewById(R.id.name);
            ap=itemView.findViewById(R.id.api);
            dat=itemView.findViewById(R.id.date);
        }
    }
}
