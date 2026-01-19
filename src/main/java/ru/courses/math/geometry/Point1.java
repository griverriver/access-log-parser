package ru.courses.math.geometry;

public class Point1 {
    int x, y;

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

public class Point3D extends Point1 {
    int z;
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z=z;

    }
    public String toString() {
        return "{" + x + ";" + y + ";" + z + '}';
    }
}