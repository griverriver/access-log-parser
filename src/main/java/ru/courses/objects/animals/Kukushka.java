package ru.courses.objects.animals;

public class Kukushka extends Bird{
    public Kukushka(){
        super("Кукушка", "ку-ку");
    }

    @Override
    public void sing(){
        int rnd = (int) ((10 * Math.random()) + 1); //((((max - min) + 1) * Math.random()) + min)
        for (int i = 0; i < rnd; i++) {
            System.out.println(song);
        }
    }
}