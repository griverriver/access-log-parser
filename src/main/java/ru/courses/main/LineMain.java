package ru.courses.main;

import ru.courses.math.geometry.Point1;

public class LineMain {
    public static void main(String[] args) {
        Point1 point1 = new Point1(1, 3);
        Point1 point2 = new Point1(5, 8);
        Line a = new Line(point1, point2);
        Line b = new Line(10, 11, 15, 19);
        Line c = new Line(point2, point1);
        System.out.println(c);
        a.a2.x += 2;
        a.a2.y += 3;
        b.a1.x += 4;
        b.a1.y += 5;
        System.out.println("Линия 3 после изменения: " + c);
        double sum = getLength(a.a1.x, a.a1.y, a.a2.x, a.a2.y)
                + getLength(b.a1.x, b.a1.y, b.a2.x, b.a2.y)
                + getLength(c.a1.x, c.a1.y, c.a2.x, c.a2.y);
        System.out.println("Суммарная длина всех трех линий = " + sum);
    }

    public static double getLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
