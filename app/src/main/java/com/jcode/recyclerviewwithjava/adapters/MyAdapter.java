package com.jcode.recyclerviewwithjava.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jcode.recyclerviewwithjava.R;
import com.jcode.recyclerviewwithjava.models.LessonModels;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

     ArrayList<LessonModels> arrayList;

    public MyAdapter(ArrayList<LessonModels> arrayList) {
        this.arrayList = arrayList;
    }

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

        LessonModels currentObject = arrayList.get(position);



        holder.textView.setText((position+1)+"");
        holder.objects.setText(currentObject.getLessons());
    }

    @Override
    public int getItemCount() {
        return 7;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView,objects;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.numbers);
            objects = itemView.findViewById(R.id.objects);
        }
    }

}


