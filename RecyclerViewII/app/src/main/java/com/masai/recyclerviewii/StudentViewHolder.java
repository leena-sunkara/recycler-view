package com.masai.recyclerviewii;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvStudentImg;
    private TextView mTvName, mTvAge, mTvDob, mTvAddress;
    private RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;

    public StudentViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvStudentImg = itemView.findViewById(R.id.ivStudentImg);
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvDob = itemView.findViewById(R.id.tvDob);
        mTvAddress = itemView.findViewById(R.id.tvAddress);
        relativeLayout = itemView.findViewById(R.id.relativeLayout);
    }
    public void setData(Student student) {
        mIvStudentImg.setImageResource(student.getImageId());
        mTvName.setText(student.getName());
        mTvDob.setText(student.getDob());
        mTvAge.setText(student.getAge() + "");
        mTvAddress.setText(student.getAddress());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(student, getAdapterPosition());
            }
        });
    }
}
