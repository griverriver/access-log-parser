class Line implements Measurable{
    Point1 a1;
    Point1 a2;
    Point1[] points;


    Line(int x1, int y1, int x2, int y2) {
        this.a1 = new Point1(x1,y1);
        this.a2 = new Point1(x2,y2);
        new Line(a1, a2);
    }

    Line(Point1... points){
        this.points = points;
    }

    public String toString() {
        return "Линия от " + a1 + " до " + a2;
    }

    public double getLength(){
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length -1; i++) {
            len1 = points[i].x - points[i+1].x;
            len2 = points[i].y - points[i+1].y;
            sum += Math.sqrt(len1*len1+len2*len2);
        }
        return sum;
    }
}
