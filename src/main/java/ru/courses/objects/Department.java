package ru.courses.objects;

import java.util.Objects;

public class Department {
    private String departmentName;
    private Employee boss;

    public Department(String departmentName, Employee boss) {
        if (Objects.equals(departmentName, boss.getDepartment().getDepartmentName())) {
            this.departmentName = departmentName;
            this.boss = boss;
        } else {
            throw new IllegalArgumentException("Начальник отдела должен работает в том отделе, где он начальник");
        }
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Департамент: " + departmentName + ", начальник: " + boss.getEmployeeName();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        if (Objects.equals(departmentName, boss.getDepartment().getDepartmentName())) {
            this.boss = boss;
        } else {
            throw new IllegalArgumentException("Начальник отдела должен работать в том отделе, где он начальник");
        }
    }
}
