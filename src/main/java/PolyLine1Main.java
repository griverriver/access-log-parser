public class PolyLine1Main {
    public static void main(String[] args) {
        Point1 point1 = new Point1(2, 6);
        Point1 point2 = new Point1(7, 4);
        Point1 point3 = new Point1(3, 9);
        Point1 point4 = new Point1(5, 1);
        Point1 point5 = new Point1(4, 7);
        PolyLine1 polyLine1 = new PolyLine1(point1, point2, point3, point4, point5);
        ClosedPolyLine polyLine2 = new ClosedPolyLine(point1, point2, point3, point4, point5);
        System.out.println(polyLine1);
        System.out.println(polyLine2);
        System.out.println(polyLine1.length());
        System.out.println(polyLine2.length());
    }
}
