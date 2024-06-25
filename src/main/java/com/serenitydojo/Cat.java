package com.serenitydojo;

public class Cat extends Pet {
    private String name;
    private String favoriteToy;
    private int age;

    public Cat(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;

    }

    public String getName() {
        return name;
    }

    @Override
    public String play() {
        return "plays with string";
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
}
