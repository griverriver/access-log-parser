package ru.courses.math.geometry;

import java.util.ArrayList;

public class PolyLineConstr {
    private static ArrayList<Line> linesList = new ArrayList<>();
    private ArrayList<PointConstr> pointsList;

    public ArrayList<PointConstr> getPointsList() {
        return pointsList;
    }

    public void setPointsList(ArrayList<PointConstr> pointsList) {
        this.pointsList = pointsList;
    }

    public static ArrayList<Line> getLinesList() {
        return linesList;
    }

    public PolyLineConstr() {
        this.pointsList = new ArrayList<>();
    }

    public PolyLineConstr(ArrayList<PointConstr> pointsList) {
        this.pointsList = new ArrayList<>();
        this.pointsList.addAll(pointsList);
    }


    public String toString() {
        return "Линия " + this.pointsList;
    }

    public static double getLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void getLines(Line line) {
        linesList.add(line);
    }
}
