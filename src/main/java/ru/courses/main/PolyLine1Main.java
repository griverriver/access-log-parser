package ru.courses.main;

import ru.courses.Measurable;
import ru.courses.math.geometry.ClosedPolyLine;
import ru.courses.math.geometry.Point1;
import ru.courses.math.geometry.PolyLine1;

public class PolyLine1Main {
    public static void main(String[] args) {
        Point1 point1 = new Point1(2, 6);
        Point1 point2 = new Point1(7, 4);
        Point1 point3 = new Point1(3, 9);
        Point1 point4 = new Point1(5, 1);
        Point1 point5 = new Point1(4, 7);
        Point1 point6 = new Point1(4, 7);
        Measurable polyLine1 = new PolyLine1(point1, point6, point3, point4, point5);
        Measurable polyLine2 = new PolyLine1(point1, point2, point3, point4, point6);
        System.out.println(polyLine1.equals(polyLine2));

        /*Measurable polyLine3 = new ClosedPolyLine(point1, point2, point3, point4, point5);
        System.out.println(polyLine1);
        System.out.println(polyLine3);
        System.out.println(polyLine1.getLength());
        System.out.println(polyLine3.getLength());*/
    }
}
