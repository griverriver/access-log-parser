package ru.courses.main;

import ru.courses.math.geometry.Point1;
import ru.courses.math.geometry.Line;

public class LineMain {
    public static void main(String[] args) {
        Line a = new Line(1,5,8,3);
        Line b = a.clone();
        System.out.println(a==b);
        System.out.println(a.equals(b));

        /*Line c = new Line(point2, point1);
        System.out.println(c);
        a.getEnd().setX(a.getEnd().getX() + 2);
        a.getEnd().setY(a.getEnd().getY() + 3);
        b.getStart().setX(b.getStart().getX() + 4);
        b.getStart().setY(b.getStart().getY() + 5);
        System.out.println("Линия 3 после изменения: " + c);
        double sum = getLength(a.getStart().getX(), a.getStart().getY(), a.getEnd().getX(), a.getEnd().getY())
                + getLength(b.getStart().getX(), b.getStart().getY(), b.getEnd().getX(), b.getEnd().getY())
                + getLength(c.getStart().getX(), c.getStart().getY(), c.getEnd().getX(), c.getEnd().getY());
        System.out.println("Суммарная длина всех трех линий = " + sum);
    }

    public static double getLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));*/
    }
}
