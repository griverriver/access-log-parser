package ru.courses.math;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Exponentiation {
    public static void main(String[] args) {
        String x = "5";
        String y = "2";
        System.out.println(exponentiation(x,y));
    }
    public static double exponentiation(String x, String y) {
        return pow(parseInt(x), parseInt(y));
    }
}
