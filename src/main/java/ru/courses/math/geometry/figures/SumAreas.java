package ru.courses.math.geometry.figures;

public class SumAreas {
    public static double sumAreas(Figure... figures){
        double sum = 0;
        for (Figure figure: figures) {
            sum += figure.getArea();
        }
        return sum;
    }
}