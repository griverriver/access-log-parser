package ru.courses.main;

import ru.courses.math.geometry.Point1;

import java.awt.*;
import java.util.Scanner;

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
    }
}
