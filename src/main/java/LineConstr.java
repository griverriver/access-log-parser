class LineConstr {
    PointConstr a1;
    PointConstr a2;


    LineConstr(int x1, int y1, int x2, int y2) {
        this.a1 = new PointConstr(x1,y1);
        this.a2 = new PointConstr(x2,y2);
    }

    LineConstr(PointConstr a1, PointConstr a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public String toString() {
        return "Линия от " + a1 + " до " + a2;
    }
}