package com.example.animaldetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalVH> {

    private ArrayList<Animal> animallist;
    private ItemClickListener itemClickListener;

    public AnimalAdapter(ArrayList<Animal> animallist, ItemClickListener itemClickListener) {
        this.animallist = animallist;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public AnimalVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new AnimalVH(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalVH holder, int position) {
        holder.setData(animallist.get(position));
    }

    @Override
    public int getItemCount() {
        return animallist.size();
    }

    public class AnimalVH extends RecyclerView.ViewHolder {

        private ImageView mImage;
        private TextView mName;
        private TextView mSound;
        private LinearLayout mLinearLayout;
        private ItemClickListener itemClickListener;

        public AnimalVH(@NonNull View itemView, ItemClickListener itemClickListener) {
            super(itemView);
            this.itemClickListener = itemClickListener;
            initViews(itemView);
        }

        private void initViews(View itemView) {
            mImage = itemView.findViewById(R.id.image);
            mName = itemView.findViewById(R.id.name);
            mSound = itemView.findViewById(R.id.sound);
            mLinearLayout = itemView.findViewById(R.id.linearLayout);
        }

        public void setData(Animal animal) {
            mImage.setImageResource(animal.getImage());
            mName.setText(animal.getName());
            mSound.setText(animal.getSound());
            mLinearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemClickListener.onClick(animal, getAdapterPosition());
                }
            });
        }
    }
}