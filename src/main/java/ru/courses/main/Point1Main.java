package ru.courses.main;

import ru.courses.math.geometry.Point1;
import ru.courses.math.geometry.Point3D;

public class Point1Main {
    public static void main(String[] args) {
        Point1 point1 = new Point1(2,6);
        Point1 point2 = new Point3D(7,4,9);
        point1.coordinates();
        point2.coordinates();
    }
}
