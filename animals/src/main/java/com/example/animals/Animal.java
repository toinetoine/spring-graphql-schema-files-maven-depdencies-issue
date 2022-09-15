package com.example.animals;

public class Animal {
    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    private String name;
}
