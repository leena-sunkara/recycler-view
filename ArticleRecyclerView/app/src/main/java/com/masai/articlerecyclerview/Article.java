package com.masai.articlerecyclerview;

public class Article {

    private final int image;
    private final String author;
    private final String title;
    private final String description;

    public Article(int image, String author, String title, String description) {
        this.image = image;
        this.author = author;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
