package ru.courses.math.geometry;

import java.util.Objects;

public class Line implements ru.courses.Measurable, Cloneable{
    private Point1 start;
    private Point1 end;
    private Point1[] points;

    public Point1 getStart() {
        return start;
    }

    public Point1 getEnd() {
        return end;
    }


    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point1(x1,y1);
        this.end = new Point1(x2,y2);
        new Line(start, end);
    }

    public Line(Point1 start, Point1 end) {
        this.start = start;
        this.end = end;
    }

    public Line(Point1... points){
        this.points = points;
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
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

    //Line
    /*public static double getLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }*/

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return start.equals(line.start) && end.equals(line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.start,this.end);
    }

    @Override
    public Line clone() {
        try {
            return new Line(start.clone(),end.clone());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
