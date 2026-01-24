package ru.courses.objects.school;

public class GradeRule1 implements Gradable {

    @Override
    public boolean isGradable(int grade) {
        return grade >= 2 && grade <= 5;
    }
}
