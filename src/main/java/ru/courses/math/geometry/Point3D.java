package ru.courses.math.geometry;

public class Point3D extends Point1 {
    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z=z;

    }
    public String toString() {
        return "{" + this.getX() + ";" + this.getY() + ";" + this.z + '}';
    }
}
