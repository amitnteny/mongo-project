package com.practice.mongoProject.domain;

public class Cat implements Animal {
    private String name;
    private int age;
    private boolean doesMeow;

    public Cat(String name, int age, boolean doesMeow) {
        this.name = name;
        this.age = age;
        this.doesMeow = doesMeow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDoesMeow() {
        return doesMeow;
    }

    public void setDoesMeow(boolean doesMeow) {
        this.doesMeow = doesMeow;
    }
}
