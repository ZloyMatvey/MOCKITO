package ru.netology.stats;

public class Movies {
    private String name;

    public String setName(String newName) {
        name = newName;
        return name;
    }

    public Movies(String name) {

        this.name = setName(name);
    }
}
