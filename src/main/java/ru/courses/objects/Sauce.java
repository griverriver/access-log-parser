package ru.courses.objects;

public class Sauce {
    private String name;
    private Spiciness spiciness;

    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    public String toString() {
        return "Соус " + name + ": " + spiciness.s;
    }
}
