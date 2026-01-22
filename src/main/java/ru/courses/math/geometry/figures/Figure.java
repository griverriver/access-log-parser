package ru.courses.math.geometry.figures;

import ru.courses.math.geometry.Point1;

public abstract class Figure implements AreaMeasurable {
    protected Point1 leftUpPoint;
    protected int sideLengthOrRadius;
    protected int sideLength2;


    public Figure(int leftUpX, int leftUpY, int sideLengthOrRadius) {
        this(new Point1(leftUpX, leftUpY), sideLengthOrRadius);
    }

    public Figure(int leftUpX, int leftUpY, int sideLength, int sideLength2) {
        this(new Point1(leftUpX, leftUpY), sideLength, sideLength2);
    }

    public Figure(Point1 leftUpPoint, int sideLength, int sideLength2) {
        if ((sideLength > 0) && (sideLength2 > 0)) {
            this.sideLengthOrRadius = sideLength;
            this.sideLength2 = sideLength2;
        } else {
            throw new IllegalArgumentException("sideLength must be positive");
        }
        this.leftUpPoint = leftUpPoint;
    }

    public Figure(Point1 leftUpPoint, int sideLengthOrRadius) {
        if (sideLengthOrRadius > 0) {
            this.sideLengthOrRadius = sideLengthOrRadius;
        } else {
            throw new IllegalArgumentException("sideLength must be positive");
        }
        this.leftUpPoint = leftUpPoint;
    }



    public int getSideLengthOrRadius() {
        return sideLengthOrRadius;
    }

    public int getSideLength2() {
        return sideLength2;
    }
}
