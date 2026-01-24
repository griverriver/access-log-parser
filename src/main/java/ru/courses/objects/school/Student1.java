package ru.courses.objects.school;

import java.util.ArrayList;
import java.util.List;

public final class Student1 {
    private List<Integer> grades=new ArrayList<>();
    private String name;
    private Gradable gradeRule;

    public Student1(String name, Gradable gradeRule) {
        this.name = name;
        this.gradeRule = gradeRule;
    }
    public void addGrade(int grade){
        if(this.gradeRule.isGradable(grade)) grades.add(grade);
    }

    public String toString() {
        return "Student{" + " grades =" + grades + ", name=" + name + '}';
    }
}

//Студент состоит из списка оценок, и имени, которое задается при создании объекта студента.
// Оценки можно добавлять в список, но только если это значение в диапазоне от 2 до 5.
// Измените этот класс таким образом, чтобы правило определения корректной оценки можно было
// задавать во время создания объекта студента. Обратите внимание, что наследоваться от Студента
// нельзя ни при каких обстоятельствах. Правило корректности может быть любым, например все
// четные числа в диапазоне от 1 до 100 000.
