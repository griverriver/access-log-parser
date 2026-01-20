package ru.courses.math.geometry;

public class ClosedPolyLine extends PolyLine1{
    public ClosedPolyLine(Point1... points){
        this.setPoints(new Point1[points.length + 1]);
        System.arraycopy(points, 0, this.getPoints(), 0, points.length);
        this.getPoints()[points.length] = points[0];
    }
}
