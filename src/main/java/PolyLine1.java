import java.util.Arrays;

class PolyLine1 {
    Point1[] points;

    public PolyLine1(Point1... points){
        this.points = points;
    }
    public double length(){
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length -1; i++) {
            len1 = points[i].x - points[i+1].x;
            len2 = points[i].y - points[i+1].y;
            sum += Math.sqrt(len1*len1+len2*len2);
        }
        return sum;
    }
    public String toString() {
        return Arrays.toString(this.points);
    }
}

class ClosedPolyLine extends PolyLine1{
    public ClosedPolyLine(Point1... points){
        this.points = new Point1[points.length+1];
        System.arraycopy(points, 0, this.points, 0, points.length);
        this.points[points.length] = points[0];
    }
}

