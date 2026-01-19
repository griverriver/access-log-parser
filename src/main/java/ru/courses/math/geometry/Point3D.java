package ru.courses.math.geometry;

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
