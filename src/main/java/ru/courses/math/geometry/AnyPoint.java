package ru.courses.math.geometry;

import java.util.Arrays;

public class AnyPoint {
    private int[] points;
    private String color;
    private String time;

    public AnyPoint(int... points){
        this.points = new int [points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = points[i];
        }
    }

    public AnyPoint setColor(String color) {
        this.color = color;
        return this;
    }

    public AnyPoint setTime(String time) {
        this.time = time;
        return this;
    }

    public AnyPoint setNewCoordinate(int[] points) {
        this.points = points;
        return this;
    }

    public String toString() {
        return "Точка с координатами: " + Arrays.toString(points) + ", цвет: " + color + ", время: " + time;
    }
}


//Необходимо разработать класс, который позволят создавать Точки координат с разными характеристиками.
//Например, мы можем иметь точки координат со следующими характеристиками:
//Одна, две или три координаты в пространстве (X,Y,Z: целые числа)
//Цвет точки (строка)
//Время появления точки (строка)
//Обратите внимание, что эти характеристики не составляют исчерпывающий список (так как в
//будущем могут появиться новые характеристики) и могут составлять любые комбинации, например:
//
//Например:
//
//Точка в координате 3, красного цвета
//Точка в координате {4,2,5} в 11:00
//Точка в координате {7,7} в 15:35, желтого цвета
//