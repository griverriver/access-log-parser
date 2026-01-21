package ru.courses.main;

import ru.courses.Measurable;
import ru.courses.math.geometry.*;
import ru.courses.objects.Fraction;
import ru.courses.objects.Sauce;
import ru.courses.objects.Spiciness;
import ru.courses.objects.Student;
import ru.courses.basics.Array;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ru.courses.math.geometry.PolyLineConstr.getLength;
import static ru.courses.math.geometry.PolyLineConstr.getLines;

public class Main {
    public static void main(String[] args) {
        Point1 point1 = new Point1(3, 7);
        java.awt.Point point2 = new Point(8, 9);
        System.out.println(point1);
        System.out.println(point2);

        /*System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();
        int sum = number1 + number2;
        int diff = number1 - number2;
        int product = number1 * number2;
        double quotient = (double) number1 / number2;
        System.out.println("Сумма двух чисел = " + sum);
        System.out.println("Разность двух чисел = " + diff);
        System.out.println("Произведение двух чисел = " + product);
        System.out.println("Частное двух чисел = " + quotient);*/

        //______________________________________________________________________________________________________
        //Fraction
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);
        System.out.println(f1.sum(f2).sum(f3).minus(5));

        //______________________________________________________________________________________________________
        //Line
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
        System.out.println("Суммарная длина всех трех линий = " + sum);*/

        //______________________________________________________________________________________________________
        //Point1
        Point1 point3 = new Point1(7,2);
        Point1 point4 = new Point1(2,6);
        System.out.println(point3.equals(point4));
        Point1 point5 = point3.clone();
        System.out.println(point3==point5);
        System.out.println(point3.equals(point5));

        //______________________________________________________________________________________________________
        //Point
        PointConstr a1 = new PointConstr(1, 3);
        PointConstr a2 = new PointConstr(1, 3);
        PointConstr a3 = new PointConstr(5, 8);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("a1 == a2 " + (a1 == a2));
        System.out.println("a2 == a3 " + (a2 == a3));
        System.out.println("a1 == a3 " + (a1 == a3));

        //______________________________________________________________________________________________________
        //PolyLine1
        Point1 pointPolyLine1 = new Point1(2, 6);
        Point1 pointPolyLine2 = new Point1(7, 4);
        Point1 pointPolyLine3 = new Point1(3, 9);
        Point1 pointPolyLine4 = new Point1(5, 1);
        Point1 pointPolyLine5 = new Point1(4, 7);
        Point1 pointPolyLine6 = new Point1(4, 7);
        Measurable polyLine1 = new PolyLine1(pointPolyLine1, pointPolyLine6, pointPolyLine3, pointPolyLine4, pointPolyLine5);
        Measurable polyLine2 = new PolyLine1(pointPolyLine1, pointPolyLine2, pointPolyLine3, pointPolyLine4, pointPolyLine6);
        System.out.println(polyLine1.equals(polyLine2));

        /*Measurable polyLine3 = new ClosedPolyLine(pointPolyLine1, pointPolyLine2, pointPolyLine3, pointPolyLine4, pointPolyLine5);
        System.out.println(polyLine1);
        System.out.println(polyLine3);
        System.out.println(polyLine1.getLength());
        System.out.println(polyLine3.getLength());*/

        //______________________________________________________________________________________________________
        //PolyLine
        /*ArrayList<PointConstr> pointsList = new ArrayList<>();
        PointConstr a1 = new PointConstr(1, 5);
        PointConstr a2 = new PointConstr(2, 8);
        PointConstr a3 = new PointConstr(5, 3);
        PointConstr a4 = new PointConstr(8, 9);
        pointsList.add(a1);
        pointsList.add(a2);
        pointsList.add(a3);
        pointsList.add(a4);
        PolyLineConstr plc = new PolyLineConstr(pointsList);
        System.out.println(plc);

        double sum = 0;
        for (int i = 0; i < pointsList.size() - 1; i++) {
            PointConstr p1 = pointsList.get(i);
            PointConstr p2 = pointsList.get(i + 1);
            sum += getLength(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        }
        System.out.println("Длина Ломаной = " + sum);

        Line a = new Line(a1, a2);
        Line b = new Line(a2, a3);
        Line c = new Line(a3, a4);
        getLines(a);
        getLines(b);
        getLines(c);
        System.out.println("Массив Линий: " + linesList);

        System.out.println("Длина массива Линий = " + linesList.size());

        System.out.println("Длина массива Линий (" + linesList.size()
                + ") == Количество линий в Ломаной (" + (plc.getPointsList().size() - 1)
                + ") = " + ((linesList.size()) == (plc.getPointsList().size() - 1)));

        a2.setX(12);
        System.out.println("\nПосле изменения точки {2,8}.\nТочка a2: "
                + a2 + ".\nЛоманая: " + plc + ".\nЛинии массива: " + linesList);*/

        //______________________________________________________________________________________________________
        //Sauce
        Sauce sauce1 = new Sauce("Барбекю", Spiciness.SPICY);
        Sauce sauce2 = new Sauce("Сырный", Spiciness.NOTSPICY);
        Sauce sauce3 = new Sauce("Буффало", Spiciness.VERYSPICY);
        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);

        //______________________________________________________________________________________________________
        //Student
        Student student1 = new Student("Алиса", new ArrayList<>(List.of(5, 4, 3, 5)));
        Student student2 = new Student("Петр");

        System.out.println(student1);
        System.out.println(student2);
        student2.addGrade(4);
        System.out.println("Оценки student2: " + student2.getGrades());
        student2.addGrade(8);

        //______________________________________________________________________________________________________
        //Sum
        String[] strArray = {"3.6","8","dkjfh84","4"};
        double sumsum = 0;
        /*for (String s : strArray) {
            try {
                sumsum += Double.parseDouble(s);
            }
            catch (NumberFormatException ex) {
                ex = new NumberFormatException("Это не число: " + s);
                System.out.println(ex);
            }
        }*/
        for (String s : strArray) {
            if (s.matches("-?\\d+(\\.\\d+)?")) {
                sumsum += Double.parseDouble(s);
            }
        }
        System.out.println(sumsum);


    }
}
