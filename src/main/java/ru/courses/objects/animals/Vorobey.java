package ru.courses.objects.animals;

public class Vorobey extends Bird{
    public Vorobey(){
        super("Воробей", "чырык");
    }

    @Override
    public void sing(){
        System.out.println(song);
    }
}