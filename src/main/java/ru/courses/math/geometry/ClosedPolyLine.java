package ru.courses.math.geometry;

public class ClosedPolyLine extends PolyLine1{
    public ClosedPolyLine(Point1... points){
        this.points = new Point1[points.length+1];
        System.arraycopy(points, 0, this.points, 0, points.length);
        this.points[points.length] = points[0];
    }
}
