package ru.courses.main;

import ru.courses.Measurable;
import ru.courses.basics.*;
import ru.courses.courseproject.FileReader;
import ru.courses.math.SumAll;
import ru.courses.math.geometry.*;
import ru.courses.math.geometry.figures.*;
import ru.courses.math.geometry.figures.Rectangle;
import ru.courses.objects.*;
import ru.courses.math.Exponentiation;
import ru.courses.objects.animals.*;
import ru.courses.objects.school.Gradable;
import ru.courses.objects.school.GradeRule1;
import ru.courses.objects.school.GradeRule2;
import ru.courses.objects.school.Student1;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static ru.courses.math.geometry.PolyLineConstr.getLength;
import static ru.courses.math.geometry.PolyLineConstr.getLines;

public class Main {
    public static void main(String[] args) {
        //______________________________________________________________________________________________________
        //Stream API - Замена for на forEach
        /*ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,8,10,43));
        Streams.printList(list);*/

        //______________________________________________________________________________________________________
        //Stream API - Преобразование потока строк в строку
        /*ArrayList<String> list = new ArrayList<>(Arrays.asList("Hello", "how", "are", "you"));
        System.out.println(Streams.getStringFromStream(list.stream()));*/

        //______________________________________________________________________________________________________
        //Collection - Замена массива на ArrayList
        /*int amountElement = 10;
        ArrayList<Integer> intList = new ArrayList<>(amountElement);
        for (int i = 0; i < amountElement; i++) {
            intList.add(i+1);
        }
        System.out.println(intList);
        System.out.println(Collections.reverse(intList));*/

        //______________________________________________________________________________________________________
        //Collection - Замена ArrayList на массив
        /*int[] intArray = new int[]{5,9,1,3,4,0,33,8,12,45};
        System.out.println(Arrays.toString(Collections.bubbleSort(intArray)));*/

        //______________________________________________________________________________________________________
        //Collection - попарные перестановки
        /*int amountElement = 6;
        ArrayList<Integer> intList = new ArrayList<>(amountElement);
        for (int i = 0; i < amountElement; i++) {
            intList.add(i+1);
        }
        System.out.println(intList);
        for (int i = 0; i < intList.size(); i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(i+1));
            intList.set(i+1, temp);
            i++;
        }
        System.out.println(intList);*/

        //______________________________________________________________________________________________________
        //GradeRule
        /*Gradable GradeRule1 = new GradeRule1();
        Gradable GradeRule2 = new GradeRule2();
        Student1 student1 = new Student1("Игорь", GradeRule1);
        Student1 student2 = new Student1("Игорь", GradeRule2);
        student1.addGrade(4);
        student1.addGrade(9);
        student2.addGrade(22);
        student2.addGrade(-8);
        System.out.println(student1);
        System.out.println(student2);*/

        //______________________________________________________________________________________________________
        //AnyPoint
        /*AnyPoint point1 = new AnyPoint(3);
        AnyPoint point2 = new AnyPoint(8,4).setColor("красный");
        AnyPoint point3 = new AnyPoint(8,4,22).setColor("желтый").setTime("12:22");
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);*/

        //______________________________________________________________________________________________________
        //Figures
        /*Square square = new Square(4,7,5);
        Rectangle rectangle = new Rectangle(2,5,9,2);
        Circle circle = new Circle(9,1,6);
        System.out.println(square.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println(SumAreas.sumAreas(square, rectangle, circle));*/

        //______________________________________________________________________________________________________
        //Birds
        /*Bird kukushka1 = new Kukushka();
        Bird kukushka2 = new Kukushka();
        Bird parrot1 = new Parrot("привет");
        Bird parrot2 = new Parrot("привет");
        Bird parrot3 = new Parrot("привет");
        Bird vorobey1 = new Vorobey();
        Bird vorobey2 = new Vorobey();
        Bird vorobey3 = new Vorobey();
        Bird vorobey4 = new Vorobey();

        kukushka1.sing();
        parrot1.sing();
        vorobey1.sing();

        MassSinging.massSinging(kukushka1, kukushka2, parrot1, parrot2, parrot3, vorobey1, vorobey2,
                vorobey3, vorobey4);*/

        //______________________________________________________________________________________________________
        //Measurable MyString
        /*MyString myString = new MyString("молоко");
        System.out.println(myString.getLength());*/

        //______________________________________________________________________________________________________
        //Measurable
        /*Point1 pointPolyLine1 = new Point1(2, 6);
        Point1 pointPolyLine2 = new Point1(7, 4);
        Point1 pointPolyLine3 = new Point1(3, 9);
        Point1 pointPolyLine4 = new Point1(5, 1);
        Point1 pointPolyLine5 = new Point1(4, 7);
        Point1 pointPolyLine6 = new Point1(4, 7);
        Measurable polyLine1 = new PolyLine1(pointPolyLine1, pointPolyLine6, pointPolyLine3, pointPolyLine4, pointPolyLine5);
        Measurable polyLine3 = new ClosedPolyLine(pointPolyLine1, pointPolyLine2, pointPolyLine3, pointPolyLine4, pointPolyLine5);
        System.out.println(polyLine1);
        System.out.println(polyLine3);
        System.out.println(polyLine1.getLength());
        System.out.println(polyLine3.getLength());*/

        //______________________________________________________________________________________________________
        // Employee
        /*Department department1 = new Department("Строительство");
        Department department2 = new Department("Продажи");
        Employee employee1 = new Employee("Ирина", department1);
        Employee employee2 = new Employee("Виктор", department1);
        department1.setBoss(employee1);
        //department2.setBoss(employee1);
        System.out.println(department1);
        System.out.println(employee1);
        System.out.println(employee2);*/

        //______________________________________________________________________________________________________
        //Square
        /*Square square1 = new Square(3,7,4);
        //Square square2 = new Square(3,7,-4);
        System.out.println(square1);
        square1.setSideLength(9);
        square1.setLeftUpPoint(new Point1(6,22));
        System.out.println(square1);*/

        //______________________________________________________________________________________________________
        //City
        /*City cityA = new City("A");
        City cityB = new City("B");
        City cityC = new City("C");
        City cityD = new City("D");
        City cityE = new City("E");
        City cityF = new City("F", List.of(new Route(cityB, 1), new Route(cityE, 2)));
        cityA.AddRoute(cityB, 5);
        cityA.AddRoute(cityF, 1);
        cityA.AddRoute(cityD, 6);
        cityB.AddRoute(cityA, 5);
        cityB.AddRoute(cityC, 3);
        cityC.AddRoute(cityB,3);
        cityC.AddRoute(cityD,4);
        cityD.AddRoute(cityC,4);
        cityD.AddRoute(cityE,2);
        cityD.AddRoute(cityA,6);
        cityE.AddRoute(cityF,2);

        System.out.println(cityB.travelBy(1));
        System.out.println(cityB.travelBy(2));
        System.out.println(cityB.travelBy(3));*/

        //______________________________________________________________________________________________________
        //Point1
        /*Point1 point1 = new Point1(3, 7);
        java.awt.Point point2 = new Point(8, 9);
        System.out.println(point1);
        System.out.println(point2);

        System.out.println("Введите первое число:");
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
        /*Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);
        System.out.println(f1.sum(f2).sum(f3).minus(5));*/

        //______________________________________________________________________________________________________
        //Line
        /*Line a = new Line(1,5,8,3);
        Line b = a.clone();
        System.out.println(a==b);
        System.out.println(a.equals(b));

        Line c = new Line(point2, point1);
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
        /*Point1 point3 = new Point1(7,2);
        Point1 point4 = new Point1(2,6);
        System.out.println(point3.equals(point4));
        Point1 point5 = point3.clone();
        System.out.println(point3==point5);
        System.out.println(point3.equals(point5));*/

        //______________________________________________________________________________________________________
        //Point
        /*PointConstr a1 = new PointConstr(1, 3);
        PointConstr a2 = new PointConstr(1, 3);
        PointConstr a3 = new PointConstr(5, 8);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("a1 == a2 " + (a1 == a2));
        System.out.println("a2 == a3 " + (a2 == a3));
        System.out.println("a1 == a3 " + (a1 == a3));*/

        //______________________________________________________________________________________________________
        //PolyLine1
        /*Point1 pointPolyLine1 = new Point1(2, 6);
        Point1 pointPolyLine2 = new Point1(7, 4);
        Point1 pointPolyLine3 = new Point1(3, 9);
        Point1 pointPolyLine4 = new Point1(5, 1);
        Point1 pointPolyLine5 = new Point1(4, 7);
        Point1 pointPolyLine6 = new Point1(4, 7);
        Measurable polyLine1 = new PolyLine1(pointPolyLine1, pointPolyLine6, pointPolyLine3, pointPolyLine4, pointPolyLine5);
        Measurable polyLine2 = new PolyLine1(pointPolyLine1, pointPolyLine2, pointPolyLine3, pointPolyLine4, pointPolyLine6);
        System.out.println(polyLine1.equals(polyLine2));

        Measurable polyLine3 = new ClosedPolyLine(pointPolyLine1, pointPolyLine2, pointPolyLine3, pointPolyLine4, pointPolyLine5);
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
        /*Sauce sauce1 = new Sauce("Барбекю", Spiciness.SPICY);
        Sauce sauce2 = new Sauce("Сырный", Spiciness.NOTSPICY);
        Sauce sauce3 = new Sauce("Буффало", Spiciness.VERYSPICY);
        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);*/

        //______________________________________________________________________________________________________
        //Student
        /*Student student1 = new Student("Алиса", new ArrayList<>(List.of(5, 4, 3, 5)));
        Student student2 = new Student("Петр");

        System.out.println(student1);
        System.out.println(student2);
        student2.addGrade(4);
        System.out.println("Оценки student2: " + student2.getGrades());
        student2.addGrade(8);*/

        //______________________________________________________________________________________________________
        //Sum
        /*String[] strArray = {"3.6","8","dkjfh84","4"};
        double sumsum = 0;
        for (String s : strArray) {
            try {
                sumsum += Double.parseDouble(s);
            }
            catch (NumberFormatException ex) {
                ex = new NumberFormatException("Это не число: " + s);
                System.out.println(ex);
            }
        }
        for (String s : strArray) {
            if (s.matches("-?\\d+(\\.\\d+)?")) {
                sumsum += Double.parseDouble(s);
            }
        }
        System.out.println(sumsum);*/

        //______________________________________________________________________________________________________
        //Exponentiation
        /*String x = "5";
        String y = "2";
        Exponentiation.exponentiation(x,y);
        System.out.println(Exponentiation.exponentiation(x,y));*/

        //______________________________________________________________________________________________________
        //SumAll
        /*int i1 = 2;
        Fraction fra1 = new Fraction(3, 5);
        double d1 = 2.3;
        double d2 = 3.6;
        Fraction fra2 = new Fraction(49, 12);
        int i2 = 3;
        Fraction fra3 = new Fraction(3, 2);
        Fraction fra4 = new Fraction(1, 3);
        int i3 = 1;
        ArrayList<Number> numSet1 = new ArrayList<>(Arrays.asList(i1, fra1, d1));
        ArrayList<Number> numSet2 = new ArrayList<>(Arrays.asList(d2, fra2, i2, fra3));
        ArrayList<Number> numSet3 = new ArrayList<>(Arrays.asList(fra4, i3));
        System.out.println(SumAll.SumAll(numSet1));
        System.out.println(SumAll.SumAll(numSet2));
        System.out.println(SumAll.SumAll(numSet3));*/

        //______________________________________________________________________________________________________
        //Array
        /*int [] arr = {4,2,7,5,7,1,5};
        System.out.println(Array.findFirst(arr,5));

        int[] arr2 = {4, 7, 5, 2, 1, 5, 3};
        System.out.println(Array.findLast(arr2, 5));

        int[] arr3 = {4,6,2,-7};
        System.out.println(Array.maxAbs(arr3));

        int[] arr4 = {4, 1, 2, -7, 8};
        System.out.println(Array.countPositive(arr4));

        int[] arr5 = {6, 4, 7, 2, 7, 4, 6};
        System.out.println(Array.palindrom(arr5));

        int[] arr6 = {4,6,8,3};
        Array.reverse(arr6);

        int[] arr7 = {4,7,2,6};
        System.out.println(Arrays.toString(Array.reverseBack(arr7)));

        int[] arr8 = {1, 2, 3};
        int[] arr8_1 = {7, 8, 9};
        System.out.println(Arrays.toString(Array.concat(arr8, arr8_1)));

        int[] arr9 = {1, 2, 3, 2, 6, 7, 2};
        System.out.println(Arrays.toString(Array.findAll(arr9, 2)));

        int[] arr10 = {1, 2, -3, -2, 6, 7, -2};
        System.out.println(Arrays.toString(Array.deleteNegative(arr10)));

        int[] arr11 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(Array.add(arr11, 99, 3)));

        int[] arr12 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr12_1 = {98, 99, 100};
        System.out.println(Arrays.toString(Array.addMas(arr12, arr12_1, 3)));*/

        //______________________________________________________________________________________________________
        //ClassesMethods
        /*System.out.printf("%.3f%n", ClassesMethods.fraction(6.37279));
        System.out.println(ClassesMethods.sumLastNums(723648223));
        System.out.println(ClassesMethods.charToNum('0'));
        System.out.println(ClassesMethods.isPositive(-43));
        System.out.println(ClassesMethods.is2Digits(47));
        System.out.println(ClassesMethods.isUpperCase('R'));
        System.out.println(ClassesMethods.isInRange(6, 1, 4));
        System.out.println(ClassesMethods.isDivisor(4, 7));
        System.out.println(ClassesMethods.isEqual(3, 3, 3));

        int numSum = ClassesMethods.lastNumSum(5, 11);
        numSum = ClassesMethods.lastNumSum(numSum, 123);
        numSum = ClassesMethods.lastNumSum(numSum, 14);
        numSum = ClassesMethods.lastNumSum(numSum, 1);
        System.out.println(numSum);*/

        //______________________________________________________________________________________________________
        //ConditionalStatements
        /*System.out.println(ConditionalStatements.abs(8));
        System.out.println(ConditionalStatements.safeDiv(12, 0));
        System.out.println(ConditionalStatements.max(4, 8));
        System.out.println(ConditionalStatements.makeDecision(9, 9));
        System.out.println(ConditionalStatements.max3(4, 7, 9));
        System.out.println(ConditionalStatements.sum3(2, 5, 7));
        System.out.println(ConditionalStatements.sum2(5, 5));
        System.out.println(ConditionalStatements.is35(5));
        System.out.println(ConditionalStatements.magic6(1, 6));
        System.out.println(ConditionalStatements.age(24));
        System.out.println(ConditionalStatements.day(5));
        ConditionalStatements.printDays("среда");*/

        //______________________________________________________________________________________________________
        //Loops
        /*System.out.println(Loops.listNums(8));
        System.out.println(Loops.reverseListNums(5));
        System.out.println(Loops.chet(8));
        System.out.println(Loops.pow(2, 5));
        System.out.println(Loops.numLen(53942));
        System.out.println(Loops.equalNum(5555));
        Loops.square(4);
        Loops.leftTriangle(4);
        Loops.rightTriangle(5);
        Loops.guessGame();*/

        //______________________________________________________________________________________________________
        //AccessLogParser
        /*Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Введите путь к файлу");
            String path = scanner.nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists || isDirectory) {
                System.out.println("Файл не существует или указанный путь является путём к папке");
                continue;
            }
            System.out.println("Путь указан верно");
            count++;
            System.out.println("Это файл номер " + count);
        }*/

        //2d - 6th version
        FileReader.FileReaderMethod();
    }
}
