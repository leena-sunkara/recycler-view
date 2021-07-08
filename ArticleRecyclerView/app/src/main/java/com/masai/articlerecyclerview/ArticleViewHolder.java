package com.masai.articlerecyclerview;

import android.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
    private ImageView mArticleImage;
    private TextView mAuthor, mTitle, mDescription;

    public ArticleViewHolder(@NonNull View itemView) {
        super(itemView);
        iniViews(itemView);
    }

    private void iniViews(View itemView) {
        mArticleImage = itemView.findViewById(R.id.ivArticleImage);
        mAuthor = itemView.findViewById(R.id.tvAuthor);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mDescription = itemView.findViewById(R.id.tvDescription);
    }

    public void setData(Article article) {
        mArticleImage.setBackgroundResource(article.getImage());
        mAuthor.setText(article.getAuthor());
        mTitle.setText(article.getTitle());
        mDescription.setText(article.getDescription());

        mArticleImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), "Author: " + article.getAuthor(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
