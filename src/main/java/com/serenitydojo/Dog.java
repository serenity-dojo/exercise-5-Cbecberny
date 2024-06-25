package com.serenitydojo;

public class Dog extends Pet {
    private String favoriteToy;
    private int age;
    private boolean isFed = false;
    private String name;

    public static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFed() {
        return isFed;
    }

    // Exercise 4
    public String makeNoise() {return DOG_NOISE;}

    @Override
    public String play() {
        return "plays with bone";
    }

    public void feed() {
        this.isFed = true;
    }
}
