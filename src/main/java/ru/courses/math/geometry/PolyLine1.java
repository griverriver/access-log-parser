package ru.courses.math.geometry;

import ru.courses.Measurable;

import java.util.Arrays;
import java.util.Objects;

public class PolyLine1 extends Line implements Measurable {
    private Point1[] points;

    public Point1[] getPoints() {
        return points;
    }

    public void setPoints(Point1[] points) {
        this.points = points;
    }

    public PolyLine1(Point1... points){
        this.points = points;
    }


    public double getLength(){
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length -1; i++) {
            len1 = points[i].getX() - points[i + 1].getX();
            len2 = points[i].getY() - points[i + 1].getY();
            sum += Math.sqrt(len1*len1+len2*len2);
        }
        return sum;
    }
    public String toString() {
        return Arrays.toString(this.points);
    }

    @Override
    public boolean equals(Object o){
        boolean boolEqual = false;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolyLine1 polyline1 = (PolyLine1) o;
        for (int i = 0; i < points.length -1; i++) {
            if (points[i].equals(polyline1.points[i])) {
                boolEqual = true;
            }else{
                boolEqual = false;
                break;
            }
        }
        return boolEqual;
    }
}

