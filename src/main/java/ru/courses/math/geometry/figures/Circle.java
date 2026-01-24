package ru.courses.math.geometry.figures;

import ru.courses.math.geometry.Point1;

public class Circle extends Figure {
    private Point1 leftUpPoint;
    private int radius;

    public Circle(int leftUpX, int leftUpY, int radius) {
        super(leftUpX, leftUpY, radius);
    }

    public Circle(Point1 leftUpPoint, int radius) {
        super(leftUpPoint, radius);
    }

    public String toString() {
        return "Круг с точкой в центре " + this.leftUpPoint + " и радиусом " + this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.getSideLengthOrRadius(), 2);
    }
}
