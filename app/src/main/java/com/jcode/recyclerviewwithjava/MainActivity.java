package com.jcode.recyclerviewwithjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jcode.recyclerviewwithjava.adapters.MyAdapter;
import com.jcode.recyclerviewwithjava.models.LessonModels;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LessonModels object1 = new LessonModels("Java");
        LessonModels object2 = new LessonModels("JavaScript");
        LessonModels object3 = new LessonModels("Php");
        LessonModels object4 = new LessonModels("Laravel");
        LessonModels object5 = new LessonModels("Node Js");
        LessonModels object6 = new LessonModels("React JS");
        LessonModels object7 = new LessonModels("Python");
        LessonModels object8 = new LessonModels("Dart");


        //arraylist[] = {object1,object2,object3,....}
        ArrayList<LessonModels> arrayList = new ArrayList<>();
        arrayList.add(object1);
        arrayList.add(object2);
        arrayList.add(object3);
        arrayList.add(object4);
        arrayList.add(object5);
        arrayList.add(object6);
        arrayList.add(object7);
        arrayList.add(object8);

        //Arraylist<String> arraylist = new ArrayList(); add("thuralin)'



        recyclerView = findViewById(R.id.rv_testing);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
      //  LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,true);
        recyclerView.setLayoutManager(gridLayoutManager);
        MyAdapter myAdapter = new MyAdapter(arrayList);
        recyclerView.setAdapter(myAdapter);
//        recyclerView.setHasFixedSize(true);

    }
}

