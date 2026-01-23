package ru.courses.objects;

import java.util.Objects;

public class Department {
    String departmentName;
    Employee boss;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Департамент: " + departmentName + ", начальник: " + boss.employeeName;
    }

    public void setBoss(Employee boss) {
        if (Objects.equals(departmentName, boss.department.departmentName)) {
            this.boss = boss;
        } else {
            throw new IllegalArgumentException("Начальник отдела должен работать в том отделе, где он начальник");
        }
    }
}
