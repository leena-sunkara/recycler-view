package com.example.animaldetails;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private ArrayList<Animal> animalList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        buildRecyclerViewData();
        setRecyclerView();
    }

    private void buildRecyclerViewData() {
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
        animalList.add(new Animal(R.drawable.image, "Animal Name", "Animal Sound"));
    }

    private void setRecyclerView() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(animalAdapter);
    }

    @Override
    public void onClick(Animal animal, int position) {
        Toast.makeText(getApplicationContext(), animal.getName(), Toast.LENGTH_SHORT).show();
    }
}