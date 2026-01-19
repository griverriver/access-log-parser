package ru.courses.main;

/*import java.util.ArrayList;

public class PolyLineMain {
    static ArrayList<Line> linesList = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<PointConstr> pointsList = new ArrayList<>();
        PointConstr a1 = new PointConstr(1, 5);
        PointConstr a2 = new PointConstr(2, 8);
        PointConstr a3 = new PointConstr(5, 3);
        PointConstr a4 = new PointConstr(8, 9);
        pointsList.add(a1);
        pointsList.add(a2);
        pointsList.add(a3);
        pointsList.add(a4);
        PolyLineConstr plc = new PolyLineConstr(pointsList);
        System.out.println(plc);

        double sum = 0;
        for (int i = 0; i < pointsList.size() - 1; i++) {
            PointConstr p1 = pointsList.get(i);
            PointConstr p2 = pointsList.get(i + 1);
            sum += getLength(p1.x, p1.y, p2.x, p2.y);
        }
        System.out.println("Длина Ломаной = " + sum);

        Line a = new Line(a1, a2);
        Line b = new Line(a2, a3);
        Line c = new Line(a3, a4);
        getLines(a);
        getLines(b);
        getLines(c);
        System.out.println("Массив Линий: " + linesList);

        System.out.println("Длина массива Линий = " + linesList.size());

        System.out.println("Длина массива Линий (" + linesList.size()
                + ") == Количество линий в Ломаной (" + (plc.pointsList.size() - 1)
                + ") = " + ((linesList.size()) == (plc.pointsList.size() - 1)));

        a2.x = 12;
        System.out.println("\nПосле изменения точки {2,8}.\nТочка a2: "
                + a2 + ".\nЛоманая: " + plc + ".\nЛинии массива: " + linesList);

    }


    public static double getLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void getLines(Line line) {
        linesList.add(line);
    }
}*/