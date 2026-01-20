package ru.courses.main;

import ru.courses.math.geometry.Point1;
import ru.courses.math.geometry.Point3D;

public class Point1Main {
    public static void main(String[] args) {
        Point1 point1 = new Point1(7,2);
        Point1 point2 = new Point1(2,6);
        System.out.println(point1.equals(point2));
        Point1 point3 = point1.clone();
        System.out.println(point1==point3);
        System.out.println(point1.equals(point3));
    }
}
