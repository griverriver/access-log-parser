package ru.courses.objects.animals;

public abstract class Bird implements SingSong{
    protected String birdName;
    protected String song;

    public Bird(String birdName, String song){
        this.birdName = birdName;
        this.song = song;
    }
}