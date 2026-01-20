package ru.courses.main;

import ru.courses.math.geometry.Point1;
import ru.courses.math.geometry.Line;

public class LineMain {
    public static void main(String[] args) {
        Point1 point1 = new Point1(1, 3);
        Point1 point2 = new Point1(5, 8);
        Line a = new Line(point1, point2);
        Line b = new Line(10, 11, 15, 19);
        Line c = new Line(point2, point1);
        System.out.println(c);
        a.getA2().setX(a.getA2().getX() + 2);
        a.getA2().setY(a.getA2().getY() + 3);
        b.getA1().setX(b.getA1().getX() + 4);
        b.getA1().setY(b.getA1().getY() + 5);
        System.out.println("Линия 3 после изменения: " + c);
        double sum = getLength(a.getA1().getX(), a.getA1().getY(), a.getA2().getX(), a.getA2().getY())
                + getLength(b.getA1().getX(), b.getA1().getY(), b.getA2().getX(), b.getA2().getY())
                + getLength(c.getA1().getX(), c.getA1().getY(), c.getA2().getX(), c.getA2().getY());
        System.out.println("Суммарная длина всех трех линий = " + sum);
    }

    public static double getLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
