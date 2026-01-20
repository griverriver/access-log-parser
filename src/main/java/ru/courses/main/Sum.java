package ru.courses.main;

import ru.courses.basics.Array;

public class Sum {
    public static void main(String[] args) {
        String[] strArray = {"3.6","8","dkjfh84","4"};
        double sum = 0;
        /*for (String s : strArray) {
            try {
                sum += Double.parseDouble(s);
            }
            catch (NumberFormatException ex) {
                ex = new NumberFormatException("Это не число: " + s);
                System.out.println(ex);
            }
        }*/

        for (String s : strArray) {
            if (s.matches("-?\\d+(\\.\\d+)?")) {
                sum += Double.parseDouble(s);
            }
        }
        System.out.println(sum);
    }
}
