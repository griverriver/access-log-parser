package ru.courses.math;

import ru.courses.objects.Fraction;

import java.util.*;

public class SumAll {
    public static double SumAll(ArrayList<Number> numSet) {
        double sum = 0;
        for (Number number : numSet) {
            sum = sum + number.doubleValue();
        }
        return sum;
    }
}
