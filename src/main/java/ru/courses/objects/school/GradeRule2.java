package ru.courses.objects.school;

public class GradeRule2 implements Gradable {
    @Override
    public boolean isGradable(int grade) {
        return grade % 2 == 0 && grade >= 1 && grade <= 100000;
    }
}
