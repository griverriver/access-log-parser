package ru.courses.math.geometry;


import java.util.Objects;

public class Point1 implements Cloneable{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }



    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void coordinates() {
        System.out.println(this);
    }

    public String toString() {
        return "{" + x + ";" + y + '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point1 point1 = (Point1) o;
        return Objects.equals(x,point1.x) && Objects.equals(y,point1.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x,this.y);
    }

    @Override
    public Point1 clone() {
        try {
            Point1 p = new Point1(x,y);
            p.x = x;
            p.y = y;
            return p;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

