package ru.courses.math;

import ru.courses.objects.Fraction;

import java.util.*;

public class SumAll {
    public static void main(String[] args) {
        int i1 = 2;
        Fraction f1 = new Fraction(3, 5);
        double d1 = 2.3;
        double d2 = 3.6;
        Fraction f2 = new Fraction(49, 12);
        int i2 = 3;
        Fraction f3 = new Fraction(3, 2);
        Fraction f4 = new Fraction(1, 3);
        int i3 = 1;
        ArrayList<Number> numSet1 = new ArrayList<>(Arrays.asList(i1, f1, d1));
        ArrayList<Number> numSet2 = new ArrayList<>(Arrays.asList(d2, f2, i2, f3));
        ArrayList<Number> numSet3 = new ArrayList<>(Arrays.asList(f4, i3));
        System.out.println(SumAll(numSet1));
        System.out.println(SumAll(numSet2));
        System.out.println(SumAll(numSet3));
    }

    public static double SumAll(ArrayList<Number> numSet) {
        double sum = 0;
        for (Number number : numSet) {
            sum = sum + number.doubleValue();
        }

        return sum;
    }
}
