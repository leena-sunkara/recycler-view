package com.example.animaldetails;

public class Animal {
    private int image;
    private String name;
    private String sound;

    public Animal(int image, String name, String sound) {
        this.image = image;
        this.name = name;
        this.sound = sound;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
}
