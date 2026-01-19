package ru.courses.math.geometry;

public class PointConstr {
    int x;
    int y;

    public PointConstr(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + '}';
    }
}
