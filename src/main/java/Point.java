public class Point {
    public static void main(String[] args) {
        PointConstr a1 = new PointConstr(1, 3);
        PointConstr a2 = new PointConstr(1, 3);
        PointConstr a3 = new PointConstr(5, 8);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("a1 == a2 " + (a1 == a2));
        System.out.println("a2 == a3 " + (a2 == a3));
        System.out.println("a1 == a3 " + (a1 == a3));
    }
}


