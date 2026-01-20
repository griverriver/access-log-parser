package ru.courses.objects;

public enum Spiciness {
    VERYSPICY("очень острый"), SPICY("острый"), NOTSPICY("не острый");
    String s;
    Spiciness(String s) {
        this.s = s;
    }
}
