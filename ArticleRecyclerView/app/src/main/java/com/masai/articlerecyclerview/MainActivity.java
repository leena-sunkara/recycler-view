package com.masai.articlerecyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<Article> articleList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildArticleList();
        setArticleView();
    }

    private void buildArticleList() {

        Article article01 = new Article(R.drawable.economy, "Krishna Veera", "India's GDP growth surged",
                "GDP rises 8.2% in first quarter, highest in two years. India retained "
                        + "its position as world's fastest growing economy.");
        articleList.add(article01);

        Article article02 = new Article(R.drawable.pubg, "First Post", "Battlegrounds Mobile " +
                "India launched", "Soon after two days of launch, Battlegrounds Mobile " +
                "surpasses 1 crore downloads on Google Play Store.");
        articleList.add(article02);

        Article article03 = new Article(R.drawable.smoking, "Nihal", "Ban smoking or get NOC",
                "BNP asked restaurants to ban smoking on their premises or seek a " +
                        "no-objection certificate.");
        articleList.add(article03);

        Article article04 = new Article(R.drawable.rupee, "Gaurav", "Rupee hits fresh record low",
                "India's rupee hits all-time low of 70.82 against US dollar, " +
                        "making it worst performing currency in Asia.");
        articleList.add(article04);

        Article article05 = new Article(R.drawable.jio, "Gizbot", "Jio Phone to give tough fight to " +
                "affordable smartphones", "The competition is likely to increase as " +
                "Reliance Jio is all set to bring its ultra-affordable " +
                "smartphones.");
        articleList.add(article05);

    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void setArticleView() {
        ArticleAdapter articleAdapter = new ArticleAdapter(articleList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(articleAdapter);
    }
}