package ru.courses.objects.school;

import java.util.*;

public class Student {
    private final String name;
    private final ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();
        if (grades != null) {
            for (int grade : grades)
                if (grade >= 2 && grade <= 5) {
                    this.grades.add(grade);
                }
        }
    }

    public Student(String name) {
        this(name, new ArrayList<>());
    }

    public String toString() {
        return name + ": " + grades;
    }

    public void addGrade(int grade) {
        if (grade >= 2 && grade <= 5) {
            this.grades.add(grade);
        } else {
            throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5");
        }
    }

    public ArrayList<Integer> getGrades() {
        return new ArrayList<>(this.grades);
    }
}
