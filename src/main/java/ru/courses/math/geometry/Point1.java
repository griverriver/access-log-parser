package ru.courses.math.geometry;



public class Point1 {
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
}

