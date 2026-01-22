package ru.courses.objects.animals;

public class MassSinging{
    public static void massSinging(Bird... birds){
        for (Bird bird: birds) {
            bird.sing();
        }
    }
}
