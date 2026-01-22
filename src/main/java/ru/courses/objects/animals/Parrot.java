package ru.courses.objects.animals;

public class Parrot extends Bird{
    public Parrot(String txt){
        super("Попугай", txt);
    }

    @Override
    public void sing(){
        int rnd = (int) ((((song.length() - 1) + 1) * Math.random()) + 1); //((((max - min) + 1) * Math.random()) + min)
        System.out.println(song.subSequence(0, rnd));
    }
}