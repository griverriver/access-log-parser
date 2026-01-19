package ru.courses.math.geometry;

import java.util.ArrayList;

class PolyLineConstr {
    ArrayList<PointConstr> pointsList;


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
