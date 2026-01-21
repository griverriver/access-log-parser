package ru.courses.basics;

public class ClassesMethods {
    public static double fraction(double x) {
        return x - (int) x;
    }

    public static int sumLastNums(int x) {
        int a = x % 10;
        int b = (x / 10) % 10;
        return a + b;
    }

    public static int charToNum(char x) {
        return (int) x;
    }

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static boolean is2Digits(int x) {
        return (x > 9) && (x < 100);
    }

    public static boolean isUpperCase(char x) {
        return (x >= 'A') && (x <= 'Z');
    }

    public static boolean isInRange(int a, int b, int num) {
        return ((num >= a) && (num <= b)) || ((num >= b) && (num <= a));
    }

    public static boolean isDivisor(int a, int b) {
        return (a % b == 0) || (b % a == 0);
    }

    public static boolean isEqual(int a, int b, int c) {
        return (a == b) && (b == c);
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
}
