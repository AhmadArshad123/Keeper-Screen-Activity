package com.example.keeper_screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Adapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<CardData> list= getDataOwner();
        recyclerView = findViewById(R.id.rv_keeper_card_holder);
        adapter=new Adapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(adapter);
    }



    public List<CardData> getDataOwner()
    {
        List<CardData> list = new ArrayList<>();
        list.add(new CardData("0045", "Assigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Unassigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Assigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Unassigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Assigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Assigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Unassigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Assigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Unassigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        list.add(new CardData("0045", "Assigned",
                "12-12-2021", "46899", "Lorem Ipsum"));

        return list;
    }
}