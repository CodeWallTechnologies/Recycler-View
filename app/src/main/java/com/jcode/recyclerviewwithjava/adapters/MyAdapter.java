package com.jcode.recyclerviewwithjava.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jcode.recyclerviewwithjava.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {




    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        Context context = parent.getContext();
//        View view = LayoutInflater.from(context).inflate(R.layout.items,parent,false);
//        MyViewHolder myViewHolder = new MyViewHolder(view);
//        return myViewHolder;

        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false));

//        Context context1 = parent.getContext();
//        View view = LayoutInflater.from(context1).inflate(R.layout.testing_list_item,parent,false);
//        MyViewHolder myViewHolder = new MyViewHolder(view);
//        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}


