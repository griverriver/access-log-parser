package ru.courses.math.geometry.figures;

import ru.courses.math.geometry.Point1;

public class Rectangle extends Figure {
    private Point1 leftUpPoint;
    private int sideLength;
    private int sideLength2;

    public Rectangle(int leftUpX, int leftUpY, int sideLength, int sideLength2) {
        super(leftUpX, leftUpY, sideLength, sideLength2);
    }

    public Rectangle(Point1 leftUpPoint, int sideLength, int sideLength2) {
        super(leftUpPoint, sideLength, sideLength2);
    }

    public String toString() {
        return "Прямоугольник в точке " + this.leftUpPoint + " со сторонами " + this.sideLength + " и " + this.sideLength2;
    }

    @Override
    public double getArea() {
        return this.getSideLengthOrRadius() * this.getSideLength2();
    }
}
