package ru.courses.math.geometry;

public class Line implements ru.courses.Measurable{
    private Point1 a1;
    private Point1 a2;
    private Point1[] points;

    public Point1 getA1() {
        return a1;
    }

    public Point1 getA2() {
        return a2;
    }

    public void setA1(Point1 a1) {
        this.a1 = a1;
    }

    public void setA2(Point1 a2) {
        this.a2 = a2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.a1 = new Point1(x1,y1);
        this.a2 = new Point1(x2,y2);
        new Line(a1, a2);
    }

    public Line(Point1... points){
        this.points = points;
    }

    public String toString() {
        return "Линия от " + a1 + " до " + a2;
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
}
