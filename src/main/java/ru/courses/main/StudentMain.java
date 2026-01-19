package ru.courses.main;

import ru.courses.objects.Student;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Алиса", new ArrayList<>(List.of(5, 4, 3, 5)));
        Student student2 = new Student("Петр");

        System.out.println(student1);
        System.out.println(student2);
        student2.addGrade(4);
        System.out.println("Оценки student2: " + student2.getGrades());
        student2.addGrade(8);
    }
}
