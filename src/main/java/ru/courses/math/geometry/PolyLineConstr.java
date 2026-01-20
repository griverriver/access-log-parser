package ru.courses.math.geometry;

import java.util.ArrayList;

class PolyLineConstr {
    private ArrayList<PointConstr> pointsList;

    public ArrayList<PointConstr> getPointsList() {
        return pointsList;
    }

    public void setPointsList(ArrayList<PointConstr> pointsList) {
        this.pointsList = pointsList;
    }

    PolyLineConstr() {
        this.pointsList = new ArrayList<>();
    }

    PolyLineConstr(ArrayList<PointConstr> pointsList) {
        this.pointsList = new ArrayList<>();
        this.pointsList.addAll(pointsList);
    }


    public String toString() {
        return "Линия " + this.pointsList;
    }
}
