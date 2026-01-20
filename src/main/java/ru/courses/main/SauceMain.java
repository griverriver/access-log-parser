package ru.courses.main;

import ru.courses.objects.Sauce;
import ru.courses.objects.Spiciness;

public class SauceMain {
    public static void main(String[] args) {
        Sauce sauce1 = new Sauce("Барбекю", Spiciness.SPICY);
        Sauce sauce2 = new Sauce("Сырный", Spiciness.NOTSPICY);
        Sauce sauce3 = new Sauce("Буффало", Spiciness.VERYSPICY);
        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);
    }
}
