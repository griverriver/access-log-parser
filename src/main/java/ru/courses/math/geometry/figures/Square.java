package ru.courses.math.geometry.figures;

import ru.courses.math.geometry.Point1;

public class Square extends Figure {
    private Point1 leftUpPoint;
    private int sideLength;

    public Square(int leftUpX, int leftUpY, int sideLength) {
        super(leftUpX, leftUpY, sideLength);
    }

    public Square(Point1 leftUpPoint, int sideLength) {
        super(leftUpPoint, sideLength);
    }

    public String toString() {
        return "Квадрат в точке " + this.leftUpPoint + " со стороной " + this.sideLength;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getSideLengthOrRadius(), 2);
    }


    public Point1 getLeftUpPoint() {
        return leftUpPoint;
    }

    public void setLeftUpPoint(Point1 leftUpPoint) {
        this.leftUpPoint = leftUpPoint;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}
