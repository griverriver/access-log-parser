package ru.courses.math.geometry;

public class Point1 {
    public int x;
    public int y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void coordinates() {
        System.out.println(this);
    }

    public String toString() {
        return "{" + x + ";" + y + '}';
    }
}

