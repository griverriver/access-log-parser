package ru.courses.math.geometry;

public class Square {
    private Point1 leftUpPoint;
    private int sideLength;

    public Square(int leftUpX, int leftUpY, int sideLength){
        this(new Point1(leftUpX,leftUpY), sideLength);
    }

    public Square(Point1 leftUpPoint, int sideLength){
        if (sideLength > 0) {
            this.sideLength = sideLength;
        } else {
            throw new IllegalArgumentException("sideLength must be positive");
        }
        this.leftUpPoint = leftUpPoint;
    }

    public String toString() {
        return "Квадрат в точке " + this.leftUpPoint + " со стороной " + sideLength;
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
