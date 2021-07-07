package com.masai.recyclerviewwe;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvName, mTvAge, mTvRollNo;
    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        iniViews(itemView);
    }
    private void iniViews(View itemView) {
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvRollNo = itemView.findViewById(R.id.tvRollNo);
    }

    public void setData(Student student) {
        mTvName.setText(student.getName());
        mTvAge.setText(student.getAge() + "");
        mTvRollNo.setText(student.getRollNo());
    }
}